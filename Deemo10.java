
import java.util.Scanner;

public class Deemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        str = sc.nextLine();
        sc.close();
        
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for(int i = 0; i < str.length();++i)
        {
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z')
                smallCount++;
            else if(c >= 'A' && c <= 'Z')
                bigCount++;
            else
                numberCount++;
        }

        System.out.println(bigCount);
        System.out.println(smallCount);
        System.out.println(numberCount);
    }
}
