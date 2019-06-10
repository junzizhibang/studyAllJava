/******************************************** 
 * 模块名称: 工作三年经验，目标是成为JAVA高级开发攻城狮/Java 架构师我在努力！我能行！
 * 软件版权: 马琳-君子自强，脚踏实地积累
 * 源程序名：package-info.java
 * 功能说明: 俩年迷惘期，回首时才发现自己想要的目标和清晰的职业规划
 * 开发人员: 马琳-君子自强，脚踏实地积累
 * 开发时间: 2019年6月4日 上午10:40:28  今年一定要成为Java高级开发攻城狮 
 * 相关文档: 基础积累，不同的Java高阶成长路线图
 * 修改记录: 修改日期    修改人员    修改说明
 * v1.0.0.0 2019年6月4日-01    马琳        初始版本基础夯实积攒Java架构师的基础内容  
 *******************************************/

/**
 *  功能说明：              
 * 			初始版本基础夯实积攒Java架构师的基础内容  
 * @date 2019年6月4日 今年一定要成为Java高级开发攻城狮   
 * @author 马琳-君子自强，脚踏实地积累
 * @email 1217575485@qq.com
 * 
 */
package com.days.redis;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import redis.clients.jedis.Jedis;

public   class   RedisDemo{
	
	public static void main(String[] args) {
		
	}
	
	
	/**
	*@功能描述        
	*@作者      马琳-脚踏实地积累。Java进阶
	*@email    1217575485@qq.com
	*/
	private  static void testPing() {
	        //连接本地的 Redis 服务
	        Jedis jedis = new Jedis("localhost");
	        System.out.println("连接成功");
	        //查看服务是否运行
	        System.out.println("服务正在运行: "+jedis.ping());
	}
//	Redis Java String(字符串) 实例
 
	
	/**
	*@功能描述        
	*@作者      马琳-脚踏实地积累。Java进阶
	*@email    1217575485@qq.com
	*/
	private void testRedisStr() {
		 //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        //设置 redis 字符串数据
        jedis.set("runoobkey", "www.runoob.com");
        // 获取存储的数据并输出
        System.out.println("redis 存储的字符串为: "+ jedis.get("runoobkey"));
	}
	
	
	/**
	*@功能描述  Redis Java List(列表) 实例       
	*@作者      马琳-脚踏实地积累。Java进阶
	*@email    1217575485@qq.com
	*/
	private void testRedisList() {
		 //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        //存储数据到列表中
        jedis.lpush("site-list", "Runoob");
        jedis.lpush("site-list", "Google");
        jedis.lpush("site-list", "Taobao");
        // 获取存储的数据并输出
        List<String> list = jedis.lrange("site-list", 0 ,2);
        for(int i=0; i<list.size(); i++) {
            System.out.println("列表项为: "+list.get(i));
        }
	}
	
	
	
	/**
	*@功能描述     Redis Java Keys 实例    
	*@作者      马琳-脚踏实地积累。Java进阶
	*@email    1217575485@qq.com
	*/
	private void testRedisKey() {
		  //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
 
        // 获取数据并输出
        Set<String> keys = jedis.keys("*"); 
        Iterator<String> it=keys.iterator() ;   
        while(it.hasNext()){   
            String key = it.next();   
            System.out.println(key);   
        }
	}
}









