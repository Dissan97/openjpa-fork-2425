package org.apache.openjpa.util;

import org.apache.openjpa.test.AValidProxy;
import org.apache.openjpa.test.AnInvalidCopy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.time.LocalDate;
import java.util.*;

import static org.apache.openjpa.test.ProxyUtils.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class BAPMCopyTest extends BAProxyManagerImplUtil {


    public BAPMCopyTest(Object orig, TestOutcome testOutcome, CheckProxyImplTest  checkProxy) {
        this.orig = orig;
        this.testOutcome = testOutcome;
        this.checkProxy = checkProxy;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> params() {
        return Arrays.asList(new Object[][]{
                // CC1
                {null, TestOutcome.NULL, null},
                // CC2
                {new AValidProxy(), TestOutcome.VALID, new CheckValidProxy()},
                // CC3
                {new AnInvalidCopy("test", -1), TestOutcome.INVALID, null},
                // CC4
                {getAProxy(), TestOutcome.VALID, new CheckValidProxy()},

                { new MyPersistentType(), TestOutcome.INVALID,   new CheckSameInstance() },
                // CC5
                { createACollection(), TestOutcome.VALID, new BAPMNewCustomProxyTest.CheckCollectionProxy(true) },
                // CC6
                { createAMap(), TestOutcome.VALID, new BAPMNewCustomProxyTest.CheckMapProxy(true) },
                // CC7
                { new Date(),  TestOutcome.VALID,  new BAPMNewCustomProxyTest.CheckDateProxy(true) },
                // CC8
                { Calendar.getInstance(),   TestOutcome.VALID,   new BAPMNewCustomProxyTest.CheckCalendarProxy(true) },
                { "abc", TestOutcome.INVALID, null },
                {42, TestOutcome.INVALID, null },
                { Optional.of("abc"), TestOutcome.INVALID, null },
                { Collections.unmodifiableList(Arrays.asList("x", "y")),  TestOutcome.UNMODIFIED, null },
                { Collections.singletonMap("k", "v"),  TestOutcome.UNMODIFIED, null },
                { LocalDate.of(2024, 1, 1), TestOutcome.INVALID, null },
        });
    }


    @Test
    public void testCopy() {
        boolean shouldPass = false;
        Object proxy = null;
        try {
             proxy = proxyManager.copyCustom(orig);
        } catch (GeneralException e) {
            assertEquals(TestOutcome.UNMODIFIED, testOutcome);
            return;
        }

        // documentation says it returns a copy of the orig passed so must check if this is actually true

        if (testOutcome.equals(TestOutcome.NULL) && proxy == null && orig == null) {
            shouldPass = true;
        }
        else if (testOutcome.equals(TestOutcome.INVALID) && proxy == null && orig != null) {
            shouldPass = true;
        } else {
            shouldPass = checkProxy.process(orig, proxy);
        }

        assertTrue(shouldPass);
    }
}