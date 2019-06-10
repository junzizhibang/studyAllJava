/******************************************** 
 * 模块名称: 工作三年经验，目标是成为JAVA高级开发攻城狮/Java 架构师我在努力！我能行！
 * 软件版权: 马琳-君子自强，脚踏实地积累
 * 源程序名：UserInfo.java
 * 功能说明: 俩年迷惘期，回首时才发现自己想要的目标和清晰的职业规划
 * 开发人员: 马琳-君子自强，脚踏实地积累
 * 开发时间: 2019年5月24日 上午10:44:43  今年一定要成为Java高级开发攻城狮 
 * 相关文档: 基础积累，不同的Java高阶成长路线图
 * 修改记录: 修改日期    修改人员    修改说明
 * v1.0.0.0 2019年5月24日-01    马琳        初始版本基础夯实积攒Java架构师的基础内容  
 *******************************************/

package com.days.thread.batchSms;

/**
 * 功能说明：    短信信息
 * 初始版本基础夯实积攒Java架构师的基础内容  
 * @date 2019年5月24日 今年一定要成为Java高级开发攻城狮   
 * @author 马琳-君子自强，脚踏实地积累
 * @email 1217575485@qq.com
 * 
 */
public class UserInfo {

	
     private   String	userName   ;
     private   String	id   ;
     private   String	content   ;
	/**
	 *get方法
	 *
	 * @return 
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 *set 方法
	 *
	 * @param userName 
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 *get方法
	 *
	 * @return 
	 */
	public String getId() {
		return id;
	}
	/**
	 *set 方法
	 *
	 * @param id 
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 *get方法
	 *
	 * @return 
	 */
	public String getContent() {
		return content;
	}
	/**
	 *set 方法
	 *
	 * @param content 
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * toString
	 *
	 * @return
	 */
	@Override
	public String toString() {
		return "发送详情 [接收人姓名=" + userName + ",手机号码=" + id + ",短信内容=" + content + "]";
	}
     
     
     
  
}
