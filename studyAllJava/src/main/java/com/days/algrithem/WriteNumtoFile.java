/******************************************** 
 * 模块名称: 工作三年经验，目标是成为JAVA高级开发攻城狮/Java 架构师我在努力！我能行！
 * 软件版权: 马琳-君子自强，脚踏实地积累
 * 源程序名：package-info.java
 * 功能说明: 俩年迷惘期，回首时才发现自己想要的目标和清晰的职业规划
 * 开发人员: 马琳-君子自强，脚踏实地积累
 * 开发时间: 2019年5月31日 下午5:19:16  今年一定要成为Java高级开发攻城狮 
 * 相关文档: 基础积累，不同的Java高阶成长路线图
 * 修改记录: 修改日期    修改人员    修改说明
 * v1.0.0.0 2019年5月31日-01    马琳        初始版本基础夯实积攒Java架构师的基础内容  
 *******************************************/

/**
 *  功能说明：              
 * 			初始版本基础夯实积攒Java架构师的基础内容  
 * @date 2019年5月31日 今年一定要成为Java高级开发攻城狮   
 * @author 马琳-君子自强，脚踏实地积累
 * @email 1217575485@qq.com
 * 
 */
package com.days.algrithem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WriteNumtoFile {

	public static void main(String[] args) {

	}

	public static void copyFilebyStream(String fromFile, String toFile) {
		try {
			File inputFile = new File(fromFile);
			if (!inputFile.exists()) {
				System.out.println("源文件不存在，程序终止");
				System.exit(1);
			}
			File outputFile = new File(toFile);
			InputStream in = new FileInputStream(inputFile);
			OutputStream out = new FileOutputStream(outputFile);

			byte date[] = new byte[1024];
			int temp = 0;
			while ((temp = in.read(date)) != -1) {
				out.write(date);
			}
			in.close();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("源文件" + fromFile + "已拷贝完成" + toFile);
	}

	public static void readFile(String fromFile, String toFile) {
		String line;
		int i = 0, j = 0, f = 0, k = 0;
		try {
			BufferedReader in = new BufferedReader(new FileReader(fromFile));
			line = in.readLine();
			while (line != null) {
				char c[] = line.toCharArray();
				for (int i1 = 0; i1 < c.length; i1++) {
					// 如果是字母
					if (Character.isLetter(c[i1]))
						i++;
					// 如果是数字
					else if (Character.isDigit(c[i1]))
						j++;
					// 是空格
					else if (Character.isWhitespace(c[i1]))
						f++;
				}
				line = in.readLine();
				k++;
			}
			in.close();
			System.out.println("字母:" + i + ",数字:" + j + ",空格:" + f + ",行数:" + k);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeFile(String fromFile, String toFile) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\test.txt"));
			StringBuilder sb = new StringBuilder();
			while (true) {
				String str = br.readLine();
				if (str == null)
					break;
				sb.append(str);
			}
			Pattern p = Pattern.compile("aa");
			Matcher m = p.matcher(sb);
			int count = 0;
			while (m.find()) {
				count++;
			}
			System.out.println("\"aa\"一共出现了" + count + "次");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void readFilebyBuffer(String fromFile, String toFile) {
		try {
			// 方法一
			BufferedReader br = new BufferedReader(new FileReader(new File("D:\\1.xls")));
			// StringBuilder bd = new StringBuilder();
			StringBuffer bd = new StringBuffer();
			while (true) {
				String str = br.readLine();
				if (str == null) {
					break;
				}
				System.out.println(str);
				bd.append(str);
			}

			br.close();
			System.out.println(bd.toString());
		} catch (Exception e) {
			System.out.println("抓取错误信息为：" + e.getMessage());
		}
	}

	public static void readFilebyStream(String fromFile, String toFile) {

		InputStream is = null;
		try {
			is = new FileInputStream(new File("d:\\1.xls"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		byte b[] = new byte[Integer.parseInt(new File("d:\\1.xls").length() + "")];
		try {
			is.read(b);
			System.out.write(b);
			System.out.println();
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void readFilebyReader(String fromFile, String toFile) {
		try {
			Reader r = new FileReader(new File("d:\\1.xls"));
			char c[] = new char[(int) new File("d:\\1.xls").length()];
			r.read(c);
			String str = new String(c);
			System.out.print(str);
			r.close();

		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writesFilebyReader(String fromFile, String toFile) {

		try {
			PrintWriter pw = new PrintWriter(new FileWriter("d:\\1.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("d:\\1.txt")));
			OutputStream os = new FileOutputStream(new File("d:\\1.txt"));
			// 1
			os.write("ffff".getBytes());
			// 2
			bw.write("ddddddddddddddddddddddddd");
			// 3
			pw.print("你好sssssssssssss");

			bw.close();
			pw.close();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readandparseFile(String fromFile, String toFile) {

//read and parse
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("d:\\2.txt")));
			StringBuffer sb = new StringBuffer();
			while (true) {
				String str = br.readLine();
				if (str == null) {
					break;
				}
				sb.append(str + "、");
			}

			String str = sb.toString();
			String s[] = str.split("、");
			double d[] = new double[s.length];
			for (int i = 0; i < s.length; i++) {
				d[i] = Double.parseDouble(s[i]);
			}
			for (int i = 0; i < d.length; i++) {
				System.out.println(d[i]);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
