/******************************************** 
 * 模块名称: 工作三年经验，目标是成为JAVA高级开发攻城狮/Java 架构师我在努力！我能行！
 * 软件版权: 马琳-君子自强，脚踏实地积累
 * 源程序名：package-info.java
 * 功能说明: 俩年迷惘期，回首时才发现自己想要的目标和清晰的职业规划
 * 开发人员: 马琳-君子自强，脚踏实地积累
 * 开发时间: 2019年5月27日 上午11:12:33  今年一定要成为Java高级开发攻城狮 
 * 相关文档: 基础积累，不同的Java高阶成长路线图
 * 修改记录: 修改日期    修改人员    修改说明
 * v1.0.0.0 2019年5月27日-01    马琳        初始版本基础夯实积攒Java架构师的基础内容  
 *******************************************/

/**
 *  功能说明：   打印类           
 * 			初始版本基础夯实积攒Java架构师的基础内容  
 * @date 2019年5月27日 今年一定要成为Java高级开发攻城狮   
 * @author 马琳-君子自强，脚踏实地积累
 * @email 1217575485@qq.com
 * 
 */
package com.days.printJob;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public  class  PrintDemo{
	
	
	public static void main(String[] args) {
		/****第一 打印一页示例*****/
		PrintDemo  demo  =new  PrintDemo();
		demo.printDemo();
		/****第二 打印多页示例*****/
		try {
		
		PrintPage  mulipages=new  PrintPage();
		PrinterJob  job =PrinterJob.getPrinterJob();
		if(job.printDialog())
			return;
		Book  printBook=new  Book();
		PageFormat  pformat=new PageFormat();
		printBook.append(new PrintPage(), pformat);//添加一页
		printBook.append(new  PrintPage(), pformat,5);//添加5页
		job.setPageable(printBook);//设置打印页
		job.setJobName("多页打印");
		job.print();
		}catch (Exception e) {
			System.out.println("出错信息："+e.getMessage());
			e.printStackTrace();
		}
				/****第一 打印一页示例*****/
		
		
		
		
	}
	
	/**
	*@功能描述    直接打印，没有预览功能    
	*@作者      马琳-脚踏实地积累。Java进阶
	*@email    1217575485@qq.com
	*/
	private void printDemo() {

		try {
			PrinterJob  printer  =PrinterJob.getPrinterJob();
			if(!printer.printDialog()) {
				return;
			}
			printer.setPrintable(new Printable() {
				
				private  final  int  width=130;//图像宽度
				private  final  int  height=130;//图像高度
				@Override
				public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
				 if(pageIndex>0) {
					 return  Printable.NO_SUCH_PAGE;
				 }
				 int  x=(int)pageFormat.getImageableX();
				 int  y=(int)pageFormat.getImageableY();
				 Graphics2D  g2=(Graphics2D) graphics;
				 g2.setStroke(new  BasicStroke());
				 g2.setColor(Color.BLUE);
				 g2.drawOval(x+10, y+10, width, height);
				 
				 
				 g2.draw3DRect(width, height, x, y, true);
				 g2.setColor(Color.GREEN);
				 return  Printable.PAGE_EXISTS;
				}
			});
			
			printer.setJobName("打印圆形");
			printer.print();
		}catch (Exception e) {
			System.out.println("错误信息： "+e.getMessage());
		}

	}
	
	
	
	/**
	*@功能描述   多页打印      
	*@作者      马琳-脚踏实地积累。Java进阶
	*@email    1217575485@qq.com
	*/
	private void multiPrintPage() {
		// TODO Auto-generated method stub

	}
	
	
	
	/**
	*@功能描述     打印预览  
	*@作者      马琳-脚踏实地积累。Java进阶
	*@email    1217575485@qq.com
	*/
	private void prePrint() {
		// TODO Auto-generated method stub

	}
	static  class  PrintPage  implements  Printable{

		/**
		 *  功能描述     打印多页示例
		 *
		 * @param graphics
		 * @param pageFormat
		 * @param pageIndex
		 * @return
		 * @throws PrinterException
		 */
		@Override
		public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
		    
			//获取可打印区域坐标的X，Y位置
			 int  x= (int)pageFormat.getImageableX();
		     int  y= (int)pageFormat.getImageableY();
		     Graphics2D  g2=(Graphics2D) graphics;
		     g2.drawString("多也打印示例的的第"+pageIndex+"页", x, y+10);
		     
			return PrintPage.PAGE_EXISTS;
		}
		
	}
	
	
	
	
	
	
	
}








