public class StaticVariable {
// radius is declared as private static
private static int radius;
// pi is a constant of type double declared as static
private static final double pi = 3.14;
public static void main(String[] args) {
// assigning value of radius
radius = 3;
// calculating and printing circumference
System.out.println("Circumference of a circle is:" + 2*pi*radius);
}
}