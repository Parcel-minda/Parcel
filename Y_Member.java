package Parcel; 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class Y_Member 
{
	String name;	//昵称
	String realname;	//真实姓名
	String sex;
	String secret;	    //密码
	String telenum;     //电话号码


	public Y_Member(String name1,String name2,String sex,String ssecret,String ttelenum)
	{
		name = name1;
		realname = name2;
		this.sex=sex;
		secret = ssecret;
		telenum = ttelenum;
	}
	}	