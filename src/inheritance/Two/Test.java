package inheritance.Two;

/**
 * Created by ronald on 15/09/16.
 */
public class Test {
    public static void main(String[] args) {
        inheritance.Two.Rectangle rectangle = new Rectangle(5, 8, "small");
        rectangle.showattributes();
    }
}
/*
Using final with methods: We can prevent a method from being overridden by using the keyword final at the start of it's
declaration. Final Methods can not be overridden.

Using final with class: We can also prevent inheritance by making a class final. When a class is declared final, it's
methods become final. AN ABSTRACT CLASS CANNOT BE DECLARED AS A FINAL BECAUSE AN ABSTRACT CLASS IS INCOMPLETE AND IT'S
SUBCLASSES NEED TO PROVIDE THE IMPLEMENTATION.
 */
