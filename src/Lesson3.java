public class Lesson3 {

    public static void main(String[] args) {

        int k = 0;
        k--;
        k++;
        k -= 1;
        k += 1;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
            // break - полностью останавливает цикл
            // continue - перекидывает на следуюую итерацию
        }

        int p = 0;

        while (p < 10) {
            System.out.println("while " + p);
            p++;
        }

        p = 0;

        do {
            System.out.println("dowhile " + p);
            p++;
        } while (p < 10);
    }
}
