package com.company.Lab7.Zad2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person
{
    private String name;
    private String email;
    private String phoneNumber;
    private LocalDate dateOfBirth;

    public Person(String name, String email, String phoneNumber, LocalDate dateOfBirth) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public Person(String name, String email, String phoneNumber, String dateOfBirth) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.setDateOfBirth(dateOfBirth);
    }

    Period jedenDzien = Period.ofDays(1);
    Period szescTygodni = Period.ofWeeks(6);
    Period dwaMiesiace = Period.ofMonths(2);
    Period trzyLata = Period.ofMonths(3);
    Period jedenRokDwaMiesiaceTrzyDni = Period.of(1, 2, 3);


    public int getAge(){
        LocalDate today = LocalDate.now();
        Period period = Period.between(this.dateOfBirth, today);
        return period.getYears();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
