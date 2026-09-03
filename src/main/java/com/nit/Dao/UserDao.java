package com.nit.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Connection.DBConnection;

public class UserDao {

    public boolean registerUser(User user) {

        String sql = "INSERT INTO USERS(name,email,address,number,gender,password) "
                   + "VALUES(?,?,?,?,?,?)";

        try {
            Connection conn = DBConnection.getConnection();

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getAddress());
            ps.setString(4, user.getNumber());
            ps.setString(5, user.getGender());
            ps.setString(6, user.getPassword());

            int row = ps.executeUpdate();

            ps.close();
            conn.close();

            if (row > 0) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public User loginUser(String name, String password) {

        String sql = "SELECT name, password FROM USERS WHERE name=? AND password=?";

        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                User user = new User();

                user.setName(rs.getString("name"));
                user.setPassword(rs.getString("password"));

                rs.close();
                ps.close();
                con.close();

                return user;
            }

            rs.close();
            ps.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
    
    
    
   
    
 // GET USER BY NAME
    public User getUserByName(String name) {

        String sql = "SELECT * FROM USERS WHERE name=?";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                User user = new User();

                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setAddress(rs.getString("address"));
                user.setNumber(rs.getString("number"));
                user.setGender(rs.getString("gender"));
                user.setPassword(rs.getString("password"));

                return user;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
    
    
    public boolean updateName(String oldName, String newName) {

        String sql = "UPDATE USERS SET name=? WHERE name=?";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, newName);
            ps.setString(2, oldName);

            int result = ps.executeUpdate();

            ps.close();
            con.close();

            return result > 0;

        } catch (Exception e) {

            e.printStackTrace();

        }

        return false;
    }
    
    
    public boolean updateAddress(String name, String address) {

        String sql = "UPDATE USERS SET address=? WHERE name=?";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, address);
            ps.setString(2, name);

            int result = ps.executeUpdate();

            ps.close();
            con.close();

            return result > 0;

        } catch (Exception e) {

            e.printStackTrace();

        }

        return false;
    }
  
    
    public boolean updateNumber(String name, String number) {

        String sql = "UPDATE USERS SET number=? WHERE name=?";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, number);
            ps.setString(2, name);

            int result = ps.executeUpdate();

            ps.close();
            con.close();

            return result > 0;

        } catch (Exception e) {

            e.printStackTrace();

        }

        return false;
    }
    
    public boolean deleteUser(String name) {

        String sql = "DELETE FROM USERS WHERE name=?";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);

            int result = ps.executeUpdate();

            return result > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
    
}