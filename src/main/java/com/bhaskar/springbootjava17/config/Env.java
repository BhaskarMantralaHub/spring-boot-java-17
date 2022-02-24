package com.bhaskar.springbootjava17.config;

/**
 * @author venkata.mantrala
 */
public class Env {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Env(String name) {
        this.name = name;
    }
}
