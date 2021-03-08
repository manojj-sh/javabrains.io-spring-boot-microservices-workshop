package io.codlis.movieinfoservice.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.codlis.movieinfoservice.models.Movie;

@RestController
@RequestMapping("/movie")
public class MovieInfoService {

	@GetMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") String movieId){
		return new Movie(movieId, "Test Name");
		
	}
}
