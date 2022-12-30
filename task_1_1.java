// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)


import java.util.Scanner;

public class task_1_1 {
    public static void main(String [] args){
    Scanner in = new Scanner(System.in);  
        System.out.print("input number n:");
        int num = in.nextInt();
        int sum = 0;
        int  mult = 1;
        for(int i = 0; i <= num; i++){
            sum += i;
            if(i < 1){mult = 1;}
            else
            mult *= i;
        }
        System.out.printf("The triangular number %d is equal to: %d \factorial %d is equal to: %d", num, sum, num, mult);
        in.close();
    }
}
