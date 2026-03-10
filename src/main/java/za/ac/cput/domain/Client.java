package za.ac.cput.domain;

import java.util.Objects;

public class Client {
    protected String userId;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String phoneNumber;
    protected String nationality;

    private Client(){}

    //argument constructor
    public Client(Builder builder) {
        this.userId = builder.userId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.nationality = builder.nationality;
    }

    public String getUserId() {
        return userId;
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

    public String getNationality() {
        return nationality;
    }

    @Override
    public String toString() {
        return "Client{" +
                "userId='" + userId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }

    public static class Builder {
        private String userId;
        private String firstName;
        private String lastName;
        private String email;
        private String phoneNumber;
        private String nationality;

        public Builder setUserId(String userId) {
            this.userId = userId;
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

        public Builder setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public Builder copy(Client client) {
            this.userId = client.getUserId();
            this.firstName = client.getFirstName();
            this.lastName = client.getLastName();
            this.email = client.getEmail();
            this.phoneNumber = client.getPhoneNumber();
            this.nationality = client.getNationality();
            return this;
        }

        public Client build() {
            return new Client(this);
        }
    }
}
