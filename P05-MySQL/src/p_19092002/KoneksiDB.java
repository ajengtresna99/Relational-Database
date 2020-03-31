package p_19092002;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author WIN10
 */
public class KoneksiDB {
    public static Connection sambunganDB() {
        String JDBC_DRiver_CLASS = "com.mysql.cj.jdbc.Driver";
        String username = "root";
        String host = "localhost";
        String port = "3306";
        String Password = "";
        String dbName = "phb_java_mysql";
        String url = "jdbc:mysql://"+host+":"+port+"/"+dbName;
        Connection kon = null;
        try {
            Class.forName(JDBC_DRiver_CLASS).newInstance();
            kon = DriverManager.getConnection(url,username,Password);
            System.out.println("Koneksi : Sukses!");
            return kon;
        } catch (ClassNotFoundException | IllegalAccessException |
                  InstantiationException | SQLException e) {
            System.out.println("Error : "+e.getMessage());
            System.exit(0);
        }
        return null;
    }

    static Connection sambungDB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
