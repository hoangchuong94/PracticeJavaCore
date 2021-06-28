package oop.sendmessage;

public class Phone {
    private String phoneName;
    private int model;
    public static String text;
    private String username;

    public Phone(String phoneName, int model, String username) {
        this.phoneName = phoneName;
        this.model = model;
        this.username = username;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void displayMessage() {
        System.out.println(getText());
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneName='" + getPhoneName() + '\'' +
                ", model=" + getModel() +
                ", username='" + getUsername() + '\'' +
                '}';
    }
}
