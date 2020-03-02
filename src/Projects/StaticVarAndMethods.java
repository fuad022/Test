package Projects;

public class StaticVarAndMethods {
    public static int variable;

    public static void foo() {
        System.out.println(variable);
        StaticVarAndMethods s = new StaticVarAndMethods();
        s.show();
    }

    public void show() {
        System.out.println(variable);
        foo();
    }
}
