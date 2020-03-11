package DesignPatterns.Creational.AbstractFactory;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created MacOS checkbox");
    }
}
