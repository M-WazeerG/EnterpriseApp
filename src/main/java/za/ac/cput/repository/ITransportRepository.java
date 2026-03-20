/*
Author: Hlabela Tshegofatso Emeritus
Student No: 22275016
*/



package za.ac.cput.repository;

import za.ac.cput.domain.Transport;
import java.util.List;

public interface ITransportRepository extends IRepository<Transport, String> {
    List<Transport> getAll();
}