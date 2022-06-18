import adapter.AdapterImpl;
import adapter.AdapterImpl2;
import adapter.StandardImpl;

public class Test {
    public static void main(String[] args) {
        Client client = new Client();
        client.setStandard(new AdapterImpl2());
        client.traitement(7,4);
    }
}
