package Parcel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Y_Addresser {
String  name;//发件人
 String date_after;//时间段二
  String tele;//联系电话
String send_Address;//送货地址
  
public Y_Addresser() {
	
}
   public Y_Addresser (String name, String date_after,String tele,String Address)
   {
   this.name =name;
   this.date_after = date_after;
   this.tele = tele;
   this.send_Address=Address;
   }
}