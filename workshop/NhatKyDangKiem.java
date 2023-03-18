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
public class NhatKyDangKiem implements Comparable<NhatKyDangKiem> {

    private String registrationCode;
    private int registrationDate;
    private NhanVien staff;
    private Xe oto;
    private boolean status;

    public NhatKyDangKiem() {
    }

    public NhatKyDangKiem(String registrationCode) {
        this.registrationCode = registrationCode;
    }

    public NhatKyDangKiem(String registrationCode, int registrationDate, NhanVien staff, Xe oto, boolean status) {
        this.registrationCode = registrationCode;
        this.registrationDate = registrationDate;
        this.staff = staff;
        this.oto = oto;
        this.status = status;
    }

    public String getRegistrationCode() {
        return registrationCode;
    }

    public void setRegistrationCode(String registrationCode) {
        this.registrationCode = registrationCode;
    }

    public int getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(int registrationDate) {
        this.registrationDate = registrationDate;
    }

    public NhanVien getStaff() {
        return staff;
    }

    public void setStaff(NhanVien staff) {
        this.staff = staff;
    }

    public Xe getOto() {
        return oto;
    }

    public void setOto(Xe oto) {
        this.oto = oto;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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
        final NhatKyDangKiem other = (NhatKyDangKiem) obj;
        return Objects.equals(this.registrationCode, other.registrationCode);
    }

    @Override
    public int compareTo(NhatKyDangKiem o) {
        return this.registrationCode.compareTo(o.registrationCode);
    }

    @Override
    public String toString() {
        return "-Nhat ky dang kiem: \n" + "\tMa dang kiem: " + registrationCode + "\n\tNgay dang kiem: " + registrationDate + "\n" + staff + "\n" + oto + "\n\tTrang thai dang kiem: " + status;
    }

}
