/******************************************** 
 * 模块名称: 工作三年经验，目标是成为JAVA高级开发攻城狮/Java 架构师我在努力！我能行！
 * 软件版权: 马琳-君子自强，脚踏实地积累
 * 源程序名：JdbcTemplateUtil.java
 * 功能说明: 俩年迷惘期，回首时才发现自己想要的目标和清晰的职业规划
 * 开发人员: 马琳-君子自强，脚踏实地积累
 * 开发时间: 2019年6月11日 下午4:10:37  今年一定要成为Java高级开发攻城狮 
 * 相关文档: 基础积累，不同的Java高阶成长路线图
 * 修改记录: 修改日期    修改人员    修改说明
 * v1.0.0.0 2019年6月11日-01    马琳        初始版本基础夯实积攒Java架构师的基础内容  
 *******************************************/

package com.days.spring.transaction;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *  功能说明：              
 * 			初始版本基础夯实积攒Java架构师的基础内容  
 * @date 2019年6月11日 今年一定要成为Java高级开发攻城狮   
 * @author 马琳-君子自强，脚踏实地积累
 * @email 1217575485@qq.com
 * 
 */
public class JdbcTemplateUtil {

	
	private  static  DriverManagerDataSource  ds;
	public static void main(String[] args) {
		connect("",",","");
		initJdbcTemplate();
	}
	
	
	/**
	*@功能描述     使用Spring的JDBCTemplate操作数据库     
	*@作者      马琳-脚踏实地积累。Java进阶
	*@email    1217575485@qq.com
	*/
	private static void connect(String  userName,String password,String type) {
		if(type.equals("mysql")) {
			ds.setDriverClassName("com.mysql.jdbc.driver");
			ds.setUrl("jdbc:mysql://localhost:3306/test");
		    ds.setUsername(userName);
		    ds.setPassword(password);
		}else {
			ds=null;
		}
	}
	
	
	/**
	*@功能描述   初始化JDBC操作工具类     
	*@作者      马琳-脚踏实地积累。Java进阶
	*@email    1217575485@qq.com
	*/
	private  static  void initJdbcTemplate() {
		 JdbcTemplate  jdbc =new  JdbcTemplate();
		 jdbc.setDataSource(ds);
		 jdbc.execute("");
		 
		 
	}
}
