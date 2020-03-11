package DesignPatterns.Creational.AbstractFactory;

public class DemoClient {

    private static Application configureApplication() {
        Application app = null;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else if (osName.contains("windows")) {
            factory = new WindowsFactory();
            app = new Application(factory);
        } else {
            System.out.println("Unknown OS");
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
