public class postfixs {

    static int a = 8;
    static int b = a--;

    public static void main(String[] args) {

        System.out.println(a);  // 7
        System.out.println(b);  // 8
    }
}
