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
	    System.out.println("���������ɹ�");
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("���ݿ����ӳɹ�");
		Statement st = con.createStatement();
		System.out.println("�����ɹ�");
		String sqlStr ="select �û��绰,�������,��ϵ������,�ֻ���,ȡ����,ȡ���ǳ�,�ֻ�β��,�������,ȡ����ַ,�ͻ���ַ,�ͻ�����ʱ��,��������,�������,���ʽ from ������Ϣ��";
		ResultSet rs=st.executeQuery(sqlStr);
		System.out.println("��ѯ���ݳɹ�");
		System.out.println("-----------------");
		while(rs.next())
		{
			String str0=rs.getString("�û��绰");
			String str1=rs.getString("�������");
			String str2=rs.getString("��ϵ������");
			String str3=rs.getString("�ֻ���");
			String str4=rs.getString("ȡ����");
			String str5=rs.getString("ȡ���ǳ�");
			String str6=rs.getString("�ֻ�β��");
			String str7=rs.getString("�������");
			String str8=rs.getString("ȡ����ַ");
			String str9=rs.getString("�ͻ���ַ");
			String str10=rs.getString("�ͻ�����ʱ��");
			String str11=rs.getString("��������");
			String str12=rs.getString("�������");
			String str13=rs.getString("���ʽ");
			boolean flag;
			if(str13=="���ϸ���") {
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
