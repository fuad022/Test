package Projects;

public class Test4 {
    //    private static int $;
    public static void main(String[] args) {
//        1. What is the result of the following class? (Choose all that apply)
//        String a_b = null;
//        System.out.print($);
//        System.out.print(a_b);

//        2. What is the result of the following code?
//        String s1 = "Java";
//        String s2 = "Java";
//        StringBuilder sb1 = new StringBuilder();
//        sb1.append("Ja").append("va");
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
//        System.out.println(sb1.toString() == s1);
//        System.out.println(sb1.toString().equals(s1));

//      3. What is the output of the following code? (Choose all that apply)
//        boolean keepGoing = true;
//        int count = 0;
//        int x = 3;
//        while (count++ < 3) {
//            int y = (1 + 2 * count) % 3;
//            switch (y) {
//                default:
//                case 0 : x -= 1;
//                break;
//                case 1 : x += 5;
//            }
//        }
//        System.out.println(x);

        System.out.print("a");
        try {
            System.out.print("b");
            throw new IllegalArgumentException();
        } catch (RuntimeException e) {
            System.out.print("c");
        } finally {
            System.out.print("d");
        }
        System.out.print("e");
    }
}










