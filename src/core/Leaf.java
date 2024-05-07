package core;

public class Leaf {
    private Leaf leftChildLeaf;
    private Leaf rightChildLeaf;
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
    // Need to make a room within the bounds of the leaf.
    public void roomGen(int width, int height){
      room = new Room(width,height);
    }
    // These are useful for knowing which two leafs to connect at the end.
    public void setLeftChildLeaf(Leaf leaf){
       leftChildLeaf = leaf;
    }
    public void setRightChildLeaf(Leaf leaf){
        rightChildLeaf = leaf;
    }
}
