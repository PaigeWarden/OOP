public class CircleTest {
    public static void main(String[] args) {
        Circle Circle01 = new Circle("red",1.0);
        System.out.println("The radius of the circle is: " + Circle01.getRadius());
        System.out.println("The colour of the circle is: " + Circle01.getColour());
        System.out.println("The area of the circle is " + Circle01.getArea());
    }
}
