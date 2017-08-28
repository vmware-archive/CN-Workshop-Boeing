package io.pivotal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RestController
@EnableJpaRepositories
@EnableDiscoveryClient
@Import(RepositoryRestMvcConfiguration.class)
@RefreshScope
public class CloudNativeSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudNativeSpringApplication.class, args);
	}


	  @Value("${greeting:Hola}")
    private String _greeting;

    @RequestMapping("/")
    public String hello() {
        return _greeting + " World!";
    }
}
