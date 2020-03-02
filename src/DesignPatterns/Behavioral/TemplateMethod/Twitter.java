package DesignPatterns.Behavioral.TemplateMethod;

public class Twitter extends Network {

    public Twitter(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    boolean logIn(String userName, String password) {
        checkUserParameters(this.userName, this.password);
        System.out.println("\n\nLogIn success on Twitter");
        return true;
    }

    @Override
    void sendData(byte[] data) {
        System.out.println("Message: '" + new String(data) + "' was posted on Twitter");
    }

    @Override
    void logOut() {
        System.out.println("User: '" + userName + "' was logged out from Twitter");
    }
}
