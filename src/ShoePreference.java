import java.util.Scanner;

public class ShoePreference {
    public static void main(String[] args) {
        System.out.println("What colour of shoes should I buy?");
        Scanner myObj = new Scanner(System.in);
        String shoeColour = myObj.nextLine();


        if (shoeColour.equals("black") || shoeColour.equals("brown")) {
            System.out.println("Those suit my business needs!");
        } else {
            System.out.println("A little too spicy for me!");
        }
        myObj.close();
    }
}