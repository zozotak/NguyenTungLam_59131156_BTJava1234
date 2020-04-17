/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author DELL
 */
public class Main1 {
    public static void main(String[] args) {
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
        nv2.setTongGioLam(150);

        // In TT NV
        System.out.println(nv1.getThongTin());
        System.out.println(nv2.getThongTin());
  } 
}
