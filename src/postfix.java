public class postfix {

    static int a = 8;
    static int b = a++;

    public static void main(String[] args) {

        System.out.println(a);  // 9
        System.out.println(b);  // 8
    }
}