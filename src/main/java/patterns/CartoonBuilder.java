package org.example.cartoonapi.patterns;

import com.example.demo.model.Cartoon;

public class CartoonBuilder {

    private String name;
    private int episodes;
    private String studio;

    public CartoonBuilder name(String name) {
        this.name = name;
        return this;
    }

    public CartoonBuilder episodes(int episodes) {
        this.episodes = episodes;
        return this;
    }

    public CartoonBuilder studio(String studio) {
        this.studio = studio;
        return this;
    }

    public Cartoon build() {
        return new Cartoon(name, episodes, studio);
    }
}
