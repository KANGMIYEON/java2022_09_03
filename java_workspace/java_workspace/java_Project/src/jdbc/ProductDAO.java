package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO implements DAO{
	
	// DB와 연결
	private Connection conn;
	// SQL 구문을 실행시키는 기능을 갖는 객체
	private PreparedStatement pst;
	private String query = ""; // query구문을 저장
	
	public ProductDAO() {
		DatabaseConnector dbc = DatabaseConnector.getInstance();
		conn = dbc.getConnection();
	}

	// sql 구문 처리
	
	@Override
	public int insert(Product product) {
		query = "insert into product (pname, price, madeby) values(?,?,?)";
		try {
			pst = conn.prepareStatement(query);
			// ? 에 들어가는 값들
			pst.setString(1, product.getPname());
			pst.setInt(2, product.getPrice());
			pst.setString(3, product.getMadeby());
			return pst.executeUpdate(); // 실행해라!
		} catch (SQLException e) {
			System.out.println("insert error!");
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public List<Product> selectList() {
		query = "select * from product order by pno desc"; // 최근에 등록한 것을 위로 올리려고
		List<Product> list = new ArrayList<>();
		try {
			pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery(); // ResultSet : java.sql // 결과를 rs에 담아라(근데 이제 막 담는..)
			while(rs.next()) { // 다음이 있다면
				list.add(
						new Product(
							rs.getInt("pno"), // pno값을 가진 int를 빼와라
							rs.getString("pname"),
							rs.getString("regdate"))
						);
			}
			return list;
		} catch (SQLException e) {
			System.out.println("selectList error!");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Product selectOne(int pno) {
		query = "select * from product where pno = ?";
		// 쿼리문에 해당되지 않는 값이 있을 수 있어서 try~catch문 사용!
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, pno);
			// select 처럼 변경이 없는 경우
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				return new Product(rs.getInt("pno"),
						rs.getString("pname"),
						rs.getInt("price"),
						rs.getString("regdate"),
						rs.getString("madeby"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int update(Product product) {
		query = "update product set "
				+ "pname = ?, price = ?, regdate = now(), madeby = ? "
				+ "where pno = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, product.getPname());
			pst.setInt(2, product.getPrice());
			pst.setString(3, product.getMadeby());
			pst.setInt(4, product.getPno());
			// insert, delete, update 처럼 변경이 일어나는 경우 
			return pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(int pno) {
		query ="delete from product where pno = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, pno);
			// insert, delete, update 처럼 변경이 일어나는 경우 
			return pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}


	
}
