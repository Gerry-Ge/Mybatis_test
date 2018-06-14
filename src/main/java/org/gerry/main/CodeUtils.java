package org.gerry.main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CodeUtils {
	public static String DateFormate = "yyyy-MM-dd HH:mm:ss";

	public static String parseDate(Date date) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat(DateFormate);
		return sdf.format(date);
	}

	public static void prt(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) throws Exception {
		System.out.println(parseDate(new Date()));
		StringBuilder sb=new StringBuilder();
		sb.append("<a href=%s>上一页</a>    <a href=%s>下一页</a>","/WebApp/user/userPages?page=0","/WebApp/user/userPages?page=2");
		prt(String.format("<a href=%s>上一页</a>    <a href=%s>下一页</a>","/WebApp/user/userPages?page=0","/WebApp/user/userPages?page=2"));
		System.out.println("org.gerry.mappers.UserMapper.getUserListPage"
				.matches("(.*)UserMapper(.*)"));
	}

}
