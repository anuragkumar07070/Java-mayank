package day3;
import java.util.Scanner;

public class print {
    String name;

    public void diplay(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        name = sc.nextLine();
        System.out.println("hello, "+name);
    }
    public static void main(String[] args) {
        print p = new print();
        p.diplay();
    }
}
