public class Deemo9 {
    public static void main(String[] args) {
        //new为比较内存
        String string = new String("abc");
        String s2 = "abc";
        System.out.println(string == s2);//false
        String s3 = new String("abc");
        String s4 = new String("ABC");
        System.out.println(string == s3);//false
        System.out.println(string.equals(s3));//true
        System.out.println(string.equalsIgnoreCase(s4));//true
    }
}
