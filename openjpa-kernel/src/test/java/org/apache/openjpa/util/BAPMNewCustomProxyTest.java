package org.apache.openjpa.util;

import org.apache.openjpa.test.AValidProxy;
import org.apache.openjpa.test.AnInvalidProxy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.*;

import static org.apache.openjpa.test.ProxyUtils.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class BAPMNewCustomProxyTest extends BAProxyManagerImplUtil {

    private final boolean autoOff;

    public BAPMNewCustomProxyTest(Object orig,
                                  boolean autoOff,
                                  TestOutcome testOutcome,
                                  CheckProxyImplTest checkProxy) {
        this.orig = orig;
        this.autoOff = autoOff;
        this.testOutcome = testOutcome;
        this.checkProxy = checkProxy;
    }

    @Parameterized.Parameters(name = "{index} ⇒ orig={0}, autoOff={1}, outcome={2}")
    public static Collection<Object[]> params() {
        return Arrays.asList(new Object[][]{
                // NC1
                { null,                         false, TestOutcome.NULL,    null },
                // NC2
                { new AValidProxy(),            false, TestOutcome.VALID,   new CheckAValidProxy() },
                // NC2.1
                { new AValidProxy(),            true, TestOutcome.VALID,   new CheckAValidProxy() },
                // NC3
                { getAProxy(),            false, TestOutcome.VALID,   new CheckSameInstance() },
                // NC4
                { new MyPersistentType(),            false, TestOutcome.INVALID,   new CheckSameInstance() },
                { new AnInvalidProxy(),       false, TestOutcome.INVALID, null },
                // NC5
                { createACollection(), false, TestOutcome.VALID, new CheckCollectionProxy() },
                // NC6
                { createASortedCollection(), true,  TestOutcome.VALID, new CheckCollectionProxy() },
                // NC7
                { createAMap(), false, TestOutcome.VALID,   new CheckMapProxy() },
                // NC8
                { createASortedMap(), false, TestOutcome.VALID,   new CheckMapProxy() },
                // NC9
                { new Date(), false, TestOutcome.VALID,   new CheckDateProxy() },
                // NC10
                { new Timestamp(new Date().getTime()), false, TestOutcome.VALID,   new CheckDateProxy() },
                // NC11
                { Calendar.getInstance(),      false, TestOutcome.VALID,   new CheckCalendarProxy() },

                // aggiunto per mutation coverage

                { "abc", false, TestOutcome.INVALID, null },
                {42, false, TestOutcome.INVALID, null },
                { Optional.of("abc"), false, TestOutcome.INVALID, null },
                { Collections.unmodifiableList(Arrays.asList("x", "y")), false, TestOutcome.INVALID, null },
                { Collections.singletonMap("k", "v"), false, TestOutcome.INVALID, null },
                { LocalDate.of(2024, 1, 1), false, TestOutcome.INVALID, null },



        });
    }






    @Test
    public void testNewCustomProxy() {
        Proxy proxy = proxyManager.newCustomProxy(orig, autoOff);

        boolean shouldPass;
        if (testOutcome == TestOutcome.NULL) {
            shouldPass = (proxy == null && orig == null);
        } else if (testOutcome == TestOutcome.INVALID) {
            shouldPass = (proxy == null && orig != null);

        } else {
            assertNotNull(proxy);
            shouldPass = checkProxy.process(orig, proxy);
            shouldPass = shouldPass && orig.equals(proxy);
        }


        assertTrue("orig=" + orig + " autoOff=" + autoOff + " expected " + testOutcome, shouldPass);
    }




    public static class CheckAValidProxy implements CheckProxyImplTest{
        @Override
        public boolean process(Object origin, Object proxy) {
            return origin instanceof AValidProxy && proxy instanceof AValidProxy;
        }
    }



}
