/*
Author: Mogamat Wazeer Gilbert
Student No: 221374698
*/

package za.ac.cput.repository;

import za.ac.cput.domain.Client;

import java.util.List;

public interface IClientRepository extends IRepository<Client, String>{
    List<Client> getAll();
}
