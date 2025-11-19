
import java.util.Scanner;

public class Demmo6 {
    public static void main(String[] args) {
        int day;
        Scanner sc = new Scanner(System.in);
        day = sc.nextInt();
        switch(day)
        {
            case 1,2,3,4,5 ->System.out.println("work day");
            case 6,7 ->System.out.println("rest day");
            default ->System.out.println("not valid");
        }
        sc.close();
    }
}
