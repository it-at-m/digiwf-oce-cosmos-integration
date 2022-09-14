package io.muenchendigital.digiwf.ocecosmos.integration.api.configuration;

import io.muenchendigital.digiwf.ocecosmos.integration.api.streaming.OceCosmosStreamingEventListener;
import io.muenchendigital.digiwf.spring.cloudstream.utils.api.streaming.infrastructure.RoutingCallback;
import io.muenchendigital.digiwf.spring.cloudstream.utils.configuration.StreamingConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.function.context.MessageRoutingCallback;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@AutoConfigureBefore({StreamingConfiguration.class})
public class OceCosmosConfiguration {

    /**
     * Bean of type {@link RoutingCallback} to register the routes
     * defined in {@link OceCosmosStreamingEventListener} programmatically.
     *
     * @return the {@link RoutingCallback} as a bean.
     */
    @Bean
    @ConditionalOnMissingBean
    public MessageRoutingCallback okEwoRouter() {
        final Map<String, String> typeMappings = new HashMap<>();
        // Add Mappings here
        return new RoutingCallback(typeMappings);
    }

}
