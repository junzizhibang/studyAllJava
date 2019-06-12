/******************************************** 
 * 模块名称: 工作三年经验，目标是成为JAVA高级开发攻城狮/Java 架构师我在努力！我能行！
 * 软件版权: 马琳-君子自强，脚踏实地积累
 * 源程序名：package-info.java
 * 功能说明: 俩年迷惘期，回首时才发现自己想要的目标和清晰的职业规划
 * 开发人员: 马琳-君子自强，脚踏实地积累
 * 开发时间: 2019年5月24日 上午9:33:39  今年一定要成为Java高级开发攻城狮 
 * 相关文档: 基础积累，不同的Java高阶成长路线图
 * 修改记录: 修改日期    修改人员    修改说明
 * v1.0.0.0 2019年5月24日-01    马琳        初始版本基础夯实积攒Java架构师的基础内容  
 *******************************************/

/**
 * 功能说明：   批次发送短信   使用多线程
 * 初始版本基础夯实积攒Java架构师的基础内容  
 * @date 2019年5月24日 今年一定要成为Java高级开发攻城狮   
 * @author 马琳-君子自强，脚踏实地积累
 * @email 1217575485@qq.com
 * 
 */
package com.days.thread.batchSms;

import java.util.ArrayList;
import java.util.List;

public class BatchSendSmsThread extends Thread {

	public static List<UserInfo> userLists;

	/****
	 * 
	 * 模拟发短信线程
	 *
	 */
	public void run() {

		if (userLists.size() > 0) {
			for (UserInfo user : userLists) {
				System.out.println("线程:" + Thread.currentThread().getName() + user.toString());
			}
		}
	}

	/**
	 * 初始化数据短信
	 */
	public static List<UserInfo> init() {
		List<UserInfo> list = new ArrayList<UserInfo>();
		for (int i = 1; i <= 140; i++) {
			UserInfo userEntity = new UserInfo();
			userEntity.setId( i);
			userEntity.setUserName("userName" + i);
			userEntity.setContent("模拟新建" + i + "条短信！");
			list.add(userEntity);
		}
		return list;

	}

	public static void main(String[] args) {

		// 1.初始化用户数据
		userLists = init();
		// 2.计算创建创建多少个线程并且每一个线程需要执行“分批发送短信用户”
		// 每一个线程分批跑多少
		int userThreadPage = 50;
		// 计算所有线程数
		List<List<UserInfo>> splitUserList = ListUtils.splitList(userLists, userThreadPage);
		int threadSaze = splitUserList.size();
		for (int i = 0; i < threadSaze; i++) {
			List<UserInfo> list = splitUserList.get(i);
			BatchSendSmsThread userThread = new BatchSendSmsThread();
			// 3.执行任务发送短信
			userThread.start();
		}

	}
}

/**
 * 
 * @classDesc: 功能描述:(Java集合工具类)
 * 
 */
class ListUtils {
	/**
	 * 
	 * @methodDesc: 功能描述:(list 集合分批切割)
	 * 
	 * @returnType:@param list 切割集合
	 * @returnType:@param pageSize 分页长度
	 * @returnType:@return List<List<T>> 返回分页数据
	 */
	static public <T> List<List<T>> splitList(List<T> list, int pageSize) {
		int listSize = list.size();
		int page = (listSize + (pageSize - 1)) / pageSize;
		List<List<T>> listArray = new ArrayList<List<T>>();
		for (int i = 0; i < page; i++) {
			List<T> subList = new ArrayList<T>();
			for (int j = 0; j < listSize; j++) {
				int pageIndex = ((j + 1) + (pageSize - 1)) / pageSize;
				if (pageIndex == (i + 1)) {
					subList.add(list.get(j));
				}
				if ((j + 1) == ((j + 1) * pageSize)) {
					break;
				}
			}
			listArray.add(subList);
		}
		return listArray;
	}
}
