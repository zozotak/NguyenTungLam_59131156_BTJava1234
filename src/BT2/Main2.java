/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;
//

import BT1.NhanVien;

//

/**
 *
 * @author DELL
 */
public class Main2 {
    public static void main(String[] args) {
    // create quan ly nhan vien object
    IQuanLy QLNhanVien = new QuanLyNhanVien();

    // Tao NV 1
    NhanVien nv1 = new NhanVien();
    nv1.setTen("NV 1");
    nv1.setTuoi(20);
    nv1.setDiaChi("Nha Trang - Khanh Hoa");
    nv1.setTienLuong(10000000);
    nv1.setTongGioLam(200);

    // Tao NV 2
    NhanVien nv2 = new NhanVien();
    nv2.setTen("NV 2");
    nv2.setTuoi(21);
    nv2.setDiaChi("Nha Trang - Khanh Hoa");
    nv2.setTienLuong(30000000);
    nv2.setTongGioLam(400);

    // Tao NV 3
    NhanVien nv3 = new NhanVien();
    nv3.setTen("NV 3");
    nv3.setTuoi(22);
    nv3.setDiaChi("Nha Trang - Khanh Hoa");
    nv3.setTienLuong(5000000);
    nv3.setTongGioLam(600);

    // Tao NV 4
    NhanVien nv4 = new NhanVien();
    nv4.setTen("NV 4");
    nv4.setTuoi(23);
    nv4.setDiaChi("Tuy Hoa - Phu Yen");
    nv4.setTienLuong(7000000);
    nv4.setTongGioLam(800);

    // Tao NV 5
    NhanVien nv5 = new NhanVien();
    nv5.setTen("NV 5");
    nv5.setTuoi(24);
    nv5.setDiaChi("Nha Trang - Khanh Hoa");
    nv5.setTienLuong(90000000);
    nv5.setTongGioLam(100);

    // Them NV Vao List QLNV
    QLNhanVien.Them(nv1);
    QLNhanVien.Them(nv2);
    QLNhanVien.Them(nv3);
    QLNhanVien.Them(nv4);
    QLNhanVien.Them(nv5);

    // In Ds NV
    QLNhanVien.inDS();
  }
}