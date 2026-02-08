package org.example.cartoonapi.patterns;

import com.example.demo.model.Cartoon;

public class CartoonFactory {

    public static Cartoon createMovie(String name, String studio, int duration) {
        return new Cartoon(name, 1, studio + " Movie " + duration + "min");
    }

    public static Cartoon createSeries(String name, String studio, int episodes) {
        return new Cartoon(name, episodes, studio + " Series");
    }
}
