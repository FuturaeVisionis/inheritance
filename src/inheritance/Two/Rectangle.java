package inheritance.Two;

/**
 * Created by ronald on 15/09/16.
 */
public class Rectangle extends inheritance.Two.Shape {

    private String type;

    public Rectangle(int length, int breadth, String type) {
        super(length, breadth);
        this.type = type;
    }

    @Override
    void showattributes() {
        super.showattributes();
        System.out.println("type :" + type);
    }
}
