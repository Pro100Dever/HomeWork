import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write value");
        System.out.println("Write date value");
        Integer value = scanner.nextInt();
//        if (value % 2 == 0){
//        System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//        if (value < 0){
//            System.out.println("Положительное");
//        } else if (value > 0){
//            System.out.println("Отрицательное");
//        }else{
//            System.out.println("Ноль");
//        }
        if (value % 4 == 0 && value % 100 != 0 || value % 400 == 0){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
}