package DesignPatterns.Creational.AbstractFactory;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacOS button");
    }
}
