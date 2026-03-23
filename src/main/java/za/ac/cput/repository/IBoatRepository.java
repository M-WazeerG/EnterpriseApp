/*
IBoatRepository.java
Author: Mogamat Yaseen Kannemeyer
Student No: 240453182
Date: 17 March 2026
*/

package za.ac.cput.repository;

import za.ac.cput.domain.Boat;

import java.util.List;

public interface IBoatRepository extends IRepository<Boat, String> {

    List<Boat> getAll();

}