/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Object.KhachHang;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author khanh
 */
public class KhachHangData {
    public static PreparedStatement ps;
    public static ResultSet rs;
    public KhachHang dangNhap(String taiKhoan, String pass) {
        KhachHang kh = null;
        try{
            ps = Connect.getConnect().prepareStatement("SELECT * FROM KhachHang where maKhachHang = ? and matKhauKhachHang=?");
            ps.setString(1, taiKhoan);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while(rs.next()) {
                kh = new KhachHang();
                kh.setTen(rs.getString("ten"));
                kh.setDiaChi(rs.getString("diaChi"));
                kh.setSdt(rs.getString("sdt"));
            }
        }
        catch(Exception e) {
            return kh = null;
        }
        return kh;
    }
    
    
    public static ResultSet showTextfield(String sql) {
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            return ps.executeQuery();
        } catch (Exception e) {
            return null;
        }
    }
    
     public static void InsertKhachHang(KhachHang kh) {
        String sql = "insert into KhachHang values(?,?,?,?,?)";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, kh.getMaKhachHang());
            ps.setString(2, kh.getMatKhauKhachHang());
            ps.setString(3, kh.getTen());
            ps.setString(4, kh.getDiaChi());
            ps.setString(5, kh.getSdt());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm khách hàng thành công!" , "Thông báo", 1);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Khách hàng không được thêm" , "Thông báo", 1);
        }
    }
    
    public boolean UpdateKhachHang(KhachHang kh) {
        try {
            ps = Connect.getConnect().prepareStatement("UPDATE KhachHang SET matKhauKhachHang = ?, ten = ?,"
                    + " diaChi = ?, sdt = ? where maKhachHang = ?");
            ps.setString(5, kh.getMaKhachHang());
            ps.setString(1, kh.getMatKhauKhachHang());
            ps.setString(2, kh.getTen());
            
            ps.setString(3, kh.getDiaChi());
            ps.setString(4, kh.getSdt());
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean DeleteKhachHang(String maKH) {
        try {
            ps = Connect.getConnect().prepareStatement("DELETE FROM KhachHang WHERE maKhachHang = ?");
            ps.setString(1, maKH);
            return ps.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
    }
    
}
