package core;

import java.util.Random;

public class LeafPartitioner {
    private Leaf firstChild;
    private Leaf secondChild;
    private Random randomizer;
    private int width;
    private int height;

    public LeafPartitioner(Random randomizer){
       this.randomizer = randomizer;
    }

    /** Returns '0' if the partitioning is horizontal
     * Returns'1' if the partitioning is vertical
     * @return
     */
    private int paritionValue(){
       int value=0;
       return value;
    }
    private int divideValue(int dimension){
        int value=0;
        return value;
    }
    private void intialize(){
        int partitionValue = paritionValue();
       if(partitionValue==0){
          int divideValue = divideValue(width);
       }else{
           int divideValue= divideValue(height);
       }
    }
    private Leaf getFirstChild(){
        return firstChild;
    }
    private Leaf getSecondChild(){
        return secondChild;
    }


}
