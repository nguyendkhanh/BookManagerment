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
public class QuanTri {
    private String maQuanTri;
    private String matKhauQuanTri;

    public QuanTri() {
    }

    public QuanTri(String maQuanTri, String matKhauQuanTri) {
        this.maQuanTri = maQuanTri;
        this.matKhauQuanTri = matKhauQuanTri;
    }

    public String getMaQuanTri() {
        return maQuanTri;
    }

    public void setMaQuanTri(String maQuanTri) {
        this.maQuanTri = maQuanTri;
    }

    public String getMatKhauQuanTri() {
        return matKhauQuanTri;
    }

    public void setMatKhauQuanTri(String matKhauQuanTri) {
        this.matKhauQuanTri = matKhauQuanTri;
    }
    
    
}
