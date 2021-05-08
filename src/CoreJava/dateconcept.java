package CoreJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.println(d.toString());
		SimpleDateFormat sfd=new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
		System.out.println(sfd.format(d));
		System.out.println(d.toString());
	}

}
