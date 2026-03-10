/*
Author: Mogamat Yaseen Kannemeyer
Student No: 240453182
*/

package za.ac.cput.repository;

import za.ac.cput.domain.Staff;

import java.util.List;

public interface IStaffRepository extends IRepository <Staff, String>{

    List<Staff> getAll();

}
