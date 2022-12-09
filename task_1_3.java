package java_hw;

import java.util.Scanner;

public class task_1_3 {
    public static int readInt() {
        while (true) {
            System.out.print("Input number: ");
            Scanner s = new Scanner(System.in);
            String line = s.nextLine();
            try {
                return Integer.parseInt(line);
            } 
            catch (NumberFormatException e) {
                System.err.println("You input not number!");
            }
        }
    }

    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        float num_1 = readInt();
        System.out.print("Enter the action sign: ");
        String symbol = s.next();
        //System.out.print("Введите число: ");
        float num_2 = readInt();
        int t = 2;
        if(symbol.equalsIgnoreCase("+")){System.out.printf("%.2f+%.2f=%.2f", num_1, num_2, num_1+num_2);}
        else if(symbol.equalsIgnoreCase("-")){System.out.printf("%.2f+%.2f=%.2f", num_1, num_2, num_1-num_2);}
        else if(symbol.equalsIgnoreCase("*")){System.out.printf("%.2f+%.2f=%.2f", num_1, num_2, num_1*num_2);}
        else if(symbol.equalsIgnoreCase("/")){System.out.printf("%.2f+%.2f=%.2f", num_1, num_2, num_1/num_2);}
        else {System.out.print("You have entered an incorrect action sign, enter + or - or * or /");}
    }
}
