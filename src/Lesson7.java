public class Lesson7 {

    public static void main(String[] args) {
        // System.out.println(next(1));
        print("line1", "line2");
    }

    public static int next(int number) {
        return number + 1;
    }

    public static void print(String...strings) {
        for (String string : strings) {
            System.out.print(string + " ");
        }
    }
}
