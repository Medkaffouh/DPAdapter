import adapter.AdapterImpl;
import adapter.StandardImpl;

public class Test {
    public static void main(String[] args) {
        Client client = new Client();
        client.setStandard(new AdapterImpl());
        client.traitement(7,4);
    }
}
