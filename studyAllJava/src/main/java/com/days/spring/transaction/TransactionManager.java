/******************************************** 
 * 模块名称: 工作三年经验，目标是成为JAVA高级开发攻城狮/Java 架构师我在努力！我能行！
 * 软件版权: 马琳-君子自强，脚踏实地积累
 * 源程序名：package-info.java
 * 功能说明: 俩年迷惘期，回首时才发现自己想要的目标和清晰的职业规划
 * 开发人员: 马琳-君子自强，脚踏实地积累
 * 开发时间: 2019年6月10日 下午3:03:15  今年一定要成为Java高级开发攻城狮 
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
package com.days.spring.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.interceptor.DefaultTransactionAttribute;

@Component
public  class  TransactionManager{
	@Autowired
	private  DataSourceTransactionManager  dataSourceTransactionManager;
	
	/***
	 * 
	 *@功能描述    开启事务  
	 *@作者      马琳-脚踏实地积累。Java进阶
	 *@email    1217575485@qq.com
	 *@return   获取事务状态
	 */
	public  TransactionStatus  begin() {
		return  dataSourceTransactionManager.getTransaction(new DefaultTransactionAttribute());
	}
	/***
	 * 
	 *@功能描述   提交事务   
	 *@作者      马琳-脚踏实地积累。Java进阶
	 *@email    1217575485@qq.com
	 *@param transactionStatus   数据提交到数据库中
	 */
	public  void  commit(TransactionStatus  transactionStatus) {
		dataSourceTransactionManager.commit(transactionStatus);
	}
	/***
	 * 
	 *@功能描述  事务发生异常，数据库要回滚        
	 *@作者      马琳-脚踏实地积累。Java进阶
	 *@email    1217575485@qq.com
	 *@param transactionStutas
	 */
	public  void  rollBack(TransactionStatus  transactionStutas) {
		dataSourceTransactionManager.rollback(transactionStutas);
	}
}  










