package za.ac.cput;

import za.ac.cput.domain.Client;
import za.ac.cput.factory.ClientFactory;

public class Main {
    public static void main(String[] args) {
        Client client = ClientFactory.createClient("80052305","Mogamat Wazeer","Gilbert","wazeergil@gmail.com","0828296448","","South Africa");
        System.out.println(client);
    }
}
