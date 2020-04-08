package inclass_11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestHours {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean valid = false;
        final int RATE = 10;
        double earned;
        int hours_worked;

        while(!valid){
            try {
                System.out.println("Enter hours worked: ");
                hours_worked = in.nextInt();
                if (hours_worked < 0){
                    throw new NegativeHoursException();
                }
                earned = hours_worked * RATE;
                System.out.println("You earned: " + earned + " today.");
                valid = true;
            } catch (InputMismatchException e){
                System.out.println("Invalid data entered");
                in.nextLine();
            } catch (NegativeHoursException ne){
                System.out.println(ne.getMessage());
            }
        }
    }
}
