/*
Author: Mogamat Wazeer Gilbert
Student No: 221374698
*/

package za.ac.cput;

import za.ac.cput.domain.*;
import za.ac.cput.factory.*;
import za.ac.cput.util.DisplayUtil;

import java.time.LocalDate;

public class Main {
    static void main(String[] args) {
        System.out.println("\n========== SHARK CAGE DIVING BOOKING SYSTEM  ==========\n");

        // ───────────────── CLIENT ─────────────────
        Client client = ClientFactory.createClient(
                "C001",
                "Mogamat",
                "Gilbert",
                "gilbert@cput.ac.za",
                "0821234567",
                "12 Voortrekker Road, Cape Town",
                "South African"
        );

        if (client != null) {
            DisplayUtil.display(client);
        }

        // ───────────────── BOOKING ────────────────
        Booking booking = BookingFactory.createBooking(
                LocalDate.of(2025, 7, 15),
                "Gilbert, Kannemeyer, Emeritus",
                true
        );

        if (booking != null) {
            DisplayUtil.display(booking);
        }

        // ───────────────── BOAT ───────────────────
        Boat boat = BoatFactory.createBoat(
                "B001",
                "Sea Breeze",
                12,
                LocalDate.of(2025, 7, 15)
        );

        if (boat != null) {
            DisplayUtil.display(boat);
        }

        // ───────────────── EQUIPMENT ──────────────
        Equipment equipment = EquipmentFactory.createEquipment(
                "E001",
                "Snorkel Set",
                "Good",
                20
        );

        if (equipment != null) {
            DisplayUtil.display(equipment);
        }

        // ───────────────── STAFF ──────────────────
        Staff staff = StaffFactory.createStaff(
                "S001",
                "Yaseen",
                "Kannemeyer",
                "0839876543",
                "kannemeyer@cput.ac.za",
                "Dive Instructor"
        );

        if (staff != null) {
            DisplayUtil.display(staff);
        }

        // ───────────────── TRANSPORT ──────────────
        Transport transport = TransportFactory.createTransport(
                "T001",
                "Cape Town CBD",
                "Minibus",
                "Tshegofatso Emeritus"
        );

        if (transport != null) {
            DisplayUtil.display(transport);
        }

    }
}