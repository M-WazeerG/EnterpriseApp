/*
StaffRepository.java
Author: Mogamat Yaseen Kannemeyer
Student No: 240453182
Date: 10 March 2026
*/

package za.ac.cput.repository;

import za.ac.cput.domain.Staff;

import java.util.ArrayList;
import java.util.List;

public class StaffRepository implements IStaffRepository{
    private static IStaffRepository repository = null;
    private List<Staff> staffList;

    private StaffRepository(){
        staffList = new ArrayList<>();
    }

    public static IStaffRepository getRepository(){
        if (repository == null){
            repository = new StaffRepository();
        }
        return repository;
    }


    @Override
    public Staff create(Staff staff) {
        boolean success = staffList.add(staff);
        if (success) {
            return staff;
        }
        return null;
    }

    @Override
    public Staff read(String staffNumber) {
        Staff read = staffList.stream().filter(staff -> staff.getStaffNumber()
                        .equals(staffNumber))
                .findFirst()
                .orElse(null);
        return read;
    }

    @Override
    public Staff update(Staff staff) {
        String id = staff.getStaffNumber();
        Staff oldStaff = read(id);
        if (oldStaff != null) {
            if (staffList.remove(oldStaff)){
                if (staffList.add(staff)) {
                    return staff;
                }
            }
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        Staff staffToDelete = read(id);
        if (staffToDelete == null) {
            return false;
        }
        return (staffList.remove(staffToDelete));
    }


    @Override
    public List<Staff> getAll() {
        return staffList;
    }
}
