public class divisions {
    static int a = 33;
    static int b = 5;
    static int c = a % b;  // 3
    static int d = 22 % 4; // 2 (22 - 4*5 = 2)

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
