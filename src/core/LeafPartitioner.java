package core;

import java.util.Random;

public class LeafPartitioner {
    private Leaf firstChild;
    private Leaf secondChild;
    private Random randomizer;
    private int minimumWidth;
    private int minimumHeight;
    private int width;
    private int height;

    public LeafPartitioner(Random randomizer){
       this.randomizer = randomizer;
    }

    /** Returns '0' if the partitioning is horizontal
     * Returns'1' if the partitioning is vertical
     */
    private int paritionValue(){
        // The value is either 0 or 1.
        int value =0;
        if(width>2*minimumWidth && height>2*minimumHeight) {
            value = randomizer.nextInt(2);
        }else if (width>2*minimumWidth){
            value =0;
        }else{
           value =1;
        }
       return value;
    }

    /** Returns the randomized value of width or  height using the randomizer
     *  to divide the Leafs.
     *  Don't input the dimensions which can not be further partitioned!!!
     *  Infinite Loop.
     */
    private int divideValue(int dimension,int bound){
        int value=0;
        do{
            value = randomizer.nextInt(dimension);
        }while(value>=bound && dimension-value>=bound);

        return value;
    }

    /**
     * Making the leafs after obtaining the partitioning type and partitioning value
     * from the randomizer.
     */
    private void initialize(){
       int partitionType= paritionValue();
       if(partitionType==0){
          int partitionValue = divideValue(width,minimumWidth);
          firstChild = new Leaf(partitionValue,height);
          secondChild = new Leaf(width-partitionValue,height);

       }else{
           int partitionValue= divideValue(height,minimumHeight);
           firstChild = new Leaf(width,partitionValue);
           secondChild = new Leaf(width,height-partitionValue);
       }
    }

    /**
     *Obtain the firstChild of the Leaf
     */
    private Leaf getFirstChild(){
        return firstChild;
    }

    /**
     * Obtain the secondChild of the Leaf
     */
    private Leaf getSecondChild(){
        return secondChild;
    }
}
