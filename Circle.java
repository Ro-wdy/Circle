public class Circle {

	private double radius;

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Circle circle = new Circle(7);

	        // Displaying the radius
	        System.out.println("Radius of the circle: " + circle.getRadius());

	        // Calculating and displaying the area
	        System.out.println("Area of the circle: " + circle.calculateArea());

	        // Calculating and displaying the circumference
	        System.out.println("Circumference of the circle: " + circle.calculateCircumference());

	        // Modifying the radius
	        circle.setRadius(13);
	        System.out.println("\nAfter modifying the radius:");

	        // Displaying the new radius
	        System.out.println("New radius of the circle: " + circle.getRadius());

	        // Calculating and displaying the new area
	        System.out.println("New area of the circle: " + circle.calculateArea());

	        // Calculating and displaying the new circumference
	        System.out.println("New circumference of the circle: " + circle.calculateCircumference());
	}

}
