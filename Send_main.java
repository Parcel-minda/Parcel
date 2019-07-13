package Parcel;
import java.awt.EventQueue;

public class Send_main {
	public void send_main(final A_allinformation all,String usertele){
		Send_menu a=new Send_menu();
	    a.menu(all,usertele);
	    a.setVisible(true);
	}
	
}
