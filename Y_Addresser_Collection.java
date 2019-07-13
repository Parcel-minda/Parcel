package Parcel;
import java.io.IOException;
import java.util

.Date;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Y_Addresser_Collection {
	String usertele;
	String parcel_ID;//±àºÅ
Y_Goods a;
Y_Addresser b;

public Y_Addresser_Collection() {
	a=new Y_Goods();
	b=new Y_Addresser();
	
}
public Y_Addresser_Collection(String usertele,String volume,String weight,String Express_name,String Pickup_address,
		 String pickup_num,String pickup_name,String pickup_tele,boolean Pay_way,
		 String name, String date_after,String tele,String Address)
{
	this.usertele=usertele;
	a=new Y_Goods(volume, weight, Express_name, Pickup_address, pickup_num,
			pickup_name, pickup_tele, Pay_way);
	b=new Y_Addresser( name,date_after,tele, Address);
	setParcel_ID();
}
public void setParcel_ID() 
{
java.util.Date getDate =  Calendar.getInstance().getTime();
String dateStr = new SimpleDateFormat("yyyyMMddHHmmss").format(getDate);
this.parcel_ID =dateStr;
}
public String getParcel_ID() 
{
 return parcel_ID;
}
}
