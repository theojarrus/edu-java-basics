public class Lesson2 {

    public static void main(String[] args) {
        // ==
        // !=
        // <=
        // >=

        boolean bool_a = true;
        boolean bool_b = !bool_a;

        boolean bool_c = 5 - 3 == 2;
        int int_a = (5 - 3 == 2) ? 100 : -1;

        /*if (!bool_a) {
            return;
        }
        if (!bool_b) {
            return;
        }*/

        if (bool_c) {
            //System.out.println("that's true");
            /*if () {
                if () {

                }
            }*/
        } else if (bool_a) {
            // todo
        } else {
            //System.out.println("that's false");
        }

        int switch_a = 101;
        switch (switch_a) {
            case -1:
                System.out.println("-1");
                break;
            case 0, 11:
                System.out.println("0");
                break;
            case 100:
                System.out.println("100");
                break;
            case 200:
                System.out.println("200");
                break;
            default:
                System.out.println("default");
        }
    }
}
