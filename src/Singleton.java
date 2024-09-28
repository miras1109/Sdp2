public class Singleton {
    public static void main(String[] args) {
        DatabaseConnection c1 = DatabaseConnection.getInstance();
        DatabaseConnection c2 = DatabaseConnection.getInstance();//creating instances

        if (c1 == c2) {
            System.out.println("connections are equal");
        } else {
            System.out.println("connections are not equal");//show equal or not
        }
        c1.connect();
        c2.disconnect();//show if it works as expected
    }
}
