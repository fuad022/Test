package DesignPatterns.Creational.AbstractFactory;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created Windows checkbox");
    }
}
