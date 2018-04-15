package com.example.resources;

import com.example.models.GoodJoke;
import com.example.models.Joke;
import com.example.repository.JokeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class JokeResource {

    private RestTemplate template;
    private JokeRepository jokeRepo;

    @Autowired
    public JokeResource(RestTemplate template, JokeRepository jokeRepo) {
        this.template = template;
        this.jokeRepo = jokeRepo;
    }

    @RequestMapping(path = "/jokes", method = RequestMethod.GET)
    public Iterable<Joke> getJokes() {
        return jokeRepo.findAll();
    }

    @RequestMapping(path = "/jokes/{id}", method = RequestMethod.GET)
    public Joke findOneJoke(@PathVariable("id") Long id) {
        return jokeRepo.findOne(id);
    }

    @RequestMapping(path = "/jokes",
            method = RequestMethod.POST,
            consumes = "application/json")
    public void addJoke(@RequestBody Joke newJoke) {
        jokeRepo.save(newJoke);
    }

    @RequestMapping(path = "/goodjoke", method = RequestMethod.GET)
    public Joke getGoodJoke() {
        String url = "https://08ad1pao69.execute-api.us-east-1.amazonaws.com/dev/random_joke";

        GoodJoke goodJoke = template.getForObject(url, GoodJoke.class);

        return new Joke(goodJoke.toString(), "Online");
    }
}
