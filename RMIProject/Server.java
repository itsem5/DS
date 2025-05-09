import java.rmi.*;

public class Server {
    public static void main(String[] args) {
        try {
            Servant s = new Servant();
            Naming.rebind("Server", s);
            System.out.println("Server is ready...");
        } catch (Exception e) {
            System.out.println("Server error: " + e);
        }
    }
}