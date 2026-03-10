/*
Author: Mogamat Yaseen Kannemeyer
Student No: 240453182
*/

package za.ac.cput.domain;

public class Staff {
    private String staffNumber;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String staffEmail;
    private String role;

    private Staff() {}

    public Staff(Builder builder) {
        this.staffNumber = builder.staffNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phoneNumber = builder.phoneNumber;
        this.staffEmail = builder.staffEmail;
        this.role = builder.role;
    }

    public String getStaffNumber() {
        return staffNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getStaffEmail() {
        return staffEmail;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffNumber='" + staffNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", staffEmail='" + staffEmail + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public static class Builder {
        private String staffNumber;
        private String firstName;
        private String lastName;
        private String phoneNumber;
        private String staffEmail;
        private String role;

        public Builder setStaffNumber(String staffNumber) {
            this.staffNumber = staffNumber;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setStaffEmail(String staffEmail) {
            this.staffEmail = staffEmail;
            return this;
        }

        public Builder setRole(String role) {
            this.role = role;
            return this;
        }

        public Builder copy(Staff staff) {
            this.staffNumber = staff.staffNumber;
            this.firstName = staff.firstName;
            this.lastName = staff.lastName;
            this.phoneNumber = staff.phoneNumber;
            this.staffEmail = staff.staffEmail;
            this.role = staff.role;
            return this;
        }

        public Staff build() {
            return new Staff(this);
        }
    }
}
