package Parcel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Y_Member_array {
	ArrayList<Y_Member> Memberarry;
	
	public Y_Member_array() throws ClassNotFoundException, SQLException {
		Memberarry= new ArrayList< Y_Member>(); 
		String url="jdbc:mysql://localhost:3306/parcel?useUnicode=true&characterEncoding=GB2312";
		String user="root";
		String password="123456";
		Class.forName("org.gjt.mm.mysql.Driver");
	    System.out.println("加载驱动成功");
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("数据库连接成功");
		Statement st = con.createStatement();
		System.out.println("创建成功");
		String sqlStr ="select 用户名,真实姓名,性别,密码,电话号码 from 用户注册信息";
		ResultSet rs=st.executeQuery(sqlStr);
		System.out.println("查询数据成功");
		System.out.println("-----------------");
		while(rs.next())
		{
			String str1=rs.getString("用户名");
			
			String str2=rs.getString("真实姓名");
			String str3=rs.getString("性别");
			String str4=rs.getString("密码");
			String str5=rs.getString("电话号码");
			//System.out.println("电话："+str5);
			Y_Member a=new Y_Member(str1,str2,str3,str4,str5);
			Memberarry.add(a);
			}
		rs.close();
		st.close();
		con.close();
	}
}
