/*
IClientRepository.java
Author: Mogamat Wazeer Gilbert (221374698)
Date: 16 March 2025
*/

package za.ac.cput.repository;

import za.ac.cput.domain.Client;

import java.util.List;

public interface IClientRepository extends IRepository<Client, String>{
    List<Client> getAll();
}
