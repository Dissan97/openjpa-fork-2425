package org.apache.openjpa.util;

import org.apache.openjpa.enhance.FieldConsumer;
import org.apache.openjpa.enhance.FieldSupplier;
import org.apache.openjpa.enhance.PersistenceCapable;
import org.apache.openjpa.enhance.StateManager;
import org.apache.openjpa.test.AValidProxy;
import org.junit.Before;

import java.util.*;


/**
 * Create a proxy that is the copy from original content, and it is used to enhance
 * performance for database serialization
 */

public abstract class BAProxyManagerImplUtil {
    public static final String DEFAULT_NAME = "test_name";
    public static final String DEFAULT_SURNAME = "test_surname";
    public static final long DEFAULT_AGE = 30L;
    protected ProxyManager proxyManager;
    protected Object orig;
    protected TestOutcome testOutcome;
    protected CheckProxyImplTest checkProxy;


    @Before
    public void setUp() {
        proxyManager = new ProxyManagerImpl();
    }




    public interface CheckProxyImplTest{
        boolean process(Object origin, Object proxy );
    }

    public static class CheckValidProxy implements CheckProxyImplTest{

        @Override
        public boolean process(Object origin, Object proxy) {

            if (!(origin instanceof AValidProxy) || !(proxy instanceof AValidProxy)){
                return false;
            }
            AValidProxy aValidProxy = (AValidProxy) proxy;
            AValidProxy orig = (AValidProxy) origin;
            return aValidProxy.getName().equals(orig.getName())
                    && aValidProxy.getSurname().equals(orig.getSurname())
                    && aValidProxy.getAge() == orig.getAge();

        }
    }

    // placeholder implementations for NC* checks:
    public static class CheckSameInstance implements CheckProxyImplTest {
        public boolean process(Object orig, Object proxy) {
            return proxy == orig;
        }
    }
    public static class CheckCollectionProxy implements CheckProxyImplTest {
        boolean isCopy;
        public CheckCollectionProxy(boolean b) {
            this.isCopy = b;
        }

        public CheckCollectionProxy(){
            this(false);
        }
        public boolean process(Object orig, Object proxy) {

            boolean check = Arrays.equals(((Collection<?>)orig).toArray(), ((Collection<?>)proxy).toArray());


            return (proxy instanceof Proxy || isCopy) && check
                    && ((Collection<?>)proxy).size() == ((Collection<?>)orig).size();
        }
    }
    public static class CheckMapProxy implements CheckProxyImplTest {
        boolean isCopy;

        public CheckMapProxy(boolean b) {
            this.isCopy = b;
        }

        public CheckMapProxy() {
            this(false);
        }

        @Override
        public boolean process(Object orig, Object proxy) {
            if (!(orig instanceof Map) || !(proxy instanceof Map)) return false;

            Map<?, ?> originalMap = (Map<?, ?>) orig;
            Map<?, ?> proxyMap = (Map<?, ?>) proxy;

            boolean keyValueEqual = originalMap.equals(proxyMap);

            return (proxy instanceof Proxy || isCopy)
                    && originalMap.size() == proxyMap.size()
                    && keyValueEqual;
        }
    }
    public static class CheckDateProxy implements CheckProxyImplTest {
        boolean isCopy;

        public CheckDateProxy(boolean isCopy) {
            this.isCopy = isCopy;
        }
        public CheckDateProxy(){
            this(false);
        }

        public boolean process(Object orig, Object proxy) {
            return (proxy instanceof Proxy || isCopy)
                    && (((Date)proxy).getTime() == ((Date)orig).getTime());
        }
    }
    public static class CheckCalendarProxy implements CheckProxyImplTest {
        boolean isCopy;

        public CheckCalendarProxy(boolean isCopy) {
            this.isCopy = isCopy;
        }
        public CheckCalendarProxy(){
            this(false);
        }

        public boolean process(Object orig, Object proxy) {
            return (proxy instanceof Proxy || isCopy)
                    && ((Calendar)proxy).getTimeInMillis()
                    == ((Calendar)orig).getTimeInMillis() && ((Calendar)orig).getTimeZone().equals(
                    ((Calendar) proxy).getTimeZone()
            );

        }
    }


    public static class MyPersistentType implements PersistenceCapable{

        private String name = "MyPersistentType";

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public int pcGetEnhancementContractVersion() {
            return 0;
        }

        @Override
        public Object pcGetGenericContext() {
            return null;
        }

        @Override
        public StateManager pcGetStateManager() {
            return null;
        }

        @Override
        public void pcReplaceStateManager(StateManager sm) {

        }

        @Override
        public void pcProvideField(int fieldIndex) {

        }

        @Override
        public void pcProvideFields(int[] fieldIndices) {

        }

        @Override
        public void pcReplaceField(int fieldIndex) {

        }

        @Override
        public void pcReplaceFields(int[] fieldIndex) {

        }

        @Override
        public void pcCopyFields(Object fromObject, int[] fields) {

        }

        @Override
        public void pcDirty(String fieldName) {

        }

        @Override
        public Object pcFetchObjectId() {
            return null;
        }

        @Override
        public Object pcGetVersion() {
            return null;
        }

        @Override
        public boolean pcIsDirty() {
            return false;
        }

        @Override
        public boolean pcIsTransactional() {
            return false;
        }

        @Override
        public boolean pcIsPersistent() {
            return false;
        }

        @Override
        public boolean pcIsNew() {
            return false;
        }

        @Override
        public boolean pcIsDeleted() {
            return false;
        }

        @Override
        public Boolean pcIsDetached() {
            return null;
        }

        @Override
        public PersistenceCapable pcNewInstance(StateManager sm, boolean clear) {
            return null;
        }

        @Override
        public PersistenceCapable pcNewInstance(StateManager sm, Object obj, boolean clear) {
            return null;
        }

        @Override
        public Object pcNewObjectIdInstance() {
            return null;
        }

        @Override
        public Object pcNewObjectIdInstance(Object obj) {
            return null;
        }

        @Override
        public void pcCopyKeyFieldsToObjectId(Object obj) {

        }

        @Override
        public void pcCopyKeyFieldsToObjectId(FieldSupplier supplier, Object obj) {

        }

        @Override
        public void pcCopyKeyFieldsFromObjectId(FieldConsumer consumer, Object obj) {

        }

        @Override
        public Object pcGetDetachedState() {
            return null;
        }

        @Override
        public void pcSetDetachedState(Object state) {

        }
    }

    public enum TestOutcome {
        VALID,
        NULL,
        UNMODIFIED, INVALID
    }
}
