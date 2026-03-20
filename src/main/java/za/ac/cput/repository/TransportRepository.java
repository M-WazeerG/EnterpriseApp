/*
Author: Hlabela Tshegofatso Emeritus
Student No: 22275016
*/


package za.ac.cput.repository;

import za.ac.cput.domain.Transport;
import java.util.ArrayList;
import java.util.List;

public class TransportRepository implements ITransportRepository {
    private static ITransportRepository repository = null;
    private List<Transport> transportList;

    private TransportRepository() {
        transportList = new ArrayList<>();
    }

    public static ITransportRepository getRepository() {
        if (repository == null) {
            repository = new TransportRepository();
        }
        return repository;
    }

    @Override
    public Transport create(Transport transport) {
        boolean success = transportList.add(transport);
        if (success) {
            return transport;
        }
        return null;
    }

    @Override
    public Transport read(String transportNumber) {
        Transport read = transportList.stream()
                .filter(t -> t.getTransportNumber().equals(transportNumber))
                .findFirst()
                .orElse(null);
        return read;
    }

    @Override
    public Transport update(Transport transport) {
        String id = transport.getTransportNumber();
        Transport oldTransport = read(id);
        if (oldTransport != null) {
            if (transportList.remove(oldTransport)) {
                if (transportList.add(transport)) {
                    return transport;
                }
            }
        }
        return null;
    }

    @Override
    public boolean delete(String transportNumber) {
        Transport transportToDelete = read(transportNumber);
        if (transportToDelete == null) {
            return false;
        }
        return transportList.remove(transportToDelete);
    }

    @Override
    public List<Transport> getAll() {
        return transportList;
    }
}