/*
BoatRepository.java
Author: Mogamat Yaseen Kannemeyer
Student No: 240453182
Date: 17 March 2026
*/

package za.ac.cput.repository;

import za.ac.cput.domain.Boat;

import java.util.ArrayList;
import java.util.List;

public class BoatRepository implements IBoatRepository {
    private static IBoatRepository repository = null;
    private List<Boat> boatList;

    private BoatRepository() {
        boatList = new ArrayList<>();
    }

    public static IBoatRepository getRepository() {
        if (repository == null) {
            repository = new BoatRepository();
        }
        return repository;
    }

    @Override
    public Boat create(Boat boat) {
        boolean success = boatList.add(boat);
        if (success) {
            return boat;
        }
        return null;
    }

    @Override
    public Boat read(String boatNumber) {
        Boat read = boatList.stream()
                .filter(boat -> boat.getBoatNumber().equals(boatNumber))
                .findFirst()
                .orElse(null);
        return read;
    }

    @Override
    public Boat update(Boat boat) {
        String id = boat.getBoatNumber();
        Boat oldBoat = read(id);
        if (oldBoat != null) {
            if (boatList.remove(oldBoat)) {
                if (boatList.add(boat)) {
                    return boat;
                }
            }
        }
        return null;
    }

    @Override
    public boolean delete(String boatNumber) {
        Boat boatToDelete = read(boatNumber);
        if (boatToDelete == null) {
            return false;
        }
        return boatList.remove(boatToDelete);
    }

    @Override
    public List<Boat> getAll() {
        return boatList;
    }
}