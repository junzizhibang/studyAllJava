/******************************************** 
 * 模块名称: 工作三年经验，目标是成为JAVA高级开发攻城狮/Java 架构师我在努力！我能行！
 * 软件版权: 马琳-君子自强，脚踏实地积累
 * 源程序名：ThreadDemo.java
 * 功能说明: 俩年迷惘期，回首时才发现自己想要的目标和清晰的职业规划
 * 开发人员: 马琳-君子自强，脚踏实地积累
 * 开发时间: 2019年5月23日 下午2:55:46  今年一定要成为Java高级开发攻城狮 
 * 相关文档: 基础积累，不同的Java高阶成长路线图
 * 修改记录: 修改日期    修改人员    修改说明
 * v1.0.0.0 2019年5月23日-01    马琳        初始版本基础夯实积攒Java架构师的基础内容  
 *******************************************/

package com.days.thread;

/**
 * 功能说明：初始版本基础夯实积攒Java架构师的基础内容  
  什么是进程？
 进程其实就是一个应用程序，进程是所有线程集合。
  什么是线程？ 
  线程其实就是一条执行路径. main 主线程 如果是自己创建线程 子线程
 gc线程 专门回收垃圾
 
 
 
 
 * @date 2019年5月23日 今年一定要成为Java高级开发攻城狮   
 * @author 马琳-君子自强，脚踏实地积累
 * @email 1217575485@qq.com
 * 
 */
public class ThreadDemo {

 
	public static void main(String[] args) {
		
		ThreadDemo  demo  =new  ThreadDemo();
		/***   第一种建立线程模式   内部类     * */
//		ThreadDemo.ThreadofExtends   ex1 =demo.new   ThreadofExtends() ;
//		ThreadDemo.ThreadofExtends   ex2 =demo.new   ThreadofExtends() ;
//		ex1.setName("ThreadofExtends线程1");
//		ex1.start();
//		ex2.setName("ThreadofExtends线程2");
//		ex2.start();
		
		/**   第二种建立线程模式使用接口实现   **/
//		ThreadofRunnable   ofrunnable=  demo.new ThreadofRunnable();
//		Thread  thread=new  Thread(ofrunnable);
//		thread.setName("使用的是Runnable  接口创建的线程");
//		thread.start();
		
		/*****  第三步是针对火车票 俩个窗口争抢火车票现象     *****/
		TrainThread   train1  =demo.new  TrainThread();
		train1.flag=false;
		Thread  trainWin1=new  Thread(train1);
		trainWin1.setName("售票窗口1");
		TrainThread   train2  =demo.new  TrainThread();
		Thread  trainWin2=new  Thread(train2);
		trainWin2.setName("售票窗口2");
//		TrainThread   train3  =demo.new  TrainThread();
//		Thread  trainWin3=new  Thread(train3);
//		trainWin3.setName("售票窗口3");
		
		trainWin1.start();
		trainWin2.start();
//		trainWin3.start();
		
		
	}
	
	
	/****
	 * 
	 * 功能说明：初始版本基础夯实积攒Java架构师的基础内容  
	 *       获取多线程当前对象
	 * @date 2019年5月23日 今年一定要成为Java高级开发攻城狮   
	 * @author 马琳-君子自强，脚踏实地积累
	 * @email 1217575485@qq.com
	 *
	 */
	class  ThreadofExtends   extends   Thread{
		 /**
		 * extends   Thread  第一种方法建立线程会有乱序现象
		 *
		 */
		@Override
		public void run() {
			for (int i = 0; i < 100; i++) {
				try {
					// 注意 sleep 会让当前线程更具具体时间，会停止掉。进入休眠状态，但是不会释放锁。
					Thread.sleep(100);
				} catch (Exception e) {
					System.out.println( "明显失败暂且不处理！"+e.getMessage()  );
				}
				System.out.println("线程name:"+Thread.currentThread().getName() + "--i:" + i  +"  线程id:   "+Thread.currentThread().getId());
			}			
		}
			
			
		
	} 
	class   ThreadofRunnable   implements  Runnable{

		/**
		 * implements  Runnable  第二种实现接口来建立线程
		 *
		 */
		@Override
		public void run() {
			for (int i = 0; i < 100; i++) {
				// sleep 是毫秒
				try {
					// sleep作用让当先线程从运行状态变为休眠状态，如果时间到期有会到运行状态。
					// sleep 不能释放锁，多线程之间实现同步
					Thread.sleep(100);
					// 获取到线程的ID ID是多线程随机进行分配不重复主键。

				} catch (Exception e) {
					// TODO: handle exception
				}
				System.out.println("线程name:"+Thread.currentThread().getName() + "--i:" + i  +"  线程id:   "+Thread.currentThread().getId());
				
			}
		}
		
	}
	/****
	 * 
	 * 功能说明：【资源争抢示例】第三  火车票在多线程下怎么样能够避免争抢资源保证有序
	 * 初始版本基础夯实积攒Java架构师的基础内容  
	 * @date 2019年5月23日 今年一定要成为Java高级开发攻城狮   
	 * @author 马琳-君子自强，脚踏实地积累
	 * @email 1217575485@qq.com
	 *
	 */
	class   TrainThread  implements   Runnable{

		// 定义火车票总数
		private  int trainCount = 100;
	    //锁对象
		private Object oj = new Object();
		 boolean  flag=true;
		@Override
		public void run() {
		     if(flag) {
		    	 while (trainCount > 0) {
							sellTrain();
				     }
		     }else {
		    	 while (trainCount > 0) {
						synchronized(oj) {
							sellTrain();
						}
				     }
		     }
			
		}
		/**
		 *车票卖票窗口
		 *   这里面添加的这个synchronized 方法锁和类锁
		 *    如果flag为true 先拿到obj 这把锁 才能进入show方法， 进入show方法后需要this锁。
		     如果flag为false 先拿到this 这把锁 ，才能进入show方法，进入到show方法  obj这把锁。
			死锁的原因就是 同步中嵌套了同步
		 */
		private synchronized void sellTrain() {
			synchronized (oj) {
				if (trainCount > 0) {
					System.out.println(Thread.currentThread().getName() + ",目前正在出售第" + (100 - trainCount + 1) + "票");
					trainCount--;
				}
			}

		}
		
	}
	
}
