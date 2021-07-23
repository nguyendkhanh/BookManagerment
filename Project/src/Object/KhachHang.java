/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

/**
 *
 * @author khanh
 */
public class KhachHang {
    private String maKhachHang;
    private String matKhauKhachHang;
    private String ten;
    private String diaChi;
    private String sdt;

    public KhachHang() {
    }

    public KhachHang(String maKhachHang, String matKhauKhachHang, String ten, String diaChi, String sdt) {
        this.maKhachHang = maKhachHang;
        this.matKhauKhachHang = matKhauKhachHang;
        this.ten = ten;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getMatKhauKhachHang() {
        return matKhauKhachHang;
    }

    public void setMatKhauKhachHang(String matKhauKhachHang) {
        this.matKhauKhachHang = matKhauKhachHang;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
}
