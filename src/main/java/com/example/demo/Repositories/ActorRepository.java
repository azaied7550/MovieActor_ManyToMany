package com.example.demo.Repositories;
import com.example.demo.Actor;
import com.example.demo.Movie;
import org.springframework.data.repository.CrudRepository;

public interface ActorRepository extends CrudRepository<Actor, Long>{
    Iterable<Actor> findAllByRealNameContaningIgnoreCase(String s);
    Iterable<Actor> findAllByMoviesNotContaining(Movie thisMovie);
}
