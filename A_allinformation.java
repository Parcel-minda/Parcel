package Parcel;

import java.io.IOException;
import java.sql.SQLException;

public class A_allinformation {
	Y_Member_array member;
	Y_Picking picker;
	 Y_Publish publish;
	 A_Mysql mysql;
	public A_allinformation() throws IOException, ClassNotFoundException, SQLException {
		member=new Y_Member_array();
		picker=new Y_Picking();
		publish=new Y_Publish();
		mysql=new A_Mysql();
	}

}
