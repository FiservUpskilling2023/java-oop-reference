package com.xpanxion.com.java.oop;

public final class Person extends Organism // Can only extend one class.
        implements Growable, Workable, Speakable, Fireable { // Can implement multiple interfaces.

    //
    // Data Members
    //

    private String ssn;
    private String name;
    private int heightInches;

    //
    // Constructors
    //

    public Person (String creationDate) {
        this.creationDate = creationDate;
    }

    public Person (String creationDate, String name) {
        this.name = name;
        this.creationDate = creationDate;
    }

    public Person (String creationDate, String name, int height) {
        this.name = name;
        this.heightInches = height;
        this.creationDate = creationDate;
    }

    //
    // Accessors
    //

    public String getName() {
        return this.name;
    }

    public int getHeightInches() {
        return this.heightInches;
    }

    //
    // Public Methods
    //

    // TODO...

    //
    // Overrides
    //

    @Override
    public void grow(int growthInches) {
        this.heightInches += growthInches;
    }

    @Override
    public void startJob() {
        // TODO...
    }

    @Override
    public void endJob() {
        // TODO...
    }

    @Override
    public String speak() {
        return String.format("I am a Person and my name is: %s.", this.name);
    }

    //
    // Private Methods
    //

    // TODO...
}
