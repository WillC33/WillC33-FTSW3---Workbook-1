import java.util.Scanner;

public class SquareCalculator {
    public static void main(String[] args) {
        //define shape sides
        System.out.println("Enter the width");
        Scanner reader = new Scanner(System.in);
        double width = reader.nextDouble();

        System.out.println("Enter the height");
        double height = reader.nextDouble();

        //output side values
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);

        //calculate and output perimeter
        double perimeter = (2 * width) + (2 * height);
        System.out.println("Perimeter = " + perimeter);

        //calculate and output area
        double area = width * height;
        System.out.println("Area = " + area);
        reader.close();
    }
}