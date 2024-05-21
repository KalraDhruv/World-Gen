package core;

import tileengine.TETile;

import java.util.Random;

public class BinarySpacePartitioning {
    // A 2D Array to store the orientation of the array.
    private TETile[][] layout;
    // A pseudo random generating object.
    private Random randomizer;
   // The width of the screen.
    private int width;
    // The height of the screen.
    private int height;
    // The number of times the partitioning algorithm is run.
    private int partitions;
    // The root node for the tree.
    private Leaf root;

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
