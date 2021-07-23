/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Object.PhieuMuon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author khanh
 */
public class PhieuMuonData {
    public static PreparedStatement ps;
    public static ResultSet rs;
    
    public static ResultSet showTextfield(String sql) {
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            return ps.executeQuery();
        } catch (Exception e) {
            return null;
        }
    }
     public static void InsertPhieu(PhieuMuon p) {
        String sql = "insert into PhieuMuon values(?,?,?,?,?)";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, p.getMaMuon());
            ps.setString(2, p.getMaKhach());
            ps.setString(3, p.getMaSach());
            ps.setDate(4, p.getNgayMuon());
            ps.setDate(5, p.getHanTra());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm phiếu thành công!" , "Thông báo", 1);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "phiếu không được thêm" , "Thông báo", 1);
        }
    }
    
    public boolean UpdatePhieu(PhieuMuon p) {
        try {
            ps = Connect.getConnect().prepareStatement("UPDATE PhieuMuon SET  maKhachHang = ?, maSach = ?,"
                    + "ngayMuon = ?, hanTra = ? where maPhieuMuon = ?");
            ps.setString(5, p.getMaMuon());
            ps.setString(1, p.getMaKhach());
            ps.setString(2, p.getMaSach());
            ps.setDate(3, p.getNgayMuon());
            ps.setDate(4, p.getHanTra());
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean DeletePhieu(String ms) {
        try {
            ps = Connect.getConnect().prepareStatement("DELETE FROM PhieuMuon WHERE maPhieuMuon = ?");
            ps.setString(1, ms);
            return ps.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
    }
}
