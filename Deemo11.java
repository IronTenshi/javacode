
import java.util.Scanner;

public class Deemo11 {
    public String reverseSrting(String string)
    {
        String result = new String("");
        for(int i = string.length() - 1 ; i > 0 ; i--)
        {
            result = result + string.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        sc.close();
        Deemo11 d = new Deemo11();
        System.out.println(d.reverseSrting(s1));
    }
}
