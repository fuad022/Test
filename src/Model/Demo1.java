package Model;

public class Demo1 {
    public static void main(String[] args) {
        Test1 test1 = new Test1();

        if ("".equals(test1.getName())) {
            System.out.println("empty");
        } else {
            System.out.println("full");
        }
//        System.out.println(test1.getName());
    }
}
