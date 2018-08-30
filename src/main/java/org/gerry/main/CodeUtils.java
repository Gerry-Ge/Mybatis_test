package org.gerry.main;

import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class CodeUtils {
	private static BigDecimal winRate=new BigDecimal("1.3");
	private static BigDecimal pinRate=new BigDecimal("3.3");
	private static BigDecimal loseRate=new BigDecimal("5.3");
	private static BigDecimal winResult=null;
	private static BigDecimal pinResult=null;
	private static BigDecimal loseResult=null;
	private static BigDecimal zero=new BigDecimal("0");
	private static int[] bj=new int[3];
	
	public static String DateFormate = "yyyy-MM-dd HH:mm:ss";

	public static String parseDate(Date date) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat(DateFormate);
		return sdf.format(date);
	}

	public static void prt(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) throws Exception {
//		System.out.println(parseDate(new Date()));
//		StringBuilder sb=new StringBuilder();
//		prt(String.format("<a href=%s>上一页</a>    <a href=%s>下一页</a>","/WebApp/user/userPages?page=0","/WebApp/user/userPages?page=2"));
//		System.out.println("org.gerry.mappers.UserMapper.getUserListPage"
//				.matches("(.*)UserMapper.getUserListPage(.*)"));
//		File file=new File(
//				"src/main/resources/Hibernate.cfg.xml");
//		System.out.println(Math.random()*10);
		for(int i=0;i<1;i++){
			Random ran=new Random();
			calculate(ran);
		}
	}
	
	
	public static void calculate(Random ran){
		bj[0]=ran.nextInt(100);		
		winResult=new BigDecimal(bj[0]).multiply(winRate);
		pinResult=winResult.subtract(new BigDecimal(bj[0]));
		pinResult=pinResult.divide(loseRate);
		loseResult=pinResult.multiply(loseRate);
		prt(winRate+"--"+bj[0]+"--"+winResult);
		prt(loseRate+"--"+pinResult+"--"+loseResult);
}
}
=======
package org.gerry.main;

import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class CodeUtils {
	private static BigDecimal winRate=new BigDecimal("1.3");
	private static BigDecimal pinRate=new BigDecimal("3.3");
	private static BigDecimal loseRate=new BigDecimal("5.3");
	private static BigDecimal winResult=null;
	private static BigDecimal pinResult=null;
	private static BigDecimal loseResult=null;
	private static BigDecimal zero=new BigDecimal("0");
	private static int[] bj=new int[3];
	
	public static String DateFormate = "yyyy-MM-dd HH:mm:ss";

	public static String parseDate(Date date) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat(DateFormate);
		return sdf.format(date);
	}

	public static void prt(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) throws Exception {
//		System.out.println(parseDate(new Date()));
//		StringBuilder sb=new StringBuilder();
//		prt(String.format("<a href=%s>上一页</a>    <a href=%s>下一页</a>","/WebApp/user/userPages?page=0","/WebApp/user/userPages?page=2"));
//		System.out.println("org.gerry.mappers.UserMapper.getUserListPage"
//				.matches("(.*)UserMapper.getUserListPage(.*)"));
//		File file=new File(
//				"src/main/resources/Hibernate.cfg.xml");
//		System.out.println(Math.random()*10);
		for(int i=0;i<1;i++){
			Random ran=new Random();
			calculate(ran);
		}
	}
	
	
	public static void calculate(Random ran){
		bj[0]=ran.nextInt(100);		
		winResult=new BigDecimal(bj[0]).multiply(winRate);
		pinResult=winResult.subtract(new BigDecimal(bj[0]));
		pinResult=pinResult.divide(loseRate);
		loseResult=pinResult.multiply(loseRate);
		prt(winRate+"--"+bj[0]+"--"+winResult);
		prt(loseRate+"--"+pinResult+"--"+loseResult);
}
}
