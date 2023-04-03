package com.tenco.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.tenco.BDHelper.DBHelper;
import com.tenco.DTO.SoloDTO;

public class SoloDAO {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public SoloDAO() {
		conn = DBHelper.getInstance().getConnection();
	}

	public int insert(String email, String password,String name,String addr) {
		String query = " insert INTO user(email, password, name, address) "
				+ " values "
				+ "	(? , ? , ? , ? ) ";
		
		int resultRow = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			pstmt.setString(3, name);
			pstmt.setString(4, addr);
			resultRow = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(">> insert 에서 오류");
			e.printStackTrace();
		}
		return resultRow;
	};

	public int delete(String id, String name) {
		int resultRow = 0;
		String sql = " DELETE FROM user " + " Where id = ? AND name = ? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			resultRow = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(">> delete에서 에러발생");
			e.printStackTrace();
		}
		return resultRow;
	}

	public ArrayList<SoloDTO> selectall() {
		ArrayList<SoloDTO> list = new ArrayList<>();
		
		String sql = " SELECT * FROM user ";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				SoloDTO soloDto  = new SoloDTO();
				soloDto.setEmail(rs.getString("id"));
				soloDto.setName(rs.getString("name"));
				soloDto.setPassword(rs.getString("age"));
				soloDto.setAddress(rs.getString("addr"));
				list.add(soloDto);
			}
		} catch (Exception e) {
			System.out.println(">> select에서 에러발생");
			e.printStackTrace();
		}
		return list;
	}

	public SoloDTO selectUserByUsernameAndPassword(String email, String password){
		SoloDTO resultUser = null;
		String sql = " SELECT * FROM user "
				+ " WHERE email = ?"
				+ " AND password = ? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				SoloDTO soloDto  = new SoloDTO();
				soloDto.setEmail(rs.getString("email"));
				soloDto.setPassword(rs.getString("password"));
				soloDto.setName(rs.getString("name"));
				soloDto.setAddress(rs.getString("address"));
				resultUser = soloDto;
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println(">> select에서 에러발생");
			e.printStackTrace();
		}
		return resultUser;
	}
}
