//Sheila Tagudin BSIT NETSEC 1-1
import java.util.Scanner;

public class UsingScannerr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstName = "Sheila";
        String middleName = "Lozano";
        String lastName = "Tagudin";

        System.out.println("Your first name: " + firstName);
        System.out.println("Your middle name: " + middleName);
        System.out.println("Your last name: " + lastName);

        System.out.println("\nYour name is: " + firstName + " "
                + middleName + " " + lastName);

        input.close();
    }
}
