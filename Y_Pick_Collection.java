package Parcel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Y_Pick_Collection {
	String usertele;
	Y_People picker;
	boolean picked;
	String status;
	String goodsnum;
	public Y_Pick_Collection() {
		picker=new Y_People();
		picked=false;
		status=new String();
		goodsnum=new String();
	}
	public Y_Pick_Collection(String tele,String name,String tel,boolean picked,
			String status,String goodsnum) {
	    this.usertele=tele;
		this.picker=new Y_People(name,tel);
		this.picked=picked;
		this.goodsnum=goodsnum;
	}
}
