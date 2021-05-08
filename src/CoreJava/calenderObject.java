package CoreJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class calenderObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Calendar cal=Calendar.getInstance();
	
	SimpleDateFormat sfd=new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
	System.out.println(sfd.format(cal.getTime()));
	
	}

}
