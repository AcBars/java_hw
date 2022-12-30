/*
К калькулятору из предыдущего дз добавить логирование. * 
 */

 import java.io.IOException;
import java.util.Scanner;
 import java.util.logging.*;

public class task_2_4 {
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

    public static void main(String [] args) throws SecurityException, IOException {
        Scanner str = new Scanner(System.in);
        float num_1 = readInt();
        System.out.print("Enter the action sign: ");
        String symbol = str.next();
        float num_2 = readInt();
        if(symbol.equalsIgnoreCase("+")){
            System.out.printf("%.2f+%.2f=%.2f", num_1, num_2, num_1+num_2);
            String result = Float.toString(num_1) + "+" + Float.toString(num_2) + "=" + Float.toString(num_1+num_2);
            Logger logger = Logger.getLogger(task_2_4.class.getName());
            FileHandler fh = new FileHandler("log.xml");
            logger.addHandler(fh);
            XMLFormatter xml = new XMLFormatter();
            fh.setFormatter(xml);
            logger.info(result);
        }
        else if(symbol.equalsIgnoreCase("-")){
            System.out.printf("%.2f+%.2f=%.2f", num_1, num_2, num_1-num_2);
            String result = Float.toString(num_1) + "-" + Float.toString(num_2) + "=" + Float.toString(num_1-num_2);
            Logger logger = Logger.getLogger(task_2_4.class.getName());
            FileHandler fh = new FileHandler("log.xml");
            logger.addHandler(fh);
            XMLFormatter xml = new XMLFormatter();
            fh.setFormatter(xml);
            logger.info(result);
        }
        else if(symbol.equalsIgnoreCase("*")){
            System.out.printf("%.2f+%.2f=%.2f", num_1, num_2, num_1*num_2);
            String result = Float.toString(num_1) + "*" + Float.toString(num_2) + "=" + Float.toString(num_1*num_2);
            Logger logger = Logger.getLogger(task_2_4.class.getName());
            FileHandler fh = new FileHandler("log.xml");
            logger.addHandler(fh);
            XMLFormatter xml = new XMLFormatter();
            fh.setFormatter(xml);
            logger.info(result);
        }
        else if(symbol.equalsIgnoreCase("/")){
            System.out.printf("%.2f+%.2f=%.2f", num_1, num_2, num_1/num_2);
            String result = Float.toString(num_1) + "/" + Float.toString(num_2) + "=" + Float.toString(num_1/num_2);
            Logger logger = Logger.getLogger(task_2_4.class.getName());
            FileHandler fh = new FileHandler("log.xml");
            logger.addHandler(fh);
            XMLFormatter xml = new XMLFormatter();
            fh.setFormatter(xml);
            logger.info(result);
        }
        else {
            System.out.print("You have entered an incorrect action sign, enter + or - or * or /");
            Logger logger = Logger.getLogger(task_2_4.class.getName());
            FileHandler fh = new FileHandler("log.xml");
            logger.addHandler(fh);
            XMLFormatter xml = new XMLFormatter();
            fh.setFormatter(xml);
            logger.info("You have entered an incorrect action sign, enter + or - or * or /");
        }
        str.close();
    }
}
