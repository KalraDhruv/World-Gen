package core;

import tileengine.TETile;

import java.util.Random;

public class BinarySpacePartitioning {
    private TETile[][] layout;
    private Random randomizer;

    BinarySpacePartitioning(long seed){
       initializeLayout(seed);
       randomizer=RandomHelper(seed);
    }
    /**
    Builds a 2D array consisting of random rooms generated for the map.
     */
    private void initializeLayout(long seed){

    }

    /**
     * Takes the seed to generate pseudo Random numbers.
     * @param seed
     * @return
     */
    private Random RandomHelper(long seed){
        Random randomizer = new Random(seed);
        return randomizer;
    }

}
