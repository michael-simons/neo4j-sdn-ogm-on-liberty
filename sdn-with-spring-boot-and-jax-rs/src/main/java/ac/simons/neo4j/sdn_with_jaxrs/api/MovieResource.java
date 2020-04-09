package ac.simons.neo4j.sdn_with_jaxrs.api;

import ac.simons.neo4j.sdn_with_jaxrs.domain.Movie;
import ac.simons.neo4j.sdn_with_jaxrs.domain.MovieRepository;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

@Component
@Path("movies")
public class MovieResource {

	@Inject
	MovieRepository movieRepository;

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Iterable<Movie> getMovies() {

		return movieRepository.findAll();
	}
}
