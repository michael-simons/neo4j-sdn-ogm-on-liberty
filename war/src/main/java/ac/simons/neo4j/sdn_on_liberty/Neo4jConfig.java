package ac.simons.neo4j.sdn_on_liberty;

import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Singleton;

import org.neo4j.ogm.config.Configuration;
import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;

public class Neo4jConfig {

	@Produces
	@Singleton
	public SessionFactory createSessionFactory() {
		SessionFactory sessionFactory = new SessionFactory(
			new Configuration.Builder().withBasePackages("ac.simons.neo4j.sdn_on_liberty.domain")
				.uri("bolt://localhost:7687").credentials("neo4j", "secret").build());
		return sessionFactory;
	}

	public void close(@Disposes SessionFactory sessionFactory) {
		sessionFactory.close();
	}

	@Produces
	@Singleton
	public Session createSession(SessionFactory sessionFactory) {
		return sessionFactory.openSession();
	}
}
