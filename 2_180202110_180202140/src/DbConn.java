
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aybuk
 */
public class DbConn {
 
    private String kullanici_adi="root";
    private String parola="";
    private String db ="veritabanları";
    private String host ="localhost";
    private String port="3306";
    private Connection con=null;
    public static Connection ConnecrDb() {
     
        try {

            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/veritabanları","root", "");
          

            return conn;
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return null;
    }

    public static void main(String[] args) {
        
        Login_Form ap = new Login_Form();
        ap.setVisible(true);
        ap.pack();
        ap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
