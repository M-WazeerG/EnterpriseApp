package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Client;
import za.ac.cput.factory.ClientFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)

class ClientRepositoryTest {
    private static IClientRepository repository = ClientRepository.getRepository();
    private static Client client = ClientFactory.createClient("80052305","Mogamat Wazeer","Gilbert","wazeergil@gmail.com","0828296448","South Africa");

    @Test
    void a_createClient() {
        Client createdClient = repository.create(client);
        assertNotNull(createdClient);
        System.out.println("Client created " + createdClient);
    }

    @Test
    void b_read(){
        Client read = repository.read(client.getUserId());
        assertEquals(client.getUserId(), read.getUserId());
        System.out.println("Client read " + read);
    }
    @Test
    void c_update(){
        Client newClient = new Client.Builder().copy(client)
                .setFirstName("Curtis")
                .build();
        Client updated = repository.update(newClient);
        assertNotNull(updated);
        System.out.println("Client updated " + updated);
    }

    @Test
    void d_delete(){
        boolean deleted = repository.delete(client.getUserId());
        assertTrue(deleted);
        System.out.println("Client deleted " + deleted);
    }

    @Test
    void f_getAll(){
        List<Client> clients = repository.getAll();
        System.out.println("Client list: " + clients);
    }
}
