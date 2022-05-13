public class Parentheses {

    static int a = 8;
    static int b = 7;
    static int c = (a + 5) * ++b;

    public static void main(String[] args) {

        System.out.println(c);  // 104

    }
}
