/******************************************** 
 * 模块名称: 工作三年经验，目标是成为JAVA高级开发攻城狮/Java 架构师我在努力！我能行！
 * 软件版权: 马琳-君子自强，脚踏实地积累
 * 源程序名：package-info.java
 * 功能说明: 俩年迷惘期，回首时才发现自己想要的目标和清晰的职业规划
 * 开发人员: 马琳-君子自强，脚踏实地积累
 * 开发时间: 2019年6月12日 上午8:21:37  今年一定要成为Java高级开发攻城狮 
 * 相关文档: 基础积累，不同的Java高阶成长路线图
 * 修改记录: 修改日期    修改人员    修改说明
 * v1.0.0.0 2019年6月12日-01    马琳        初始版本基础夯实积攒Java架构师的基础内容  
 *******************************************/

/**
 *  功能说明：              
 * 			初始版本基础夯实积攒Java架构师的基础内容  
 * @date 2019年6月12日 今年一定要成为Java高级开发攻城狮   
 * @author 马琳-君子自强，脚踏实地积累
 * @email 1217575485@qq.com
 * 
 */
package com.days.beans;

import java.io.Serializable;

public  class  Log  implements  Serializable{

	/**
	 * long
	 */
	private static final long serialVersionUID = 1L;
	
 	
	private  int  id;
	private String  userName;
	private String  content;
	private String  description;
	private String  creDt;
	private String  creTime;
	private String  reserve1;
	private String  reserve2;
	private String  reserve3;
	private String  reserve4;
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
	public String getCreDt() {
		return creDt;
	}
	/**
	 * set 方法
	 *
	 * @param creDt 
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	/**
	 *get方法
	 *
	 * @return 
	 */
	public String getCreTime() {
		return creTime;
	}
	/**
	 * set 方法
	 *
	 * @param creTime 
	 */
	public void setCreTime(String creTime) {
		this.creTime = creTime;
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
		return "Log [id=" + id + ", userName=" + userName + ", content=" + content + ", description=" + description
				+ ", creDt=" + creDt + ", creTime=" + creTime + ", reserve1=" + reserve1 + ", reserve2=" + reserve2
				+ ", reserve3=" + reserve3 + ", reserve4=" + reserve4 + "]";
	}
	/**
	 *  描述
	 *
	 * @param id
	 * @param userName
	 * @param content
	 * @param description
	 * @param creDt
	 * @param creTime
	 * @param reserve1
	 * @param reserve2
	 * @param reserve3
	 * @param reserve4
	 */
	public Log(int id, String userName, String content, String description, String creDt, String creTime,
			String reserve1, String reserve2, String reserve3, String reserve4) {
		super();
		this.id = id;
		this.userName = userName;
		this.content = content;
		this.description = description;
		this.creDt = creDt;
		this.creTime = creTime;
		this.reserve1 = reserve1;
		this.reserve2 = reserve2;
		this.reserve3 = reserve3;
		this.reserve4 = reserve4;
	}
    
	
}




