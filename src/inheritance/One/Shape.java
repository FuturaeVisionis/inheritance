package inheritance.One;

/**
 * Created by ronald on 15/09/16.
 */
public class Shape {

    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;

    }
}
