/*
Author: Mogamat Wazeer Gilbert
Student No: 221374698
*/

package za.ac.cput.repository;

import za.ac.cput.domain.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientRepository implements IClientRepository {
    private static IClientRepository repository = null;
    private List<Client> clientList;

    private ClientRepository(){
        clientList = new ArrayList<>();
    }

    public static IClientRepository getRepository(){
        if(repository == null){
            repository = new ClientRepository();
        }
        return repository;
    }

    public Client create(Client client){
        boolean success = clientList.add(client);
        if(success){
            return client;
        }
        return null;
    }

    public Client read(String clientNumber){
        Client read = clientList.stream().filter(client -> client.getClientNumber()
        .equals(clientNumber)).findFirst()
                .orElse(null);
        return read;
    }

    public Client update(Client client){
        String id = client.getClientNumber();
        Client oldClient = read(id);
        if(oldClient != null){
            if(clientList.remove(oldClient)){
                if(clientList.add(client)){
                    return client;
                }
            }
        }
        return null;
    }

    public boolean delete(String clientNumber){
        Client clientToDelete = read(clientNumber);
        if(clientToDelete == null){
            return false;
        }
        return clientList.remove(clientToDelete);
    }

    public List<Client> getAll(){
        return clientList;
    }
}
