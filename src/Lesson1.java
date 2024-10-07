public class Lesson1 {

    public static void main(String[] args) {

        // int, long, short
        int int_a = 123;
        long long_a = 1234232342234234L;
        byte byte_a = 127;

        // float, double
        float float_a = 1.2f;
        double double_a = 1.2;

        // numeric
        // /
        // %
        double double_d = 123 / 4.0;
        double double_e = 123 / 4;
        System.out.println("double d = " + double_d);
        System.out.println("double e = " + double_e);

        // logic
        boolean bool_a = false;

        // string
        String string_a = "Hello";

        char char_a = 'a';
        char char_b = 500;

        // Casts
        long long_example = 100L;
        int int_example = (int) long_example;

        int int_to_string_example = 300;
        String string_example_1 = String.valueOf(int_to_string_example);

        System.out.println(string_example_1);
    }
}
