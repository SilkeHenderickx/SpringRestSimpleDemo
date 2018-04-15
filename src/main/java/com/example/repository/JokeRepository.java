package com.example.repository;

import com.example.models.Joke;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JokeRepository
        extends CrudRepository<Joke,Long> {

    Joke findByComedian(String comedian);
}
