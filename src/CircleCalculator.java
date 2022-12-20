import java.util.Scanner;

class CircleCalculator {
    public static void main(String[] args) {
        //take input of shape sides
        System.out.println("Enter the radius");
        Scanner reader = new Scanner(System.in);
        double circleRadius = reader.nextDouble();

        //define diameter, circumference, area
        double circleDiameter = 2 * circleRadius;
        double circleCircumference = circleDiameter * Math.PI;
        double circleArea = Math.pow((Math.PI * circleRadius), 2) ;

        //output results
        System.out.printf("The diameter is: %.2f \n", circleDiameter);
        System.out.printf("The circumference is: %.2f \n", circleCircumference);
        System.out.printf("The area is: %.2f \n", circleArea);

        reader.close();
    }
}