public class Demmo4 {
    public static void main(String[] args) {
        System.out.println("123"+123);//123123
        System.out.println(123+123+"123");//246123
        System.out.println('a' +1);//98
        System.out.println(true ^ false);//true
        System.out.println(true ^ true);//flase

        int a = 10;
        int b = 10;
        boolean result = ++a > 5 || ++b > 5;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
    }
}
