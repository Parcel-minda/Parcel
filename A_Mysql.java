package Parcel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class A_Mysql {
	public A_Mysql() {
		//System.out.println("数据库连接成功");
	}
	public void storebike(ArrayList<Y_Member> member) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/parcel?useUnicode=true&characterEncoding=GB2312";
		String user="root";
		String password="123456";
		Class.forName("org.gjt.mm.mysql.Driver");
	    System.out.println("加载驱动成功");
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("数据库连接成功");
		Statement st = con.createStatement();
		System.out.println("创建成功");
		
		/*String str1 ="drop table if exists 用户注册信息;";
		st.executeUpdate(str1);
		String str2 ="create table 用户注册信息("
		              +"用户名 varchar(15) not null,"
		              +"真实姓名  varchar(15) not null,"
		              +"性别  varchar(5) not null,"
		              +"密码  char(25) not null,"
		              +"电话号码  char(11) not null" 
		              +")charset=utf8;";
		st.executeUpdate(str2);*/
		int i=0;
	    for(i=0;i<member.size();i++) {
	    	
	    	Y_Member g=member.get(i);
	    	String sqlInsert="insert into 用户注册信息(用户名,真实姓名,性别,密码,电话号码) "+"VALUES('"+g.name+"','"+g.realname+"','"+g.sex+"','"+g.secret+"','"+g.telenum+"');";
	    	st.executeUpdate(sqlInsert);
	    }
	    st.close();
		con.close();
	    System.out.println("用户信息注册表建立成功啦!!!!");
	}
	public void storelogin(Y_Member member) throws ClassNotFoundException, SQLException{
		String url="jdbc:mysql://localhost:3306/parcel?useUnicode=true&characterEncoding=GB2312";
		String user="root";
		String password="123456";
		Class.forName("org.gjt.mm.mysql.Driver");
	    System.out.println("加载驱动成功");
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("数据库连接成功");
		Statement st = con.createStatement();
		System.out.println("创建成功");
		String sqlInsert="insert into 用户注册信息(用户名,真实姓名,性别,密码,电话号码) "+"VALUES('"+member.name+"','"+member.realname+"','"+member.sex+"','"+member.secret+"','"+member.telenum+"');";
    	st.executeUpdate(sqlInsert);
	}
	public void storegoods(Y_Addresser_Collection goods) throws ClassNotFoundException, SQLException{
		String url="jdbc:mysql://localhost:3306/parcel?useUnicode=true&characterEncoding=GB2312";
		String user="root";
		String password="123456";
		Class.forName("org.gjt.mm.mysql.Driver");
	    System.out.println("加载驱动成功");
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("数据库连接成功");
		Statement st = con.createStatement();
		System.out.println("创建成功");
		String str;
		if(goods.a.Pay_way==true) {
			str="线上付款";
		}
		else {
			str="线下付款";
		}
		String sqlInsert="insert into 货物信息表(订单编号 ,联系人姓名 ,手机号  ,取货码 ,手机尾号 ,快递名称 , "
				+ "取货地址 ,送货地址 ,送货截至时间 ,货物重量,货物体积 ,付款方式 ) "
				+"VALUES('"+goods.parcel_ID+"','"+goods.b.name+"',"
						+ "'"+goods.b.tele+"','"+goods.a.pickup_num+"','"+goods.a.pickup_tele+"'"
								+ "'"+goods.a.Express_name+"','"+goods.a.Pickup_address+"','"
						+goods.b.send_Address+"','"+goods.b.date_after+"',"
								+ "'"+goods.a.weight+"','"+goods.a.volume+"','"+str+"');";
    	st.executeUpdate(sqlInsert);
	}
	public void storepicker(Y_Pick_Collection picker) throws ClassNotFoundException, SQLException{
		String url="jdbc:mysql://localhost:3306/parcel?useUnicode=true&characterEncoding=GB2312";
		String user="root";
		String password="123456";
		Class.forName("org.gjt.mm.mysql.Driver");
	    System.out.println("加载驱动成功");
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("数据库连接成功");
		Statement st = con.createStatement();
		System.out.println("创建成功");
		String str;
		if(picker.picked==true) {
			str="已取到";
		}
		else {
			str="未取到";
		}
		String sqlInsert="insert into 订单信息表(订单编号,姓名,手机号,是否已取到货物,交易状态) "
				+"VALUES('"+picker.goodsnum+"','"+picker.picker.name+"',"
						+ "'"+picker.picker.tel+"','"+str+"','"+picker.status+"');";
    	st.executeUpdate(sqlInsert);
	}
	public void deletepick(String str) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/parcel?useUnicode=true&characterEncoding=GB2312";
		String user="root";
		String password="123456";
		Class.forName("org.gjt.mm.mysql.Driver");
	    System.out.println("加载驱动成功");
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("数据库连接成功");
		Statement st = con.createStatement();
		System.out.println("创建成功");
		String sqlInsert="delete from 货物信息表 where 订单编号='"+str+"'";
    	st.executeUpdate(sqlInsert);
	}
}