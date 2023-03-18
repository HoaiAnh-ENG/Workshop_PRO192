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
public class Xe implements Comparable<Xe> {

    private String codeOfOto, kindOfOto, nameOfOto, personRegister, frameNumber, machineNumber;
    private int dateOfProduct;
    private String collorOfOto;

    public Xe() {
    }

    public Xe(String codeOfOto) {
        this.codeOfOto = codeOfOto;
    }

    public Xe(String codeOfOto, String kindOfOto, String nameOfOto, String personRegister, String frameNumber, String machineNumber, int dateOfProduct, String collorOfOto) {
        this.codeOfOto = codeOfOto;
        this.kindOfOto = kindOfOto;
        this.nameOfOto = nameOfOto;
        this.personRegister = personRegister;
        this.frameNumber = frameNumber;
        this.machineNumber = machineNumber;
        this.dateOfProduct = dateOfProduct;
        this.collorOfOto = collorOfOto;
    }

    public String getCodeOfOto() {
        return codeOfOto;
    }

    public void setCodeOfOto(String codeOfOto) {
        this.codeOfOto = codeOfOto;
    }

    public String getKindOfOto() {
        return kindOfOto;
    }

    public void setKindOfOto(String kindOfOto) {
        this.kindOfOto = kindOfOto;
    }

    public String getNameOfOto() {
        return nameOfOto;
    }

    public void setNameOfOto(String nameOfOto) {
        this.nameOfOto = nameOfOto;
    }

    public String getPersonRegister() {
        return personRegister;
    }

    public void setPersonRegister(String personRegister) {
        this.personRegister = personRegister;
    }

    public String getFrameNumber() {
        return frameNumber;
    }

    public void setFrameNumber(String frameNumber) {
        this.frameNumber = frameNumber;
    }

    public String getMachineNumber() {
        return machineNumber;
    }

    public void setMachineNumber(String machineNumber) {
        this.machineNumber = machineNumber;
    }

    public int getDateOfProduct() {
        return dateOfProduct;
    }

    public void setDateOfProduct(int dateOfProduct) {
        this.dateOfProduct = dateOfProduct;
    }

    public String getCollorOfOto() {
        return collorOfOto;
    }

    public void setCollorOfOto(String collorOfOto) {
        this.collorOfOto = collorOfOto;
    }

    @Override
    public String toString() {
        return "-O to: \n" + "\tMa o to: " + codeOfOto + "\n\tLoai o to: " + kindOfOto + "\n\tTen o to: " + nameOfOto + "\n\tNguoi dang ky: " + personRegister + "\n\tSo khung: " + frameNumber + "\n\tSo may: " + machineNumber + "\n\tNgay san xuat: " + dateOfProduct + "\n\tMau o to: " + collorOfOto ;
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
        final Xe other = (Xe) obj;
        return Objects.equals(this.codeOfOto, other.codeOfOto);
    }

    @Override
    public int compareTo(Xe o) {
        return this.codeOfOto.compareTo(o.codeOfOto);
    }
}
