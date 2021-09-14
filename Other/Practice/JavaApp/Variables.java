public class Variables {

    public static void main(String[] args) {
        byte num = 2; // -128 <= num <= 127
        short sh = 25463; // -32768 <= sh <= 32767
        int i = 343242; // -2 billion <= sh <= 2 billion
        long l = 42143434; // -9 * 10^30 <= l <= 9 * 10^30

        float num_2 = 324.3432f;
        double num_3 = 34523434.54f;

        char sym = 'A';
        String s = "Hello World!";

        boolean ok = true;

        System.out.print("Variable = " + s);
    }
}