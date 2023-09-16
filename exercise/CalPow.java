package exercise;
import java.lang.Math;
public class CalPow {
    public static void main(String[] args) {
        int base = Integer.parseInt(args[0]);
        int exponent = Integer.parseInt(args[1]);
        int result = Math.pow(base, exponent);
        System.out.println(result);
    }
}
