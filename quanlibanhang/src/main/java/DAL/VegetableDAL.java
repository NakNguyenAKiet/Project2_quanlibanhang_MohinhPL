package DAL;

import DTO.Vegetable;
import Utils.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VegetableDAL {
    DBConnection dBConnection = new DBConnection();
    Connection conn = dBConnection.getConnection();
    Statement stmt;
    PreparedStatement pstmt;
    String sql;
    ResultSet rs;
    
    public List<Vegetable> getAllVegetables() {
        List<Vegetable> vegetables = new ArrayList<>();
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM Vegetable");
            while (rs.next()) {
                int vegetableId = rs.getInt("VegetableID");
                int categoryId = rs.getInt("CatagoryID");
                String vegetableName = rs.getString("VegetableName");
                String unit = rs.getString("Unit");
                int amount = rs.getInt("Amount");
                String image = rs.getString("Image");
                float price = rs.getFloat("Price");
                Vegetable vegetable = new Vegetable(vegetableId, categoryId, vegetableName, unit, amount, image, price);
                vegetables.add(vegetable);
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dBConnection.close();
        }
        return vegetables;
    }
    
    public Vegetable getVegetableById(int vegetableId) {
        Vegetable vegetable = null;
        try {
            pstmt = conn.prepareStatement("SELECT * FROM Vegetable WHERE VegetableID = ?");
            pstmt.setInt(1, vegetableId);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                int categoryId = rs.getInt("CatagoryID");
                String vegetableName = rs.getString("VegetableName");
                String unit = rs.getString("Unit");
                int amount = rs.getInt("Amount");
                String image = rs.getString("Image");
                float price = rs.getFloat("Price");
                vegetable = new Vegetable(vegetableId, categoryId, vegetableName, unit, amount, image, price);
            }
            rs.close();
            pstmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dBConnection.close();
        }
        return vegetable;
    }
    
    public List<Vegetable> getVegetablesByCategoryId(int categoryId) {
        List<Vegetable> vegetables = new ArrayList<>();
        try {
            pstmt = conn.prepareStatement("SELECT * FROM Vegetable WHERE CatagoryID = ?");
            pstmt.setInt(1, categoryId);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int vegetableId = rs.getInt("VegetableID");
                String vegetableName = rs.getString("VegetableName");
                String unit = rs.getString("Unit");
                int amount = rs.getInt("Amount");
                String image = rs.getString("Image");
                float price = rs.getFloat("Price");
                Vegetable vegetable = new Vegetable(vegetableId, categoryId, vegetableName, unit, amount, image, price);
                vegetables.add(vegetable);
            }
            rs.close();
            pstmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dBConnection.close();
        }
        return vegetables;
    }
    
    public boolean insertVegetable(Vegetable vegetable) {
        try {
            pstmt = conn.prepareStatement("INSERT INTO Vegetable (CatagoryID, VegetableName, Unit, Amount, Image, Price) VALUES (?, ?, ?, ?, ?, ?)");
            pstmt.setInt(1, vegetable.getCategoryId());
            pstmt.setString(2, vegetable.getVegetableName());
            pstmt.setString(3, vegetable.getUnit());
            pstmt.setInt(4, vegetable.getAmount());
            pstmt.setString(5, vegetable.getImage());
            pstmt.setFloat(6, vegetable.getPrice());
            int rowsInserted = pstmt.executeUpdate();
            pstmt.close();
            return rowsInserted > 0;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            dBConnection.close();
        }
    }
    
    public boolean updateVegetable(Vegetable vegetable) {
        try {
            pstmt = conn.prepareStatement("UPDATE Vegetable SET CatagoryID=?, VegetableName=?, Unit=?, Amount=?, Image=?, Price=? WHERE VegetableID=?");
            pstmt.setInt(1, vegetable.getCategoryId());
            pstmt.setString(2, vegetable.getVegetableName());
            pstmt.setString(3, vegetable.getUnit());
            pstmt.setInt(4, vegetable.getAmount());
            pstmt.setString(5, vegetable.getImage());
            pstmt.setFloat(6, vegetable.getPrice());
            pstmt.setInt(7, vegetable.getVegetableId());
            int rowsUpdated = pstmt.executeUpdate();
            pstmt.close();
            return rowsUpdated > 0;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            dBConnection.close();
        }
}
    
    public boolean deleteVegetable(int vegetableId) {
        try {
            pstmt = conn.prepareStatement("DELETE FROM Vegetable WHERE VegetableID = ?");
            pstmt.setInt(1, vegetableId);
            int rowsDeleted = pstmt.executeUpdate();
            pstmt.close();
            return rowsDeleted > 0;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            dBConnection.close();
        }
    }
}
