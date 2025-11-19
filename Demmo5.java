public class Demmo5 {
    public int compare1(int i, int a)
    {
        return i > a ? i : a;
    }
    public static void main(String[] args) {
        Demmo5 d5 = new Demmo5();
        int t = 3;
        int a = 123;
        System.out.println(d5.compare1(t, a));
    }
}
