package InnerClass;

public class Test {
    public static void main(String[] args) {
        Electrocar electrocar = new Electrocar(1);
        electrocar.start();

        // статический класс Battery внутри класса Electrocar.
        Electrocar.Battery battery = new Electrocar.Battery();
        battery.charge();
    }
}
