/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.workshop;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> nv = new ArrayList<NhanVien>();
        ArrayList<Xe> xe = new ArrayList<Xe>();
        ArrayList<NhatKyDangKiem> nk = new ArrayList<NhatKyDangKiem>();
        int choose1 = 10, choose1_1 = 10, choose1_2 = 10, choose1_3 = 10;
        main ts = new main();
        do {
            System.out.println("* * * * * * * * *MENU* * * * * * * * *"
                    + "\n1. Nhan vien."
                    + "\n2. O to."
                    + "\n3. Nhat ky dang kiem."
                    + "\n0. Thoat chuong trinh.");
            choose1 = IOCE171514.getInteger("Vui long chon che do: ", "Nhap loi! Che do chi tu 0-3\n0", 0, 3);
            switch (choose1) {
                case 1:
                    do {
                        System.out.println("Vui long chon che do: "
                                + "\n\t\t1. Them nhan vien."
                                + "\n\t\t2. Xoa nhan vien."
                                + "\n\t\t3. Sua nhan vien."
                                + "\n\t\t4. Xuat danh sach nhan vien."
                                + "\n\t\t5. Luu vao file 'NhanVien'."
                                + "\n\t\t0. Tro ve.");
                        choose1_1 = IOCE171514.getInteger("Moi ban chon che do: ", "Nhap loi! Che do chi tu 0-5!\n", 0, 5);
                        switch (choose1_1) {
                            case 1://1. Them nhan vien.
                                nv.add(ts.function1());
                                break;
                            case 2://2. Xoa nhan vien.
                                ts.function2(nv);
                                break;
                            case 3://3. Sua nhan vien.
                                ts.function3(nv);
                                break;
                            case 4://4. Xuat danh sach nhan vien.
                                ts.function4(nv);
                                break;
                            case 5:
                                ts.addToFileNhanVien(nv);
                                break;

                        }
                    } while (choose1_1 != 0);
                    break;
                case 2:
                    do {
                        System.out.println("Vui long chon che do: "
                                + "\n\t\t1. Them o to."
                                + "\n\t\t2. Xoa o to."
                                + "\n\t\t3. Sua o to."
                                + "\n\t\t4. Xuat danh sach o to."
                                + "\n\t\t5. Luu vao file 'Oto'."
                                + "\n\t\t0. Tro ve.");
                        choose1_2 = IOCE171514.getInteger("Moi ban chon che do: ", "Nhap loi! Che do chi tu 0-5!\n", 0, 5);
                        switch (choose1_2) {
                            case 1://1. Them xe.
                                xe.add(ts.function5());
                                break;
                            case 2://2. Xoa xe.
                                ts.function6(xe);
                                break;
                            case 3://3. Sua xe.
                                ts.function7(xe);
                                break;
                            case 4://4. Xuat danh sach xe.
                                ts.function8(xe);
                                break;
                            case 5:
                                ts.addToFileOto(xe);
                                break;

                        }
                    } while (choose1_2 != 0);
                    break;
                case 3:
                    do {
                        System.out.println("Vui long chon che do: "
                                + "\n\t\t1. Them nhat ky dang kiem."
                                + "\n\t\t2. Xoa nhat ky dang kiem."
                                + "\n\t\t3. Sua nhat ky dang kiem."
                                + "\n\t\t4. Xuat danh sach nhat ky dang kiem."
                                + "\n\t\t5. Luu vao file 'NhatKyDangKiem'."
                                + "\n\t\t0. Tro ve.");
                        choose1_3 = IOCE171514.getInteger("Moi ban chon che do: ", "Nhap loi! Che do chi tu 0-5!\n", 0, 5);
                        switch (choose1_3) {
                            case 1://1. Them nhat ky dang kiem.
                                nk.add(ts.function9(nv, xe));
                                break;
                            case 2://2. Xoa nhat ky dang kiem.
                                ts.function10(nk);
                                break;
                            case 3://3. Sua nhat ky dang kiem.
                                ts.function11(nk, nv, xe);
                                break;
                            case 4://4. Xuat danh sach nhat ky dang kiem.
                                ts.function12(nk);
                                break;
                            case 5:
                                ts.addToFileNhatKyDangKiem(nk);
                                break;
                        }
                    } while (choose1_3 != 0);
                    break;
            }
        } while (choose1 != 0);
    }

    //Them nhan vien.
    public NhanVien function1() {
        String ID = IOCE171514.getString("Nhap ID: ", "Nhap loi! ID toi da 5 ky tu!\n", 5);
        String fullName = IOCE171514.getString("Nhap ten: ", "Nhap loi!\n");
        String address = IOCE171514.getString("Nhap dia chi: ", "Nhap loi!\n");
        System.out.println("Them nhan vien thanh cong!");
        return new NhanVien(ID, fullName, address);
    }

    //Xoa nhan vien.
    public void function2(ArrayList<NhanVien> list) {
        int count = 0;
        String ID = IOCE171514.getString("Nhap ID nhan vien can xoa: ", "Nhap loi! ID toi da 5 ky tu!\n", 5);
        NhanVien nv1 = new NhanVien(ID);
        if (list.contains(nv1)) {
            System.out.println("Xoa thanh cong!");
        } else {
            System.out.println("Khong co nhan vien co ma nhan vien: " + ID);
        }
        list.remove(nv1);
    }

    ////Sua nhan vien.
    public void function3(ArrayList<NhanVien> list) {
        int count = 0;
        String ID = IOCE171514.getString("Nhap ID nhan vien can chinh sua: ", "Nhap loi! ID toi da 5 ky tu!\n", 5);
        for (NhanVien nhanVien : list) {
            if (ID.equals(nhanVien.getID())) {
                String IDNew = IOCE171514.getString("Nhap ID moi: ", "Nhap loi! ID toi da 5 ky tu!\n", 5);
                nhanVien.setID(IDNew);
                String fullName = IOCE171514.getString("Nhap moi: ", "Nhap loi!\n");
                nhanVien.setFullname(fullName);
                String address = IOCE171514.getString("Nhap dia chi moi: ", "Nhap loi!\n");
                nhanVien.setAddress(address);
                System.out.println("Chinh sua thanh cong!");
                ++count;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Khong co nhan vien co ma nhan vien: " + ID);
        }
    }

    //4. Xuat danh sach nhan vien.
    public void function4(ArrayList<NhanVien> list) {
        for (NhanVien nhanVien : list) {
            System.out.println(nhanVien);
        }
    }

    //Them o to.
    public Xe function5() {
        String codeOfOto = IOCE171514.getString("Nhap ma o to: ", "Nhap loi! Ma o to khong qua 10 ky tu!\n", 10);
        String kindOfOto = IOCE171514.getString("Nhap loai o to: ", "Nhap loi!\n");
        String nameOfOto = IOCE171514.getString("Vui long nhap ten o to: ", "Nhap loi!\n");
        String frameNumber = IOCE171514.getString("Nhap so khung: ", "Nhap loi! So khung khong vuot qua 7 ky tu!\n", 7);
        String machineNumber = IOCE171514.getString("Nhap so may: ", "Nhap loi! So may khong vuot qua 10 ky tu!\n", 10);
        int dateOfProduct = IOCE171514.getInteger("Nhap ngay san xuat: ", "Nhap loi!\n", 1, 31);
        String color = IOCE171514.getString("Nhap mau o to: ", "Nhap loi!\n");
        System.out.println("Them o to thanh cong!");
        return new Xe(codeOfOto, kindOfOto, nameOfOto, frameNumber, machineNumber, machineNumber, dateOfProduct, color);
    }

    //Xoa o to.
    public void function6(ArrayList<Xe> list) {
        String codeOfOto = IOCE171514.getString("Nhap ma o to: ", "Nhap loi! Ma o to khong qua 10 ky tu!\n", 10);
        Xe xe = new Xe(codeOfOto);
        if (list.contains(xe)) {
            System.out.println("Xoa thanh cong!");
        } else {
            System.out.println("Khong co o to co ma: " + codeOfOto);
        }
        list.remove(xe);
    }

    //Sua o to.
    public void function7(ArrayList<Xe> list) {
        String codeOfOto = IOCE171514.getString("Nhap ma o to can chinh sua: ", "Nhap loi! Ma o to khong qua 10 ky tu!\n", 10);
        int count = 0;
        for (Xe xe : list) {
            if (codeOfOto.equals(xe.getCodeOfOto())) {
                String codeOfOtoNew = IOCE171514.getString("Nhap ma o to moi: ", "Nhap loi! Ma o to khong qua 10 ky tu!\n", 10);
                xe.setCodeOfOto(codeOfOtoNew);
                String kindOfOto = IOCE171514.getString("Nhap loai o to moi: ", "Nhap loi!\n");
                xe.setKindOfOto(kindOfOto);
                String nameOfOto = IOCE171514.getString("Vui long nhap ten o to moi: ", "Nhap loi!\n");
                xe.setNameOfOto(nameOfOto);
                String frameNumber = IOCE171514.getString("Nhap so khung moi: ", "Nhap loi! So khung khong vuot qua 7 ky tu!\n", 7);
                xe.setFrameNumber(frameNumber);
                String machineNumber = IOCE171514.getString("Nhap so may moi: ", "Nhap loi! So may khong vuot qua 10 ky tu!\n", 10);
                xe.setMachineNumber(machineNumber);
                int dateOfProduct = IOCE171514.getInteger("Nhap ngay san xuat moi: ", "Nhap loi!\n", 1, 31);
                xe.setDateOfProduct(dateOfProduct);
                String color = IOCE171514.getString("Nhap mau o to moi: ", "Nhap loi!\n");
                xe.setCollorOfOto(codeOfOto);
                System.out.println("Chinh sua thanh cong!");
                ++count;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Khong co o to co ma: " + codeOfOto);
        }
    }

    //Xuat danh sach o to.
    public void function8(ArrayList<Xe> list) {
        for (Xe xe : list) {
            System.out.println(xe);
        }
    }

    //Them nhat ky dang kiem.
    public NhatKyDangKiem function9(ArrayList<NhanVien> listNV, ArrayList<Xe> listXe) {
        String registrationCode = IOCE171514.getString("Nhap ma dang kiem: ", "Nhap loi! Ma dang kiem khong vuot qua 5 ky tu!\n", 5);
        int registrationDate = IOCE171514.getInteger("Nhap ngay dang kiem: ", "Nhap loi! Ngay dang kiem tu 1-31!\n", 1, 31);
        String ID = IOCE171514.getString("Nhap ID nhan vien: ", "Nhap loi! ID vien khong vuot qua 5 ky tu!\n", 5);
        NhanVien nv = new NhanVien(null, null, null);
        for (NhanVien nhanVien : listNV) {
            if (ID.equals(nhanVien.getID())) {
                nv = nhanVien;
                break;
            }
        }
        String codeOfOto = IOCE171514.getString("Nhap ma xe: ", "Nhap loi! Ma xe khong vuot qua 10 ky tu!\n", 10);
        Xe xe1 = new Xe(null, null, null, null, null, null, 0, null);
        for (Xe xe : listXe) {
            if (codeOfOto.equals(xe.getCodeOfOto())) {
                xe1 = xe;
                break;
            }
        }
        boolean status;
        int Enter = IOCE171514.getInteger("Nhap trang thai dang kiem(1: dat va 0: Khong dat): ", "Nhap loi! Chi chap nhap hai trang thai 1: dat va 0: Khong dat!\n", 0, 1);
        if (Enter == 1) {
            status = true;
        } else {
            status = false;
        }
        System.out.println("Them nhat ky dang kiem thanh cong!");
        return new NhatKyDangKiem(registrationCode, registrationDate, nv, xe1, status);
    }

    //Xoa nhat ky dang kiem.
    public void function10(ArrayList<NhatKyDangKiem> list) {
        String registrationCode = IOCE171514.getString("Nhap ma dang kiem ban can xoa: ", "Nhap loi! Ma dang kiem khong vuot qua 5 ky tu!\n", 5);
        NhatKyDangKiem nkRemove = new NhatKyDangKiem(registrationCode);
        if (list.contains(nkRemove)) {
            System.out.println("Xoa thanh cong!");
        } else {
            System.out.println("Khong co nhat ky dang kiem co ma dang kiem: " + registrationCode);
        }
        list.remove(nkRemove);
    }

    //Sua nhat ky dang kiem.
    public void function11(ArrayList<NhatKyDangKiem> list, ArrayList<NhanVien> listNV, ArrayList<Xe> listXe) {
        String registrationCode = IOCE171514.getString("Nhap ma dang kiem can chinh sua: ", "Nhap loi! Ma dang kiem khong qua 5 ky tu!\n", 5);
        int count = 0;
        for (NhatKyDangKiem nhatKyDangKiem : list) {
            if (registrationCode.equals(nhatKyDangKiem.getRegistrationCode())) {
                int registrationDateNew = IOCE171514.getInteger("Nhap ngay dang kiem moi: ", "Nhap loi! Ngay dang kiem tu 1-31!\n", 1, 31);
                nhatKyDangKiem.setRegistrationDate(registrationDateNew);
                NhanVien nvNew = new NhanVien(null, null, null);
                String IDNew = IOCE171514.getString("Nhap ID nhan vien moi: ", "Nhap loi! ID vien khong vuot qua 5 ky tu!\n", 5);
                for (NhanVien nhanVien1 : listNV) {
                    if (IDNew.equals(nhanVien1.getID())) {
                        nvNew = nhanVien1;
                        break;
                    }
                }
                nhatKyDangKiem.setStaff(nvNew);
                Xe xeNew = new Xe(null, null, null, null, null, null, 0, null);
                String codeOfOtoNew = IOCE171514.getString("Nhap ma xe moi: ", "Nhap loi! Ma xe khong qua 10 ky tu!\n", 10);
                for (Xe xe1 : listXe) {
                    if (codeOfOtoNew.equals(xe1.getCodeOfOto())) {
                        xeNew = xe1;
                        break;
                    }
                }
                nhatKyDangKiem.setOto(xeNew);
                boolean statusNew;
                int Enter = IOCE171514.getInteger("Nhap trang thai dang kiem(1: dat va 0: Khong dat) moi: ", "Nhap loi! Chi chap nhap hai trang thai 1: dat va 0: Khong dat!\n", 0, 1);
                if (Enter == 1) {
                    statusNew = true;
                } else {
                    statusNew = false;
                }
                nhatKyDangKiem.setStatus(statusNew);
                System.out.println("Chinh sua thanh cong!");
                ++count;

            }
        }
        if (count == 0) {
            System.out.println("Khong co nhat ky dang kiem co ma dang kiem: " + registrationCode);
        }
    }

    //Xuat danh sach nhat ky dang kiem.
    public void function12(ArrayList<NhatKyDangKiem> list) {
        for (NhatKyDangKiem nhatKyDangKiem : list) {
            System.out.println(nhatKyDangKiem);
        }

    }

    
    public void addToFileNhanVien(ArrayList<NhanVien> list) {
        try {
            FileWriter fw = new FileWriter("NhanVien.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(fw);
            for (NhanVien nv : list) {
                pw.println(nv.toString());
            }
            bw.close();
            pw.close();
            System.out.println("Luu thanh cong!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void addToFileOto(ArrayList<Xe> list) {
        try {
            FileWriter fw = new FileWriter("Oto.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(fw);
            for (Xe xe : list) {
                pw.println(xe.toString());
            }
            bw.close();
            pw.close();
            System.out.println("Luu thanh cong!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void addToFileNhatKyDangKiem(ArrayList<NhatKyDangKiem> list) {
        try {
            FileWriter fw = new FileWriter("NhatKyDangKiem.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(fw);
            for (NhatKyDangKiem nk : list) {
                pw.println(nk.toString());
            }
            bw.close();
            pw.close();
            System.out.println("Luu thanh cong!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
