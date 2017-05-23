package inheritance.One;

/**
 * Created by ronald on 15/09/16.
 */
public class ColoredRectangle extends Rectangle {

    private String color;

    public ColoredRectangle(int length, int breadth, String type, String color) {
        super(length, breadth, type);
        this.color = color;
        System.out.println("Inside the constructor of colored rectangle:");
        System.out.println("length is: " + length);
        System.out.println("breadth is: " + breadth);
        System.out.println("type is: " + type);
        System.out.println("color is: " + color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
