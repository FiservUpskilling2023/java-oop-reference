package com.xpanxion.com.java.oop;

public interface Fireable extends Workable {

    default String fire() {  // Java 8 supports interfaces that have a default implementation.
        return "I have been fired.";
    }
}
