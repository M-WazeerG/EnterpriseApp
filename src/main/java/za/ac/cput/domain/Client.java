/*
Client.java
Author: Mogamat Wazeer Gilbert (221374698)
Date: 16 March 2025
*/

package za.ac.cput.domain;

import java.util.Objects;

public class Client {
    protected String clientNumber;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String phoneNumber;
    protected String address;
    protected String nationality;

    private Client(){}

    //argument constructor
    public Client(Builder builder) {
        this.clientNumber = builder.clientNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
        this.nationality = builder.nationality;
    }

    public String getClientNumber() {
        return clientNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getNationality() {
        return nationality;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientNumber='" + clientNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }

    public static class Builder {
        private String clientNumber;
        private String firstName;
        private String lastName;
        private String email;
        private String phoneNumber;
        private String address;
        private String nationality;

        public Builder setClientNumber(String clientNumber) {
            this.clientNumber = clientNumber;
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

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public Builder copy(Client client) {
            this.clientNumber = client.getClientNumber();
            this.firstName = client.getFirstName();
            this.lastName = client.getLastName();
            this.email = client.getEmail();
            this.phoneNumber = client.getPhoneNumber();
            this.address = client.getAddress();
            this.nationality = client.getNationality();
            return this;
        }

        public Client build() {
            return new Client(this);
        }
    }
}
