package DAL;

import DTO.Category;
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

public class CategoryDAL {
    DBConnection dBConnection = new DBConnection();
    Connection conn = dBConnection.getConnection();
    Statement stmt;
    PreparedStatement pstmt;
    String sql;
    ResultSet rs;
    public List<Category> getAllCategories() {
        List<Category> categories = new ArrayList<>();
        try {
            stmt = conn.createStatement();
            sql = "SELECT * FROM Category";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int categoryId = rs.getInt("CatagoryID");
                String name = rs.getString("Name");
                String description = rs.getString("Description");
                Category category = new Category();
                category.setCategoryId(categoryId);
                category.setName(name);
                category.setDescription(description);
                categories.add(category);
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dBConnection.close();
        }
        return categories;
    }

    public Category getCategoryById(int categoryId) {
        Category category = null;
        try {
            pstmt = conn.prepareStatement("SELECT * FROM Category WHERE CatagoryID = ?");
            pstmt.setInt(1, categoryId);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                String name = rs.getString("Name");
                String description = rs.getString("Description");
                category = new Category();
                category.setCategoryId(categoryId);
                category.setName(name);
                category.setDescription(description);
            }
            rs.close();
            pstmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dBConnection.close();
        }
        return category;
    }

    public boolean insertCategory(Category category) {
        try {
            pstmt = conn.prepareStatement("INSERT INTO Category (CatagoryID, Name, Description) VALUES (?, ?, ?)");
            pstmt.setInt(1, category.getCategoryId());
            pstmt.setString(2, category.getName());
            pstmt.setString(3, category.getDescription());
            int numRowsAffected = pstmt.executeUpdate();
            pstmt.close();
            return numRowsAffected > 0;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            dBConnection.close();
        }
    }

    public boolean updateCategory(Category category) {
        try {
            pstmt = conn.prepareStatement("UPDATE Category SET Name = ?, Description = ? WHERE CatagoryID = ?");
            pstmt.setString(1, category.getName());
            pstmt.setString(2, category.getDescription());
            pstmt.setInt(3, category.getCategoryId());
            int numRowsAffected = pstmt.executeUpdate();
            pstmt.close();
            return numRowsAffected > 0;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            dBConnection.close();
        }
    }

    public boolean deleteCategory(int categoryId) {
        try {
            pstmt = conn.prepareStatement("DELETE FROM Category WHERE CatagoryID = ?");
            pstmt.setInt(1, categoryId);
            int numRowsAffected = pstmt.executeUpdate();
            pstmt.close();
            return numRowsAffected > 0;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            dBConnection.close();
        }
    }
}
