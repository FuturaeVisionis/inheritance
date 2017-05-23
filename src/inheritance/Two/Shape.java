package inheritance.Two;

/**
 * Created by ronald on 15/09/16.
 */
public class Shape {

    int length;
    int breadth;

    public Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void showattributes() {
        System.out.println("length: " + length);
        System.out.println("breadth: " + breadth);
    }
}
