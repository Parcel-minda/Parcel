package Parcel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class A_Mysql {
	public A_Mysql() {
		//System.out.println("���ݿ����ӳɹ�");
	}
	public void storebike(ArrayList<Y_Member> member) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/parcel?useUnicode=true&characterEncoding=GB2312";
		String user="root";
		String password="123456";
		Class.forName("org.gjt.mm.mysql.Driver");
	    System.out.println("���������ɹ�");
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("���ݿ����ӳɹ�");
		Statement st = con.createStatement();
		System.out.println("�����ɹ�");
		
		/*String str1 ="drop table if exists �û�ע����Ϣ;";
		st.executeUpdate(str1);
		String str2 ="create table �û�ע����Ϣ("
		              +"�û��� varchar(15) not null,"
		              +"��ʵ����  varchar(15) not null,"
		              +"�Ա�  varchar(5) not null,"
		              +"����  char(25) not null,"
		              +"�绰����  char(11) not null" 
		              +")charset=utf8;";
		st.executeUpdate(str2);*/
		int i=0;
	    for(i=0;i<member.size();i++) {
	    	
	    	Y_Member g=member.get(i);
	    	String sqlInsert="insert into �û�ע����Ϣ(�û���,��ʵ����,�Ա�,����,�绰����) "+"VALUES('"+g.name+"','"+g.realname+"','"+g.sex+"','"+g.secret+"','"+g.telenum+"');";
	    	st.executeUpdate(sqlInsert);
	    }
	    st.close();
		con.close();
	    System.out.println("�û���Ϣע������ɹ���!!!!");
	}
	public void storelogin(Y_Member member) throws ClassNotFoundException, SQLException{
		String url="jdbc:mysql://localhost:3306/parcel?useUnicode=true&characterEncoding=GB2312";
		String user="root";
		String password="123456";
		Class.forName("org.gjt.mm.mysql.Driver");
	    System.out.println("���������ɹ�");
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("���ݿ����ӳɹ�");
		Statement st = con.createStatement();
		System.out.println("�����ɹ�");
		String sqlInsert="insert into �û�ע����Ϣ(�û���,��ʵ����,�Ա�,����,�绰����) "+"VALUES('"+member.name+"','"+member.realname+"','"+member.sex+"','"+member.secret+"','"+member.telenum+"');";
    	st.executeUpdate(sqlInsert);
	}
	public void storegoods(Y_Addresser_Collection goods) throws ClassNotFoundException, SQLException{
		String url="jdbc:mysql://localhost:3306/parcel?useUnicode=true&characterEncoding=GB2312";
		String user="root";
		String password="123456";
		Class.forName("org.gjt.mm.mysql.Driver");
	    System.out.println("���������ɹ�");
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("���ݿ����ӳɹ�");
		Statement st = con.createStatement();
		System.out.println("�����ɹ�");
		String str;
		if(goods.a.Pay_way==true) {
			str="���ϸ���";
		}
		else {
			str="���¸���";
		}
		String sqlInsert="insert into ������Ϣ��(������� ,��ϵ������ ,�ֻ���  ,ȡ���� ,�ֻ�β�� ,������� , "
				+ "ȡ����ַ ,�ͻ���ַ ,�ͻ�����ʱ�� ,��������,������� ,���ʽ ) "
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
	    System.out.println("���������ɹ�");
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("���ݿ����ӳɹ�");
		Statement st = con.createStatement();
		System.out.println("�����ɹ�");
		String str;
		if(picker.picked==true) {
			str="��ȡ��";
		}
		else {
			str="δȡ��";
		}
		String sqlInsert="insert into ������Ϣ��(�������,����,�ֻ���,�Ƿ���ȡ������,����״̬) "
				+"VALUES('"+picker.goodsnum+"','"+picker.picker.name+"',"
						+ "'"+picker.picker.tel+"','"+str+"','"+picker.status+"');";
    	st.executeUpdate(sqlInsert);
	}
	public void deletepick(String str) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/parcel?useUnicode=true&characterEncoding=GB2312";
		String user="root";
		String password="123456";
		Class.forName("org.gjt.mm.mysql.Driver");
	    System.out.println("���������ɹ�");
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("���ݿ����ӳɹ�");
		Statement st = con.createStatement();
		System.out.println("�����ɹ�");
		String sqlInsert="delete from ������Ϣ�� where �������='"+str+"'";
    	st.executeUpdate(sqlInsert);
	}
}