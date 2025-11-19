
import java.util.Scanner;

public class Deemo7 {
    public boolean  Judgement(int i)
    {
        int temp = i;
        int total = 0;
        while(temp != 0)
        {
            int ge = temp % 10;
            temp = temp / 10;
            total = total*10 + ge;
        }
        return total == i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        Deemo7 d = new Deemo7();
        System.out.println(d.Judgement(number));
        sc.close();
    }
}
