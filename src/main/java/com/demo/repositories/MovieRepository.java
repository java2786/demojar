package com.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

	@Query("select m from Movie m where m.rating>=?1")
	public List<Movie> getMoviesGreaterThanRating(double rating);

}
