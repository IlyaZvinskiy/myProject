package Final_Project;

import java.util.Scanner;

public class UserInterface {
    private static Scanner scanner = new Scanner(System.in);

    public static String receiveStr(String requestParam){
        try {
            System.out.println("Please enter " + requestParam + " :");
            return scanner.next();
        }finally {
            scanner.nextLine();
        }

    }
    public static int receiveInt(String requestParam){
        System.out.println("Please enter " + requestParam + " :");
        try {
            return scanner.nextInt();
        }catch (Exception e){
            System.out.println("Must Receive number");
            throw e;
        }
    }
}
