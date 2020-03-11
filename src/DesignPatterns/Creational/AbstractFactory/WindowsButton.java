package DesignPatterns.Creational.AbstractFactory;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created Windows button");
    }
}
