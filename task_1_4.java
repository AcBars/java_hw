// *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
// Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

package java_hw;

import java.util.Scanner;

public class task_1_4 {

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
        System.out.print("Input one number: ");
        Scanner s = new Scanner(System.in);
        int num_1 = readInt();
        int num_2 = readInt();
        int num_3 = readInt();
        System.out.println(num_1);
        s.close();
    }
}
