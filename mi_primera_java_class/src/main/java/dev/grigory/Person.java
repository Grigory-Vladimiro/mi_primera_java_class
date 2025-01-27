package dev.grigory;

public class Person { 
    private String firstName;
    private String lastName;
    private String idNumber;
    private int yearOfBirth;

    public Person(String firstName, String lastName, String idNumber, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.yearOfBirth = yearOfBirth;
    }
public String getFirstName() {
    return firstName;
    }
public String getLastName() {
    return lastName;
    }
public String getIdNumber() {
    return idNumber;                
    }
public int getYearOfBirth() {
    return yearOfBirth;
    }   

@Override
public String toString() {
    return "Person{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", idNumber='" + idNumber + '\'' +
            ", yearOfBirth=" + yearOfBirth +
            '}';
    }
}
