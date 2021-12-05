package com.xpanxion.com.java.oop;

public interface Growable {

    float growthCoeffient = .2F;

    public void grow(int growthInches);

    //public int getGrowth();

    // Future release.
//    default int getGrowth() {
//        return 0;
//    }
//

}
