package Selenium_Programs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateFunction {

	public static void main(String[] args)
	{
		Date d= new Date();
		System.out.println(d.toString());
		SimpleDateFormat df= new SimpleDateFormat("MM/DD/YYYY");
		String ac=df.format(d);
		System.out.println("Date Formate"+ac);
	}

}
