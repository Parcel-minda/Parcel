package Parcel; 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class Y_Member 
{
	String name;	//�ǳ�
	String realname;	//��ʵ����
	String sex;
	String secret;	    //����
	String telenum;     //�绰����


	public Y_Member(String name1,String name2,String sex,String ssecret,String ttelenum)
	{
		name = name1;
		realname = name2;
		this.sex=sex;
		secret = ssecret;
		telenum = ttelenum;
	}
	}	