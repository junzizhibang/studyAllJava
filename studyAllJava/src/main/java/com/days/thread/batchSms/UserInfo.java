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

import java.io.Serializable;

/**
 * 功能说明：    短信信息
 * 初始版本基础夯实积攒Java架构师的基础内容  
 * @date 2019年5月24日 今年一定要成为Java高级开发攻城狮   
 * @author 马琳-君子自强，脚踏实地积累
 * @email 1217575485@qq.com
 * 
 */
public class UserInfo   implements  Serializable{

	
	 /**
	 * long
	 */
	private static final long serialVersionUID = 1L;
	 private   int	id   ;
     private   String	userName   ;
     private   String	content   ;
     private   String	description   ;
     private   String	passWord   ;
     private   String	telNum   ;
     private   String	addr   ;
     private   int	age   ;
     private   String	sex   ;
     private   String	reserve1   ;
     private   String	reserve2   ;
     private   String	reserve3   ;
     private   String	reserve4   ;
	/**
	 *get方法
	 *
	 * @return 
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * set 方法
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
	public int getId() {
		return id;
	}
	/**
	 * set 方法
	 *
	 * @param id 
	 */
	public void setId(int id) {
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
	 * set 方法
	 *
	 * @param content 
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 *get方法
	 *
	 * @return 
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * set 方法
	 *
	 * @param description 
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 *get方法
	 *
	 * @return 
	 */
	public String getPassWord() {
		return passWord;
	}
	/**
	 * set 方法
	 *
	 * @param passWord 
	 */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	/**
	 *get方法
	 *
	 * @return 
	 */
	public String getTelNum() {
		return telNum;
	}
	/**
	 * set 方法
	 *
	 * @param telNum 
	 */
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}
	/**
	 *get方法
	 *
	 * @return 
	 */
	public int getAge() {
		return age;
	}
	/**
	 * set 方法
	 *
	 * @param age 
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 *get方法
	 *
	 * @return 
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * set 方法
	 *
	 * @param sex 
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 *get方法
	 *
	 * @return 
	 */
	public String getReserve1() {
		return reserve1;
	}
	/**
	 * set 方法
	 *
	 * @param reserve1 
	 */
	public void setReserve1(String reserve1) {
		this.reserve1 = reserve1;
	}
	/**
	 *get方法
	 *
	 * @return 
	 */
	public String getReserve2() {
		return reserve2;
	}
	/**
	 * set 方法
	 *
	 * @param reserve2 
	 */
	public void setReserve2(String reserve2) {
		this.reserve2 = reserve2;
	}
	/**
	 *get方法
	 *
	 * @return 
	 */
	public String getReserve3() {
		return reserve3;
	}
	/**
	 * set 方法
	 *
	 * @param reserve3 
	 */
	public void setReserve3(String reserve3) {
		this.reserve3 = reserve3;
	}
	/**
	 *get方法
	 *
	 * @return 
	 */
	public String getReserve4() {
		return reserve4;
	}
	/**
	 * set 方法
	 *
	 * @param reserve4 
	 */
	public void setReserve4(String reserve4) {
		this.reserve4 = reserve4;
	}
	/**
	 *  功能描述     
	 *
	 * @return
	 */
	@Override
	public String toString() {
		
		System.out.println("发送详情 [接收人姓名=" + userName + ",手机号码=" + id + ",短信内容=" + content  );
		return "UserInfo [userName=" + userName + ", id=" + id + ", content=" + content + ", description=" + description
				+ ", passWord=" + passWord + ", telNum=" + telNum + ", age=" + age + ", sex=" + sex + ", reserve1="
				+ reserve1 + ", reserve2=" + reserve2 + ", reserve3=" + reserve3 + ", reserve4=" + reserve4 + "]";
		
		
	}


	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
}
