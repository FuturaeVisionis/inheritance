package inheritance.One;

/**
 * Created by ronald on 15/09/16.
 */
public class Rectangle extends inheritance.One.Shape {

    private String type;

    public Rectangle(int length, int breadth, String type) {
        super(length, breadth);
        this.type = type;


    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
