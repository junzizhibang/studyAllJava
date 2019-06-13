/******************************************** 
 * 模块名称: 工作三年经验，目标是成为JAVA高级开发攻城狮/Java 架构师我在努力！我能行！
 * 软件版权: 马琳-君子自强，脚踏实地积累
 * 源程序名：package-info.java
 * 功能说明: 俩年迷惘期，回首时才发现自己想要的目标和清晰的职业规划
 * 开发人员: 马琳-君子自强，脚踏实地积累
 * 开发时间: 2019年6月13日 上午8:14:00  今年一定要成为Java高级开发攻城狮 
 * 相关文档: 基础积累，不同的Java高阶成长路线图
 * 修改记录: 修改日期    修改人员    修改说明
 * v1.0.0.0 2019年6月13日-01    马琳        初始版本基础夯实积攒Java架构师的基础内容  
 *******************************************/

/**
 *  功能说明：              
 * 			初始版本基础夯实积攒Java架构师的基础内容  
 * @date 2019年6月13日 今年一定要成为Java高级开发攻城狮   
 * @author 马琳-君子自强，脚踏实地积累
 * @email 1217575485@qq.com
 * 
 */
package org.utils.dateutils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public  class  DateUtils{
	
	private  static SimpleDateFormat sp=new SimpleDateFormat("yyyy-MM-dd");
	
	public static void main(String[] args) {
		
		String  today=getToday();
		System.out.println(  "   ===今天日期===    "+today );
		String  yeaterDay=getYeaterday(today);
		String  now=getNowYesterday();
		System.out.println("   =====    "+  yeaterDay);
		System.out.println("   ===昨天==    "+  now);
	}
	
	/***
	 * 
	 *@功能描述    传入今天日期,得到昨天的日期    
	 *@作者      马琳-脚踏实地积累。Java进阶  yyyy-MM-dd  与YYYY-MM-dd  效果不一样的注意点
	 *@email    1217575485@qq.com
	 *@param today
	 *@return  String  昨天日期
	 */
	public static  String  getYeaterday(String  today) {
		Calendar  cal  =Calendar.getInstance();
		
		Date  date=null;
		try {
			date=sp.parse(today);
		} catch (Exception e) {
			e.printStackTrace();
		}
		cal.setTime(date);	
		cal.add(Calendar.DATE, -1);
		return  sp.format(cal.getTime());
	}
	/***
	 * 
	 *@功能描述   获取当前日期的昨天日期   
	 *@作者      马琳-脚踏实地积累。Java进阶
	 *@email    1217575485@qq.com
	 *@return   String的昨天日期
	 */
	public  static  String  getNowYesterday() {
		
		Calendar cal=Calendar.getInstance();
        cal.add(Calendar.DATE,-1);
        Date d=cal.getTime();
        
		return  sp.format(d);
	}
	/***
	 * 
	 *@功能描述  获取今天日期      
	 *@作者      马琳-脚踏实地积累。Java进阶
	 *@email    1217575485@qq.com
	 *@return
	 */
	public  static  String  getToday() {
		
		Date  date  =new Date();
		return sp.format(date);
	}
	
}





