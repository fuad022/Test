package Projects;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        Integer i = new Integer(10);
        //Unboxing the Integer Object
        int i1 = i;
        System.out.println(i);
        System.out.println(i1);

        //Autoboxing of int
        Integer i2 = 11;
        //Auto-unboxing of Integer
        int i3 = i2;
        System.out.println(i2);
        System.out.println(i3);

        int i4 = 5;
        Integer intObj = new Integer(i4);
        System.out.println(intObj);
    }
}
