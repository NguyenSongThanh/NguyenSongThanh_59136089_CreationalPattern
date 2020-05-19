/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

/**
 *
 * @author SinhThonh
 */
public class main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        hoadonHeader hd = new hoadonHeader.HoaDonBuilder().addMaHD("DM002")
                .addNgayBan("05/07/2016")
                .addTenKH("Nguyễn Song Thành")
                .build();
        CTHD cthd1 = new CTHD.CTHDBuilder().addTenSP("Điện thoại SamSung")
                .addSoLuong(5)
                .addDonGia(50000000)
                .addChietKhau("20%")
                .build();
        CTHD cthd2 = new CTHD.CTHDBuilder().addTenSP("Laptop Hp")
                .addSoLuong(1)
                .addDonGia(85000000)
                .addChietKhau("5%")
                .build();
        hd.addCTHD(cthd2);
        hd.addCTHD(cthd1);
        hd.xuatHoaDon();
    // TODO code application logic here
    }
    
}
