package Parcel;

import java.io.IOException;
import java.sql.SQLException;

public class A_amain {
	public static void main(String[]args) throws ClassNotFoundException, SQLException, IOException {
		A_allinformation all=new  A_allinformation();
		A_enter enter=new A_enter();
		enter.enter(all);
		enter.setVisible(true);
	}

}
