package Parcel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Y_Picking {
	ArrayList<Y_Pick_Collection> pickerarry;
	public Y_Picking() throws IOException, ClassNotFoundException, SQLException {
		 pickerarry = new ArrayList<Y_Pick_Collection>();
		 String url="jdbc:mysql://localhost:3306/parcel?useUnicode=true&characterEncoding=GB2312";
			String user="root";
			String password="123456";
			Class.forName("org.gjt.mm.mysql.Driver");
		    System.out.println("加载驱动成功");
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("数据库连接成功");
			Statement st = con.createStatement();
			System.out.println("创建成功");
			//String sqlStr ="select 用户电话,订单编号,姓名,手机号,是否已取到货物,交易状态 from 货物信息表";
			String sqlStr ="select 用户电话,订单编号,姓名,手机号,是否已取到货物,交易状态 from 订单信息表";
			ResultSet rs=st.executeQuery(sqlStr);
			//ResultSet rs=st.executeQuery(sqlStr);
			System.out.println("查询数据成功");
			System.out.println("-----------------");
			while(rs.next())
			{
				String str0=rs.getString("用户电话");
				String str1=rs.getString("订单编号");
				String str2=rs.getString("姓名");
				String str3=rs.getString("手机号");
				String str4=rs.getString("是否已取到货物");
				String str5=rs.getString("交易状态");
				boolean flag;
				if(str4=="是") {
					flag=true;
				}
				else {
					flag=false;
				}
				Y_Pick_Collection a=new Y_Pick_Collection(str0,str2,str3,flag,str5,str1);
				pickerarry.add(a);
				}
			rs.close();
			st.close();
			con.close();
	}
}
