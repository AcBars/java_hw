// Вывести все простые числа от 1 до 1000

package java_hw;

public class task_1_2 {
    public static void main(String [] args){
        System.out.print("[");
        for(int i = 3; i < 1000; i++){
            int k = 0;
            for(int j = 2; j <= i / 2 + 1; j ++){
                if(i % j == 0){k++;}
            }
            if(k == 0){System.out.printf("%d, ", i);}
        }
        System.out.print("]");
    }
}
