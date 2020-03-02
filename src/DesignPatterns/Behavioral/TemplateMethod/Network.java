package DesignPatterns.Behavioral.TemplateMethod;

public abstract class Network {

    String userName;
    String password;

    Network() {
    }

    final boolean post(String message) {
        if (logIn(this.userName, this.password)) {
            sendData(message.getBytes());
            logOut();
            return true;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);

    abstract void sendData(byte[] data);

    abstract void logOut();

    void checkUserParameters(String userName, String password) {
        System.out.println("\nChecking user's parameters");
        System.out.println("Name: " + userName);
        System.out.println("Password: ");
        for (int i = 0; i < password.length(); i++) {
            System.out.print("*");
        }
        simulateNetworkLatency();
    }

    private void simulateNetworkLatency() {
        try {
            int i = 0;
            System.out.println();
            while (i < 10) {
                System.out.print(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
