package com.example.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Joke {
    @Id
    @GeneratedValue
    private Long id;
    private String joke;
    private String comedian;

    public Joke(String joke, String comedian) {
        this.joke = joke;
        this.comedian = comedian;
    }

    public Joke() {
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    public String getComedian() {
        return comedian;
    }

    public void setComedian(String comedian) {
        this.comedian = comedian;
    }

    @Override
    public String toString() {
        return "Joke{" +
                "joke='" + joke + '\'' +
                ", comedian='" + comedian + '\'' +
                '}';
    }
}
