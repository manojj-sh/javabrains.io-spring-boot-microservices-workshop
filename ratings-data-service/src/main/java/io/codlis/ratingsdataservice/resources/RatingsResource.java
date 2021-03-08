package io.codlis.ratingsdataservice.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.codlis.ratingsdataservice.models.Rating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

	@GetMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId){
		return new Rating("trans", 4);
		
	}
}
