package core;

public class Leaf {
    // The left child of the leaf.
    private Leaf leftChildLeaf;
    // The right child of the leaf.
    private Leaf rightChildLeaf;
    // I don't know whether it is a good idea to add x and y coordinates in leafs.
    // Maybe I should study lab9 then come back.
    // I bet there might be some hint over there.
    // Who knows?
    private int xCoordinate;
    private int yCoordinate;
    private int width;
    private int height;
    private Room room;

    // Width and Height are needed to further set bounds for the Room i.e. the space occupied by the room.
    Leaf(int xCoordinate, int yCoordinate, int width, int height){
        this.xCoordinate=xCoordinate;
        this.yCoordinate=yCoordinate;
        this.width = width;
        this.height = height;
    }
    Leaf(int width,int height){
        this. width=width;
        this.height =height;
    }
    // Need to make a room within the bounds of the leaf.
    public void roomGen(int width, int height){
      room = new Room(width,height);
    }
    // mutators
    public void setLeftChildLeaf(Leaf leaf){
       leftChildLeaf = leaf;
    }
    public void setRightChildLeaf(Leaf leaf){
        rightChildLeaf = leaf;
    }
    // accessors
    public Leaf getLeftChildLeaf(Leaf leaf){
        return leftChildLeaf;
    }
    public Leaf getRightChildLeaf(Leaf leaf){
        return rightChildLeaf;
    }

}
