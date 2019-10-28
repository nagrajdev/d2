package n;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.client.RestTemplate;

import com.opentable.server.OTApplication;
import com.opentable.server.mvc.MVCServer;
import com.opentable.service.ServiceInfo;
import com.opentable.service.discovery.client.EnableDiscoveryClient;

import com.opentable.resttemplate.RestTemplateConfiguration;
import com.opentable.resttemplate.RestTemplateFactory;

@Configuration
@MVCServer
@EnableDiscoveryClient
@Import({RestTemplateConfiguration.class, MyController.class})
public class Main {
    public static void main(final String[] args) {
        OTApplication.run(Main.class, args);
    }

    @Bean
    public ServiceInfo serviceInfo() {
        return new ServiceInfo() {
            @Override
            public String getName() {
                return "n";
            }
        };
    }

    @Bean
    public RestTemplate curlClient(RestTemplateFactory restTemplateFactory) {
        return restTemplateFactory.newTemplate();
    }
}
