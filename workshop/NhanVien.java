/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.workshop;

import java.util.Objects;

/**
 *
 * @author Group2
 */
public class NhanVien implements Comparable<NhanVien> {

    private String ID, fullname, address;

    public NhanVien() {
    }

    public NhanVien(String ID) {
        this.ID = ID;
    }

    public NhanVien(String ID, String fullname, String address) {
        this.ID = ID;
        this.fullname = fullname;
        this.address = address;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "-Nhan vien: \n" + "\tID: " + ID + "\n\tHo va ten: " + fullname + "\n\tDia chi: " + address;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NhanVien other = (NhanVien) obj;
        return Objects.equals(this.ID, other.ID);
    }

    @Override
    public int compareTo(NhanVien o) {
        return this.ID.compareTo(o.ID);
    }

}
