package ac.simons.neo4j.sdn_with_jaxrs.domain;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface MovieRepository extends Neo4jRepository<Movie, Long> {
}
