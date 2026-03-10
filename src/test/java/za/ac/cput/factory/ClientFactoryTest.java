package za.ac.cput.factory;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Client;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.MethodName.class)
class ClientFactoryTest {
    private static Client client1, client2;

    @BeforeEach
    void setup() {
        client1 = ClientFactory.createClient("80052305","Mogamat Wazeer","Gilbert","wazeergil@gmail.com","0828296448","South Africa");
        client2 = ClientFactory.createClient("80052306","Mohamed","Salah","mosalah@gmail.com","07494536610","Egypt");
    }

    @Test
    void a_testClient(){
        assertNotNull(client1);
        System.out.println(client1.toString());
    }

    @Test
    void b_testClientThatFails(){
        assertNotNull(client2);
        System.out.println(client2.toString());
    }
}
