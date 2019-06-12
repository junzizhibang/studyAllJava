/******************************************** 
 * 模块名称: 工作三年经验，目标是成为JAVA高级开发攻城狮/Java 架构师我在努力！我能行！
 * 软件版权: 马琳-君子自强，脚踏实地积累
 * 源程序名：package-info.java
 * 功能说明: 俩年迷惘期，回首时才发现自己想要的目标和清晰的职业规划
 * 开发人员: 马琳-君子自强，脚踏实地积累
 * 开发时间: 2019年6月10日 下午3:02:54  今年一定要成为Java高级开发攻城狮 
 * 相关文档: 基础积累，不同的Java高阶成长路线图
 * 修改记录: 修改日期    修改人员    修改说明
 * v1.0.0.0 2019年6月10日-01    马琳        初始版本基础夯实积攒Java架构师的基础内容  
 *******************************************/

/**
 *  功能说明：              
 * 			初始版本基础夯实积攒Java架构师的基础内容  
 * @date 2019年6月10日 今年一定要成为Java高级开发攻城狮   
 * @author 马琳-君子自强，脚踏实地积累
 * @email 1217575485@qq.com
 * 
 */
package com.days.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.days.thread.batchSms.UserInfo;

@Repository
public  class  UserInfoDao{
	
	@Autowired
	private  JdbcTemplate  jdbcTemplate;

	public  void  addUserInfo(UserInfo  user) {
		String  sql="Insert into  t_userinfo values(null ,?,? ,?,?,?,?,?,?,?,?,?,?   );";
		jdbcTemplate.update(sql,user.getUserName(),user.getContent(),user.getDescription(),user.getPassWord(),user.getTelNum(),
				user.getAddr(),user.getAge(),user.getSex(),user.getReserve1(),user.getReserve2(),user.getReserve3(),user.getReserve4());
		System.out.println("用户信息新增成功！！");
	}
	public  UserInfo  getUserInfobyName(String  userName){
		UserInfo  user=null;
		String sql ="select  *  from  T_userinfo  where  userName=?";
		jdbcTemplate.queryForObject(sql,UserInfo.class,userName);

		return   user;
	}
	
}



