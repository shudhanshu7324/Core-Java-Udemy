public class Casting {
    public static void main(String[] args) {
        byte b = 127;
        int a = 1290;
        System.out.println(b);
        System.out.println(a);

        // type casting
        b = (byte)a;
        System.out.println(b);

        // type conversion
        a = b;
        System.out.println(a);

        // type promotion
        byte t = 10;
        byte u = 40;
        int result = t*u; // here t and u got converted to integer which is called type promotion.
    }
}
