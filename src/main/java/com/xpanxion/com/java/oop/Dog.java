package com.xpanxion.com.java.oop;

public class Dog extends Organism
    implements Growable, Speakable {

    //
    // Data Members
    //

    private String name;
    private int heightInches;

    //
    // Constructors
    //

    public Dog (String creationDate) {
        this.creationDate = creationDate;
    }

    public Dog (String creationDate, String name) {
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
    public void grow(int growthInches) {
        this.heightInches += growthInches;
    }

    @Override
    public String speak() {
        return String.format("Woof: I am a Dog and my name is: %s.", this.name);
    }

    //
    // Private Methods
    //
}
