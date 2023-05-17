import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File( "src/text.txt");
        Scanner scanner = new Scanner(file);
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());

//        Scanner scaner = new Scanner(System.in);
//        System.out.println("Write yr name" );
//        String name = scaner.nextLine();
//
//        System.out.println("Write yr age" );
//        Integer age = scaner.nextInt();
//
//        System.out.println("U are student?" );
//        Boolean isStudent = scaner.nextBoolean();
//
//        System.out.println("Hello " + name);
//        System.out.println("age: " + age);
//        System.out.println("Is student: " + isStudent);
    }
}