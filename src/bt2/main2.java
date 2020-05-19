/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;

/**
 *
 * @author SinhThonh
 */
public class main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MyStringBuilder s = new MyStringBuilder.Builder("Sinh viên của lớp ").addString("công nghệ thông tin khóa ").addFloat(59).addBool(true).build();
        
        s.xuatChuoi();
    // TODO code application logic here
        
    }
    
}
