// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.util.Arrays;
import java.util.logging.*;

public class task_2_1 {

    public static void main(String[] args) throws Exception {
        int [] mas = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
 
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;
 
                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                    //System.out.println(Arrays.toString(mas));

                    Logger logger = Logger.getLogger(task_2_1.class.getName());
                    FileHandler fh = new FileHandler("log.xml");
                    logger.addHandler(fh);
                    XMLFormatter xml = new XMLFormatter();
                    fh.setFormatter(xml);
                    //logger.log(Level.WARNING, "Test W loggin");
                    logger.info(Arrays.toString(mas));
                }
            }
        }

    }
        
}

// C:\Users\mobai\OneDrive\Документы\Soft_Dev\java_hw\