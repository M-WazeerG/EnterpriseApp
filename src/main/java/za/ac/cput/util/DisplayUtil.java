/*
DisplayUtil.java
Author: Mogamat Yaseen Kannemeyer
Student No: 240453182
Date: 23 March 2026
*/

package za.ac.cput.util;

import za.ac.cput.domain.*;

public class DisplayUtil {

    private static final String BORDER = "========================================";

    private DisplayUtil() {}

    private static void header(String title) {
        System.out.println(BORDER);
        System.out.println("   " + title.toUpperCase());
        System.out.println("----------------------------------------");
    }

    private static void field(String label, Object value) {
        System.out.println(label + " : " + (value == null ? "N/A" : value));
    }

    private static void footer() {
        System.out.println(BORDER);
        System.out.println();
    }

    // CLIENT
    public static void display(Client c) {
        header("Client Details");
        field("Client Number", c.getClientNumber());
        field("First Name", c.getFirstName());
        field("Last Name", c.getLastName());
        field("Email", c.getEmail());
        field("Phone", c.getPhoneNumber());
        field("Address", c.getAddress());
        field("Nationality", c.getNationality());
        footer();
    }

    // BOOKING
    public static void display(Booking b) {
        header("Booking Details");
        field("Booking Number", b.getBookingNumber());
        field("Date", b.getBookingDate());
        field("Participants", b.getBookingParticipants());
        field("Pickup Required", b.isPickupRequired() ? "Yes" : "No");
        footer();
    }

    // BOAT
    public static void display(Boat b) {
        header("Boat Details");
        field("Boat Number", b.getBoatNumber());
        field("Boat Name", b.getBoatName());
        field("Capacity", b.getCapacity());
        field("Trip Date", b.getTripDate());
        footer();
    }

    // EQUIPMENT
    public static void display(Equipment e) {
        header("Equipment Details");
        field("Equipment Number", e.getEquipmentNumber());
        field("Name", e.getEquipmentName());
        field("Condition", e.getCondition());
        field("On Hand", e.getOnHand());
        footer();
    }

    // STAFF
    public static void display(Staff s) {
        header("Staff Details");
        field("Staff Number", s.getStaffNumber());
        field("First Name", s.getFirstName());
        field("Last Name", s.getLastName());
        field("Phone", s.getPhoneNumber());
        field("Email", s.getStaffEmail());
        field("Role", s.getRole());
        footer();
    }

    // TRANSPORT
    public static void display(Transport t) {
        header("Transport Details");
        field("Transport Number", t.getTransportNumber());
        field("Pickup Location", t.getPickupLocation());
        field("Vehicle Type", t.getVehicleType());
        field("Driver", t.getDriverName());
        footer();
    }
}