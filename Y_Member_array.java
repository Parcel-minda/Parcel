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
	    System.out.println("���������ɹ�");
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("���ݿ����ӳɹ�");
		Statement st = con.createStatement();
		System.out.println("�����ɹ�");
		String sqlStr ="select �û���,��ʵ����,�Ա�,����,�绰���� from �û�ע����Ϣ";
		ResultSet rs=st.executeQuery(sqlStr);
		System.out.println("��ѯ���ݳɹ�");
		System.out.println("-----------------");
		while(rs.next())
		{
			String str1=rs.getString("�û���");
			
			String str2=rs.getString("��ʵ����");
			String str3=rs.getString("�Ա�");
			String str4=rs.getString("����");
			String str5=rs.getString("�绰����");
			//System.out.println("�绰��"+str5);
			Y_Member a=new Y_Member(str1,str2,str3,str4,str5);
			Memberarry.add(a);
			}
		rs.close();
		st.close();
		con.close();
	}
}
