package day3;
public class PrintTable {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int length = 10;
        if (args.length >= 2) {
            length = Integer.parseInt(args[1]);
        }
        for (int i = 1; i <= length; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
