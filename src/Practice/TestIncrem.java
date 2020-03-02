package Practice;

public class TestIncrem {
    public static void main(String[] args) {
        int i = 1;
        Object obj = i;
        ++i;
        System.out.println(i);
        System.out.println(obj);
        System.out.println((short) obj);
    }
}
