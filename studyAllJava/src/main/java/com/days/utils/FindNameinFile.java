/******************************************** 
 * 模块名称: 工作三年经验，目标是成为JAVA高级开发攻城狮/Java 架构师我在努力！我能行！
 * 软件版权: 马琳-君子自强，脚踏实地积累
 * 源程序名：FindNameinFile.java
 * 功能说明: 俩年迷惘期，回首时才发现自己想要的目标和清晰的职业规划
 * 开发人员: 马琳-君子自强，脚踏实地积累
 * 开发时间: 2019年5月23日 下午4:25:53  今年一定要成为Java高级开发攻城狮 
 * 相关文档: 基础积累，不同的Java高阶成长路线图
 * 修改记录: 修改日期    修改人员    修改说明
 * v1.0.0.0 2019年5月23日-01    马琳        初始版本基础夯实积攒Java架构师的基础内容  
 *******************************************/

package com.days.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 * 功能说明：初始版本基础夯实积攒Java架构师的基础内容  
 *             在文件中查找一个含有特别的字符串，然后把这一行存到一个文件件
 * @date 2019年5月23日 今年一定要成为Java高级开发攻城狮   
 * @author 马琳-君子自强，脚踏实地积累
 * @email 1217575485@qq.com
 * 
 */
public class FindNameinFile {
	
	
	
	/**
	 * 读取文件工具类  字符流 ，快一些
	 */
	private BufferedReader   reader;
	/***
	 * 写文件工具类
	 */
	private  BufferedWriter  writer;
	 
	private  ArrayList<String>  strList=new ArrayList<String>();
	public FindNameinFile() {
	}
	/***
	 * 
	 *  查找字符串
	 *
	 * @param name    文件里面查找字符串
	 * @param fileName    文件列表
	 */
	public   void findNameByFile(String name  ,String  fileName) {
		try {
			File   file=new File(fileName);
			int  count=0;
			if(file.isDirectory()) {
				File []  fileList= file.listFiles();
				for (int i = 0; i < fileList.length; i++) {
					File  txtFile= fileList[i];
					if(txtFile.isFile()) {
						StringBuffer  strBuffer=new StringBuffer();
						reader = new BufferedReader(new FileReader(txtFile));
						while(reader.readLine()!=null) {
							strBuffer.append(reader.readLine());
							if(strBuffer.toString().contains(name)) {
								String  saveName =name+count ;
								count++;
							    writer=   new BufferedWriter(new FileWriter(new  File(fileName+"/"+saveName+".txt")));
								writer.write( strBuffer.toString() );
								System.out.println(saveName+"文件处理完成！----》当期处理文件为"+txtFile.getName());
								
							}
							strBuffer.setLength(0);
						}
						  reader.close();
					      writer.close();;
						 	
					}
				}
			}else {
					StringBuffer  strBuffer=new StringBuffer();
					reader = new BufferedReader(new FileReader(file));
					String  lineTxt=reader.readLine();
					while(lineTxt!=null) {
						strBuffer.append(lineTxt);
						if(strBuffer.toString().contains(name)) {
							System.out.println(strBuffer.toString().trim());
							
							int  beginIndex =strBuffer.toString().indexOf("tranSerialNo\":\"")+15;
							int  beginNameIndex =strBuffer.toString().indexOf("name\":\"")+7;
							int  endNameIndex =strBuffer.toString().indexOf("\"}}");
							String  indexStr=strBuffer.toString().substring(beginIndex,beginIndex+13);
							System.out.println("获取到的tranSerialNo："+indexStr);
							
							strList.add(indexStr);
							
							String  indexNameStr=strBuffer.toString().substring(beginNameIndex, endNameIndex);
							System.out.println("获取到的Name："+indexNameStr);
							String  saveName =indexNameStr+indexStr ;
						 
							int  begContentIndex =strBuffer.toString().indexOf("\"facePhoto\":\"")+13;
							int  endContentIndex =strBuffer.toString().indexOf("\",\"face_token\":");
							String  fromContent=strBuffer.toString().substring(begContentIndex, endContentIndex);
						    writer=   new BufferedWriter(new FileWriter(new  File( "E:\\马琳\\"+saveName+".txt")));
							writer.write(fromContent);
							System.out.println(saveName+"文件处理完成！----》当期处理文件为"+file.getName());
						}
						strBuffer.setLength(0);
						lineTxt=reader.readLine();
					}
					  reader.close();
				      writer.close();;
				}
		}catch (Exception e) {
			System.out.println("  文件读取时出错"+e.getMessage());
		}
		   
		    
		    
		    
		    
		    
		    
	}
	
	public static void main(String[] args) {
	//	FindNameinFile   util=  new findNameByFile("facePhoto","E:\\马琳");
		FindNameinFile   util=  new FindNameinFile( );
//		util.readContent("E:\\马琳\\", "facePhoto");
		util.findAllCode("E:\\马琳\\", "facePhoto");
	}
	
	/****
	 * 
	 * 针对日志文件里面的特定字符，使用工具类抓取出来，单独的存在文件里面利于以后分析
	 *
	 * @param fileName    文件名称，这里处理为文件夹，自己去读取文件夹下面的所有日志文件
	 * @param content     要找到的字符串可自定义
	 */
	private void readContent(String  fileName  ,String  content) {
		try {
			File   file=new File(fileName);
			if(file.isDirectory()) {
				File []  fileList= file.listFiles();
				for (int i = 0; i < fileList.length; i++) {
					File  txtFile= fileList[i];
					if(txtFile.isFile()) {
						StringBuffer  strBuffer=new StringBuffer();
						reader = new BufferedReader(new FileReader(txtFile));
						String  lineTxt=reader.readLine();
						while(lineTxt!=null) {
							strBuffer.append(lineTxt);
							if(strBuffer.toString().contains(content)) {
								
								int  beginIndex =strBuffer.toString().indexOf("tranSerialNo\":\"")+15;
								int  beginNameIndex =strBuffer.toString().indexOf("name\":\"")+7;
								int  endNameIndex =strBuffer.toString().indexOf("\"}}");
							 
								String  indexStr=strBuffer.toString().substring(beginIndex,beginIndex+13);
								System.out.println("获取到的tranSerialNo："+indexStr);
								String  indexNameStr=strBuffer.toString().substring(beginNameIndex, endNameIndex);
								System.out.println("获取到的Name："+indexNameStr);
								String  saveName =indexNameStr+indexStr ;
							 
								int  begContentIndex =strBuffer.toString().indexOf("\"facePhoto\":\"")+13;
								int  endContentIndex =strBuffer.toString().indexOf("\",\"face_token\":");
								String  fromContent=strBuffer.toString().substring(begContentIndex, endContentIndex);
							    writer=   new BufferedWriter(new FileWriter(new  File( "E:\\马琳\\"+saveName+".txt")));
								writer.write(fromContent);
								System.out.println(saveName+"文件处理完成！----》当期处理文件为"+txtFile.getName());
								
								
							}
							strBuffer.setLength(0);
							lineTxt=reader.readLine();
						}	

						}
					}
				
				  reader.close();
			      writer.close();;
			} else {
				System.out.println(" 输入文件夹路劲即可" );
				}
		 
		}catch (Exception e) {
			System.out.println("  文件读取时出错"+e.getMessage());
			e.printStackTrace();
			
		}finally {
			 
		}
		   

	}
	
	
	/**
	 * 
	 * 搜集所有的RetCode信息  strList  前面处理的文字串存入然后针对的请求处理
	 *
	 * @param fileName   文件
	 * @param content
	 */
	private void findAllCode(String  fileName  ,String  content) {
		try {
			File   file=new File(fileName);
			if(file.isDirectory()) {
				File []  fileList= file.listFiles();
				for (int i = 0; i < fileList.length; i++) {
					File  txtFile= fileList[i];
					if(txtFile.isFile()) {
						StringBuffer  strBuffer=new StringBuffer();
						reader = new BufferedReader(new FileReader(txtFile));
						String  lineTxt=reader.readLine();
						while(lineTxt!=null) {
							strBuffer.append(lineTxt);
							if(strBuffer.toString().contains(content)) {
								
								int  beginIndex =strBuffer.toString().indexOf("tranSerialNo\":\"")+15;
								int  beginNameIndex =strBuffer.toString().indexOf("name\":\"")+7;
								int  endNameIndex =strBuffer.toString().indexOf("\"}}");
								String  indexStr=strBuffer.toString().substring(beginIndex,beginIndex+13);
								System.out.println("获取到的tranSerialNo："+indexStr);
								strList.add(indexStr);
								String  indexNameStr=strBuffer.toString().substring(beginNameIndex, endNameIndex);
								System.out.println("获取到的Name："+indexNameStr);
								String  saveName =indexNameStr+indexStr ;
								System.out.println(saveName+"     文件处理完成！----》当期处理文件为"+txtFile.getName());
							}
							strBuffer.setLength(0);
							lineTxt=reader.readLine();
						}	
						}
					}
				
				 writer=   new BufferedWriter(new FileWriter(new  File( "E:\\马琳\\返回码信息汇总.txt")));
				 
				for (int i = 0; i < fileList.length; i++) {
					File  txtFile= fileList[i];
					if(txtFile.isFile()) {
						StringBuffer  codeBuffer=new StringBuffer();
						reader = new BufferedReader(new FileReader(txtFile));
						String  lineTxt=reader.readLine();
						while(lineTxt!=null) {
							codeBuffer.append(lineTxt);
							for(int  k=0;k<strList.size();k++) {
								//"tranSerialNo":"1558244787094","retCode":"
							if(codeBuffer.toString().contains("\"tranSerialNo\":\""+strList.get(k)+"\",\"retCode\":\"")) {
								
								int  begIndex =codeBuffer.toString().indexOf("\"tranSerialNo\"");
								int  endIndex =codeBuffer.toString().indexOf("\"resbody\"");
								String  indexStr=codeBuffer.toString().substring(begIndex,endIndex);
								System.out.println("获取到的返回码完整信息："+indexStr);
								writer.write("获取到的返回码完整信息："+indexStr+"\n");
							}
							}
							codeBuffer.setLength(0);
							lineTxt=reader.readLine();
							
							}	
						}
					}
				   
					System.out.println("-----返回码汇总文件处理完成！----");
				
				  reader.close();
			      writer.close();;
			} else {
				System.out.println(" 输入文件夹路劲即可" );
				}
		 
		}catch (Exception e) {
			System.out.println("  文件读取时出错"+e.getMessage());
			e.printStackTrace();
			
		} 
		   
	}
	
	

}
