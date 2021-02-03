package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.beautifier.PoemBeautifier;

import java.util.Locale;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("ttt",(a)->"ABC" + a + "ABC");
        poemBeautifier.beautify("tarala", (a -> a.toUpperCase(Locale.ROOT)));
        poemBeautifier.beautify("ABCDEFG", (a -> a.toLowerCase(Locale.ROOT)));
        poemBeautifier.beautify("tEkST", (a -> a.toLowerCase(Locale.ROOT) + "XYZ"));



    }
}
