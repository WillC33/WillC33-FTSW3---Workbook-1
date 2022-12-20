import java.util.Scanner;

public class NotGate {
    public static void main(String[] args) {
        System.out.println("Welcome to the NOT gate");

        System.out.println("Gate 1: true or false?");
        Scanner statement = new Scanner(System.in);
        boolean testStatement = statement.nextBoolean();

        boolean gateOutput;

        gateOutput = !testStatement;
        System.out.println("The gate comes out as " + gateOutput);
        statement.close();
    }
}