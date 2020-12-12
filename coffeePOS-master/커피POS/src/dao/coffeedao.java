package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;


import bean.Coffee;


public class coffeedao {
	private String driver = "oracle.jdbc.driver.OracleDriver" ;//데이터 베이스 정보
	private String url = "jdbc:oracle:thin:@localhost:1521:xe" ;
	private String username = "WOON" ;
	private String password = "1234" ;
	private Connection conn = null ;
	
	public coffeedao() {
		try {//데이터베이스 드라이버에 올리기
			Class.forName(driver) ;			
		} catch (ClassNotFoundException e) {
			System.out.println("jar 없음"); 
			e.printStackTrace();		
		}
	}

	private Connection getConnection() {//데이터베이스연결 
		try {
			conn = DriverManager.getConnection(url, username, password) ;
		} catch (SQLException e) {
			System.out.println("커넥션 생성 오류");
			e.printStackTrace();
		}
		return conn ;
	}


	private void closeConnection() {//연결 종료
		try {
			if(conn != null) {conn.close(); }
		} catch (Exception e2) {
			e2.printStackTrace(); 
		}		
	}

	public int coffeeadd(Coffee bean){//콘솔창에서 데이터를 입력받아 객체 생성
		int result =-1;
		
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		String sql = "insert into coffee(coffeename,coffeesize,shot,coffeetemp,price)values(?,?,?,?,?)";
	
		try {
								
			conn = getConnection();
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, bean.getName());
			pstmt.setString(2, bean.getSize());
			pstmt.setString(3, bean.getShot());
			pstmt.setString(4, bean.getTemp());
			pstmt.setInt(5, bean.getPrice());
						
			result = pstmt.executeUpdate();
			conn.commit();	
		} catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback(); 
			} catch (Exception e2) {
				e2.printStackTrace();  
			}
		}finally{
			try {
				if(rs != null) {rs.close(); }
				if(pstmt != null) {pstmt.close(); }
				closeConnection() ;
			} catch (Exception e2) {
				e2.printStackTrace(); 
			}
		}
		
		return result;
	}//coffeeadd
	
	
	
	
	
	
	public  Vector<Coffee> Getsellcount(){// 오늘 판매된 음료수 정보 가져오기
		PreparedStatement pstmt = null ;
		ResultSet rs = null ;
		String sql = "select coffeename , count(*)  from coffee group by  coffeename   order by count(*) desc" ;
		Vector<Coffee> lists = new Vector<Coffee>();
		try {
			conn = getConnection() ;
			pstmt = conn.prepareStatement(sql) ; 
			
			rs = pstmt.executeQuery() ;
			
			while(rs.next()){
				Coffee coffee = new Coffee() ;
				coffee.setName(rs.getString("coffeename"));
				coffee.setPrice( rs.getInt("count(*)") ); 
				
				lists.add( coffee ) ;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally{
			try {
				if(rs != null) {rs.close(); }
				if(pstmt != null) {pstmt.close(); }
				closeConnection() ;
			} catch (Exception e2) {
				e2.printStackTrace(); 
			}
		}
		return lists ;
	}//Getsellcount
	
	
	
	
	
	public Vector<Coffee> GetAllSellList() {//오늘 판매된 가격,품목 정보 가져오기
		PreparedStatement pstmt = null ;
		ResultSet rs = null ;
		String sql = "select * from coffee" ;
		Vector<Coffee> lists = new Vector<Coffee>();
		try {
			conn = getConnection() ;
			pstmt = conn.prepareStatement(sql) ; 
			
			rs = pstmt.executeQuery() ;
			
			while(rs.next()){
				Coffee coffee = new Coffee() ;
				coffee.setName(rs.getString("coffeename"));
				coffee.setSize(rs.getString("coffeesize"));
				coffee.setShot(rs.getString("shot"));
				coffee.setTemp(rs.getString("coffeetemp"));
				coffee.setPrice( rs.getInt("price") ); 
				
				lists.add( coffee ) ;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally{
			try {
				if(rs != null) {rs.close(); }
				if(pstmt != null) {pstmt.close(); }
				closeConnection() ;
			} catch (Exception e2) {
				e2.printStackTrace(); 
			}
		}
		return lists ;
	}//GetAllSellList
		
	
	
	public Object[][] makeArr(Vector<Coffee> lists){//배열 생성(이름 사이즈 샷추가 핫/아이스 가격)
		Object [][] coffeearr = new Object [lists.size()][5]; 
				
				
			for(int i=0; i<lists.size();i++){
				coffeearr[i][0]=lists.get(i).getName();
				coffeearr[i][1]=lists.get(i).getSize();
				coffeearr[i][2]=lists.get(i).getShot();
				coffeearr[i][3]=lists.get(i).getTemp();
				coffeearr[i][4]=lists.get(i).getPrice();
			}	
		
			
		return coffeearr;
		
	}//makeArr
	
	
	
	public Object[][] makelistArr(Vector<Coffee> lists){//배열 생성(이름,가격)
		Object [][] coffeearr = new Object [lists.size()][2]; 
				
				
			for(int i=0; i<lists.size();i++){
				coffeearr[i][0]=lists.get(i).getName();
				coffeearr[i][1]=lists.get(i).getPrice();
			}	
		
			
		return coffeearr;
		
	}

	
}
