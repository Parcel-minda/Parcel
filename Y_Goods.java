package Parcel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class Y_Goods {
	String pickup_num;//取货码
	String pickup_name;//取货昵称
	String pickup_tele;//手机尾号
	String Express_name ;//快递名称
	String Pickup_address ;//取货地址
	String weight;//货物重量
	String volume;//货物体积(平方厘米)
	boolean Pay_way;//付款方式

	 public Y_Goods (String volume,String weight,String Express_name,String Pickup_address,
			String pickup_num,String pickup_name,String pickup_tele,boolean Pay_way)
		{
		this.volume = volume;
		this.weight = weight;
		this.Pay_way=Pay_way;
		this.Express_name=Express_name;
		this.Pickup_address=Pickup_address;
		this.pickup_num=pickup_num;
		this.pickup_name=pickup_name;
		this.pickup_tele=pickup_tele;
		}
	 public Y_Goods ()
		{
		
		Pay_way=true;
		}
			
}
