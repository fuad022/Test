package DesignPatterns.Behavioral.TemplateMethod;

public class Facebook extends Network {

    public Facebook(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    boolean logIn(String userName, String password) {
        checkUserParameters(this.userName, this.password);
        System.out.println("\n\nLogIn success on Facebook");
        return true;
    }

    @Override
    void sendData(byte[] data) {
        System.out.println("Message: '" + new String(data) + "' was posted on Facebook");
    }

    @Override
    void logOut() {
        System.out.println("User: '" + userName + "' was logged out from Facebook");
    }
}
