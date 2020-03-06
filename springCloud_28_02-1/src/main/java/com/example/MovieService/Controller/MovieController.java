package com.example.MovieService.Controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.MovieService.model.Movie;

@RestController
public class MovieController {
	
	

    private static List<Movie> movieList = new ArrayList<>();
    static {
    movieList.add(new Movie(1,"abc","HELLO"));
    movieList.add(new Movie(1,"CDE","WORLD"));
    movieList.add(new Movie(1,"DEF","JAVA"));
    
    }
      
	@GetMapping("/movies")
	public ResponseEntity<?> getMovies()
	
	{
		return ResponseEntity.ok(movieList);
	}
	
	@GetMapping("/movies/{id}")
	public ResponseEntity<?> getMovies(@PathVariable int id)
	
	{

        Movie movie = findMovie(id);
        if (movie == null) {
            return ResponseEntity.badRequest()
                .body("Invalid movie id");
        }

        return ResponseEntity.ok(movie);

    }
	
	private Movie findMovie(int id)
	{
		return movieList.stream()
	            .filter(movie -> movie.getId()
	                    .equals(id))
	                .findFirst()
	                .orElse(null);
		
	}
	}
	

