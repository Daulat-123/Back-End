package com.staffManage.demo.Staffs;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

@Entity
@Table
public class Staffs {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int StaffID;
    private String FullName;
    private String Address;
    private int PhoneNumber;
    private int Date;


    public Staffs() {
    }

    public Staffs(int staffID, String fullName, String address, int phoneNumber, int date) {
        StaffID = staffID;
        FullName = fullName;
        Address = address;
        PhoneNumber = phoneNumber;
        Date = date;
    }

    public int getStaffID() {
        return StaffID;
    }

    public void setStaffID(int staffID) {
        StaffID = staffID;
    }

    public String getFullName() {
        return FullName;
    }

    public static void setFullName(String fullName) {
        fullName = fullName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public int getDate() {
        return Date;
    }

    public void setDate(int date) {
        Date = date;
    }


    @Override
    public String toString() {
        return "Staffs{" +
                "StaffID=" + StaffID +
                ", FullName='" + FullName + '\'' +
                ", Address='" + Address + '\'' +
                ", PhoneNumber=" + PhoneNumber +
                ", Date=" + Date +
                '}';
    }

    private String FullName() {
        return FullName;
    }
}
