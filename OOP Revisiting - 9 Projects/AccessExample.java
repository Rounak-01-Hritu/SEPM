// File: AccessExample.java

// A public class - visible to all other classes
public class AccessExample {

    // 1️⃣ private: visible only inside this class
    private String privateMessage = "Private: Only inside this class.";

    // 2️⃣ default (no modifier): visible within the same package
    String defaultMessage = "Default: Visible in the same package.";

    // 3️⃣ protected: visible in the same package and subclasses
    protected String protectedMessage = "Protected: Visible in same package and subclasses.";

    // 4️⃣ public: visible everywhere
    public String publicMessage = "Public: Visible from anywhere.";

    // Method to display all messages (inside the same class)
    public void showMessages() {
        System.out.println(privateMessage);
        System.out.println(defaultMessage);
        System.out.println(protectedMessage);
        System.out.println(publicMessage);
    }

    public static void main(String[] args) {
        AccessExample obj = new AccessExample();
        obj.showMessages(); // Access all within the same class
    }
}
