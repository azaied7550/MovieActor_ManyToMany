package com.example.demo.Repositories;

import com.example.demo.Actor;
import com.example.demo.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long>{
    Iterable<Movie> findAllByCastIsIn(Iterable<Actor> actors);
}
