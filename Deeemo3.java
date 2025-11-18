
import java.util.Scanner;

public class Deeemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the hundreds number");
        int number =  sc.nextInt();
        System.out.println(number / 100);
        System.out.println(number % 100 /10);
        System.out.println(number % 10);
        sc.close();
    }
}
