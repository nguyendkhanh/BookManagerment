/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Object.QuanTri;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author khanh
 */
public class QuanTriData {
    public static PreparedStatement ps;
    public static ResultSet rs;
    public QuanTri dangNhap(String taiKhoan, String pass) {
        QuanTri ad = null;
        try{
            ps = Connect.getConnect().prepareStatement("SELECT * FROM QuanTri where maQuanTri = ? and matKhauQuanTri=?");
            ps.setString(1, taiKhoan);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while(rs.next()) {
                ad = new QuanTri();
              
                
            }
        }
        catch(Exception e) {
            return ad = null;
        }
        return ad;
    }
}
