package Parcel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class Y_Publish {
	ArrayList<Y_Addresser_Collection> arry;
	public Y_Publish() throws SQLException, ClassNotFoundException {
		arry=new ArrayList<>();
		String url="jdbc:mysql://localhost:3306/parcel?useUnicode=true&characterEncoding=GB2312";
		String user="root";
		String password="123456";
		Class.forName("org.gjt.mm.mysql.Driver");
	    System.out.println("加载驱动成功");
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("数据库连接成功");
		Statement st = con.createStatement();
		System.out.println("创建成功");
		String sqlStr ="select 用户电话,订单编号,联系人姓名,手机号,取货码,取货昵称,手机尾号,快递名称,取货地址,送货地址,送货截至时间,货物重量,货物体积,付款方式 from 货物信息表";
		ResultSet rs=st.executeQuery(sqlStr);
		System.out.println("查询数据成功");
		System.out.println("-----------------");
		while(rs.next())
		{
			String str0=rs.getString("用户电话");
			String str1=rs.getString("订单编号");
			String str2=rs.getString("联系人姓名");
			String str3=rs.getString("手机号");
			String str4=rs.getString("取货码");
			String str5=rs.getString("取货昵称");
			String str6=rs.getString("手机尾号");
			String str7=rs.getString("快递名称");
			String str8=rs.getString("取货地址");
			String str9=rs.getString("送货地址");
			String str10=rs.getString("送货截至时间");
			String str11=rs.getString("货物重量");
			String str12=rs.getString("货物体积");
			String str13=rs.getString("付款方式");
			boolean flag;
			if(str13=="线上付款") {
				flag=true;
			}
			else {
				flag=false;
			}
			Y_Addresser_Collection a=new Y_Addresser_Collection(str0,str12,str11,str7,str8,str4,str5,str6,
					flag,str2,str10,str3,str9);
			arry.add(a);
			}
		rs.close();
		st.close();
		con.close();
	}
}
