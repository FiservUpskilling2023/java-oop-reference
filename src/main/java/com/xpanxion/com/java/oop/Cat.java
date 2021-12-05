package com.xpanxion.com.java.oop;

public class Cat extends Organism
        implements Speakable, Growable {

    //
    // Data Members
    //

    private String name;
    private int heightInches;

    //
    // Constructors
    //

    public Cat (String creationDate) {
        this.creationDate = creationDate;
    }

    public Cat (String creationDate, String name) {
        this.name = name;
        this.creationDate = creationDate;
    }

    //
    // Accessors
    //

    //
    // Public Methods
    //

    //
    // Overrides
    //

    @Override
    public String speak() {
        return String.format("Meow: I am a cat and my name is %s.", this.name);
    }

    @Override
    public void grow(int growthInches) {
        this.heightInches += growthInches;
    }

    //
    // Private Methods
    //
}
