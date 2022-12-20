import java.util.Scanner;

public class AndGate {
    public static void main(String[] args) {
        System.out.println("Welcome to the AND gate");

        System.out.println("Gate 1: true or false?");
        Scanner statement = new Scanner(System.in);
        boolean testStatement = statement.nextBoolean();


        System.out.println("Gate 2: true or false?");
        boolean testStatement2 = statement.nextBoolean();


        boolean gateOutput;

        if (testStatement && testStatement2 == true) {
            gateOutput = true;
        } else {
            gateOutput = false;
        }
        System.out.println("The gate comes out as " + gateOutput);
        statement.close();
    }
}