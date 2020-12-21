package com.lti.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import com.lti.connection.ConnectionFactory;
import com.lti.model.UserInfo;

public class UserInfoDaoImpl implements UserInfoDao {

	/*
	 * 1. Connection object: to connect to the table. 2. Statement
	 * object->PreparedStatement: to execute queries
	 */
	Connection con = null;
	PreparedStatement stmt = null;

	@Override
	public int registerUser(UserInfo userInfo) {
		con = ConnectionFactory.getConnection();
		String sql = "insert into user881 values(seq_user881.nextval,?,?,?,?,?)";
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, userInfo.getUserName());
			stmt.setString(2, userInfo.getUserPassword());
			stmt.setString(3, userInfo.getUserEmail());
			stmt.setString(4, userInfo.getUserCity());
			stmt.setString(5, userInfo.getUserMobile());

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int res = 0;
		try {
			res = stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // dml operations
		return res;
	}

	@Override
	public boolean loginUser(String userName, String userPassword) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int updateUser(UserInfo userInfo) {
		con = ConnectionFactory.getConnection();
		String sql = "update user881 set username=?,userpassword=?,useremail=?,usercity=?, mobile=? where userId=?";
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, userInfo.getUserName());
			stmt.setString(2, userInfo.getUserPassword());
			stmt.setString(3, userInfo.getUserEmail());
			stmt.setString(4, userInfo.getUserCity());
			stmt.setString(5, userInfo.getUserMobile());
			stmt.setInt(6, userInfo.getUserId());

			int res = stmt.executeUpdate();
			return res;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteUser(int userId) {
		con = ConnectionFactory.getConnection();
		String sql = "delete user881 where userId=?";
		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, userId);
			int res = stmt.executeUpdate();
			return res;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public  UserInfo findUserById(int userId) {
		con = ConnectionFactory.getConnection();
		String sql = "select * from user881 where userid=?";
		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, userId);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				UserInfo userInfo = new UserInfo();
				// setting userInfo object values from result set
				userInfo.setUserId(rs.getInt(1));
				userInfo.setUserName(rs.getString(2));
				userInfo.setUserPassword(rs.getString(3));
				userInfo.setUserEmail(rs.getString(4));
				userInfo.setUserCity(rs.getString(5));
				userInfo.setUserMobile(rs.getString(6));
				return userInfo;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public Set<UserInfo> viewAllUsers() {
		Set<UserInfo> users = new HashSet<>();
		con = ConnectionFactory.getConnection();
		String sql = "select * from user881";
		try {
			stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				UserInfo userInfo = new UserInfo();
				// setting userInfo object values from result set
				userInfo.setUserId(rs.getInt(1));
				userInfo.setUserName(rs.getString(2));
				userInfo.setUserPassword(rs.getString(3));
				userInfo.setUserEmail(rs.getString(4));
				userInfo.setUserCity(rs.getString(5));
				userInfo.setUserMobile(rs.getString(6));
				users.add(userInfo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

}
