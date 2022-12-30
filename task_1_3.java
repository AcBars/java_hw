

import java.util.Scanner;

public class task_1_3 {
    public static int readInt() {
        
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.print("Input number: ");
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
        Scanner str = new Scanner(System.in);
        float num_1 = readInt();
        System.out.print("Enter the action sign: ");
        String symbol = str.next();
        float num_2 = readInt();
        if(symbol.equalsIgnoreCase("+")){System.out.printf("%.2f+%.2f=%.2f", num_1, num_2, num_1+num_2);}
        else if(symbol.equalsIgnoreCase("-")){System.out.printf("%.2f+%.2f=%.2f", num_1, num_2, num_1-num_2);}
        else if(symbol.equalsIgnoreCase("*")){System.out.printf("%.2f+%.2f=%.2f", num_1, num_2, num_1*num_2);}
        else if(symbol.equalsIgnoreCase("/")){System.out.printf("%.2f+%.2f=%.2f", num_1, num_2, num_1/num_2);}
        else {System.out.print("You have entered an incorrect action sign, enter + or - or * or /");}
        str.close();
    }
}
