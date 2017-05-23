package inheritance.One;

/**
 * Created by ronald on 15/09/16.
 */
public class Test {
    public static void main(String[] args) {
        ColoredRectangle coloredRectangle = new ColoredRectangle(1, 2, "Big", "Red");
        coloredRectangle.setColor("Blue");
        System.out.println(coloredRectangle.getColor());

        System.out.println();

        Shape shape = new Shape(28,65);
        shape.setBreadth(203);
        System.out.println(shape.getBreadth());

        System.out.println();

        Rectangle rectangle = new Rectangle(5,8,"Small");
        rectangle.setType("medium");
        System.out.println(rectangle.getType());

    }
}
