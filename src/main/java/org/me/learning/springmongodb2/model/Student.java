package org.me.learning.springmongodb2.model;


import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

//for some reason lombok does not work here
@Document(collection = "student")
public class Student {

    private String firstName;
    private String lastName;
    private String email;
    private Gender gender;
    private Address address;
    private List<String> favouriteSubjects;
    private BigDecimal totalSpendInBooks;
    private LocalDateTime createdDate;

// usually the id in mongoDb will be auto generated
    public Student(String firstName, String lastName, String email, Gender gender, Address address, List<String> favouriteSubjects, BigDecimal totalSpendInBooks, LocalDateTime createdDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.favouriteSubjects = favouriteSubjects;
        this.totalSpendInBooks = totalSpendInBooks;
        this.createdDate = createdDate;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setFavouriteSubjects(List<String> favouriteSubjects) {
        this.favouriteSubjects = favouriteSubjects;
    }

    public void setTotalSpendInBooks(BigDecimal totalSpendInBooks) {
        this.totalSpendInBooks = totalSpendInBooks;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
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

    public Gender getGender() {
        return gender;
    }

    public Address getAddress() {
        return address;
    }

    public List<String> getFavouriteSubjects() {
        return favouriteSubjects;
    }

    public BigDecimal getTotalSpendInBooks() {
        return totalSpendInBooks;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", address=" + address +
                ", favouriteSubjects=" + favouriteSubjects +
                ", totalSpendInBooks=" + totalSpendInBooks +
                ", createdDate=" + createdDate +
                '}';
    }
}
