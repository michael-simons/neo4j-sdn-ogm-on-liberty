package ac.simons.neo4j.sdn_with_jaxrs;

import ac.simons.neo4j.sdn_with_jaxrs.api.MovieResource;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * See https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-jersey
 */
@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {

		register(MovieResource.class);
	}
}
