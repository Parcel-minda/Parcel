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
		    System.out.println("���������ɹ�");
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("���ݿ����ӳɹ�");
			Statement st = con.createStatement();
			System.out.println("�����ɹ�");
			//String sqlStr ="select �û��绰,�������,����,�ֻ���,�Ƿ���ȡ������,����״̬ from ������Ϣ��";
			String sqlStr ="select �û��绰,�������,����,�ֻ���,�Ƿ���ȡ������,����״̬ from ������Ϣ��";
			ResultSet rs=st.executeQuery(sqlStr);
			//ResultSet rs=st.executeQuery(sqlStr);
			System.out.println("��ѯ���ݳɹ�");
			System.out.println("-----------------");
			while(rs.next())
			{
				String str0=rs.getString("�û��绰");
				String str1=rs.getString("�������");
				String str2=rs.getString("����");
				String str3=rs.getString("�ֻ���");
				String str4=rs.getString("�Ƿ���ȡ������");
				String str5=rs.getString("����״̬");
				boolean flag;
				if(str4=="��") {
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
