package org.gerry.main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CodeUtils {
	public static String DateFormate="yyyy-MM-dd HH:mm:ss";
	
	public static String parseDate(Date date) throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat(DateFormate);
		return sdf.format(date);
	}
	
	public static void main(String[] args) throws Exception{
		System.out.println(parseDate(new Date()));
	}

}
