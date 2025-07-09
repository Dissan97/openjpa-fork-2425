package org.apache.openjpa.enhance;


import org.apache.openjpa.util.UserException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class BAFindGetterTest {

    private Class cls;
    private String prop;
    private boolean mustExist;
    private ReflectionUtil.ReflectionOutcome outcome;


    public BAFindGetterTest(Class cls, String prop, boolean mustExist, ReflectionUtil.ReflectionOutcome outcome) {
        this.cls = cls;
        this.prop = prop;
        this.mustExist = mustExist;
        this.outcome = outcome;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {ReflectionUtil.InvalidCandidate.class, "candidate", true, ReflectionUtil.ReflectionOutcome.MISSING},
                {ReflectionUtil.InvalidCandidate.class, "candidate", false, ReflectionUtil.ReflectionOutcome.NULL},
                {ReflectionUtil.AValidCandidate.class, "candidate", true, ReflectionUtil.ReflectionOutcome.VALID},
                {ReflectionUtil.AValidCandidate.class, "candidate", false, ReflectionUtil.ReflectionOutcome.VALID},
                {null, "candidate", false, ReflectionUtil.ReflectionOutcome.NULL},
                {null, "candidate", true, ReflectionUtil.ReflectionOutcome.MISSING},
        });
    }



    @Test
    public void testFindGetter() {
        try{
            Method method = Reflection.findGetter(cls, prop, mustExist);
            if (!outcome.equals(ReflectionUtil.ReflectionOutcome.NULL)) {
                assertNotNull(method);
            }
            String defaultGetter = "get";
            String capitalize = prop.substring(0, 1).toUpperCase() + prop.substring(1);
            // added after code coverage
            if ( method.getName().startsWith("is") && (method.getReturnType().equals(boolean.class) ||
                    method.getReturnType().equals(Boolean.class))) {
                defaultGetter = "is";
            }
            assertEquals(method.getName(), defaultGetter+capitalize);
            assertEquals(ReflectionUtil.ReflectionOutcome.VALID, outcome);
        } catch (Exception e){
            if (outcome.equals(ReflectionUtil.ReflectionOutcome.MISSING)){
                assertTrue(e instanceof UserException);
            } else if (outcome.equals(ReflectionUtil.ReflectionOutcome.NULL)){
                assertTrue(e instanceof NullPointerException);
            }
            else {
                fail();
            }
        }
    }
}
