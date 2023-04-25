public class Circle {
    private String colour;
    private double radius;

    public Circle(String colour, double radius){
        setColour(colour);
        setRadius(radius);
    }
    public String colour() {
        return colour;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour){
        this.colour=colour;
    }
    public double radius(){
        return radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
    this.radius=radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }
}
