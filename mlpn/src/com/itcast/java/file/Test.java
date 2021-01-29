package com.itcast.java.file;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zzq
 * @description 获取文件信息
 * @date 2021年1月29日上午9:23:43
 */
public class Test {

	public static void main(String[] args) {

		//1. 文件最后修改日期
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		File file = new File("C:" + File.separator + "123" + File.separator );
		System.out.println("文件最后修改时间====" + sdf.format(new Date(file.lastModified())));

		//2. 创建方法获取指定文件夹下的文件大小，参数为文件绝对路径，返回值文件的大小
		String copyPath = "C:" + File.separator + "123" + File.separator;

		int count = (int) FileUtil.getFileSize(copyPath);
		System.out.println("文件的大小" +  FileUtil.round(count / (double) 1024 / 1024, 2));

		//3. 列出指定目录中的全部文件
		FileUtil.listdir(file);
		//4. 批量修改文件名称
		FileUtil.renameDir(file);

		
	}
}
