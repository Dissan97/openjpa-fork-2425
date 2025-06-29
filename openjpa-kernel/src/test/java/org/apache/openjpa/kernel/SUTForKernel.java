package org.apache.openjpa.kernel;

import org.apache.openjpa.conf.OpenJPAConfiguration;
import org.apache.openjpa.meta.MetaDataDefaults;
import org.apache.openjpa.meta.MetaDataFactory;
import org.apache.openjpa.meta.MetaDataRepository;
import org.apache.openjpa.util.ProxyManagerImpl;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;

/**
 * Helper class to provide a mock BrokerImpl instance for testing purposes.
 */
public class SUTForKernel {

    /**
     * Creates a mocked BrokerImpl instance with its configuration and dependencies
     * mocked as well, returning a consistent structure useful for unit tests.
     *
     * @param failFast An integer to simulate different return values for callbackMode,
     *                 allowing to test different conditional branches.
     * @return A fully mocked BrokerImpl with nested configuration and metadata mocks.
     */
    public static BrokerImpl validBroker(int failFast) {
        BrokerImpl myBroker = mock(BrokerImpl.class);
        MetaDataRepository metaDataRepository = mock(MetaDataRepository.class);
        MetaDataFactory metaDataFactory = mock(MetaDataFactory.class);
        MetaDataDefaults metaDataDefaults = mock(MetaDataDefaults.class);
        OpenJPAConfiguration configuration = mock(OpenJPAConfiguration.class);

        when(myBroker.getConfiguration()).thenReturn(configuration);
        when(configuration.getMetaDataRepositoryInstance()).thenReturn(metaDataRepository);
        when(configuration.getProxyManagerInstance()).thenReturn(new ProxyManagerImpl());
        when(metaDataRepository.getMetaDataFactory()).thenReturn(metaDataFactory);
        when(metaDataFactory.getDefaults()).thenReturn(metaDataDefaults);
        when(metaDataDefaults.getCallbackMode()).thenReturn(failFast);

        when(myBroker.fireLifecycleEvent(any(), any(), any(), anyInt())).thenReturn(false);

        return myBroker;
    }


}
