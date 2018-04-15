package com.example.models;

/**
 * Created by tomco on 15/03/2018.
 */
public class GoodJoke {

    private String setup;
    private String punchline;

    public GoodJoke() {
    }

    public GoodJoke(String setup, String punchline) {
        this.setup = setup;
        this.punchline = punchline;
    }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getPunchline() {
        return punchline;
    }

    public void setPunchline(String punchline) {
        this.punchline = punchline;
    }

    @Override
    public String toString() {
        return "GoodJoke{" +
                "setup='" + setup + '\'' +
                ", punchline='" + punchline + '\'' +
                '}';
    }
}
