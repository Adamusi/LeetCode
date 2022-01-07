package com.utils.cn.file;
import java.io.File;

/**
 * @author zzq
 * @description 工具类
 */
public class FileUtil {

	//1. KB数据===》MB
	public static double round (double num, int scale){
		return Math.round(Math.pow(10, scale)*num)/Math.pow(10, scale);
	}

	//2. 列出指定目录中的全部文件
	public static File listdir(File file) {
		if (file.isDirectory()) {
			//列出目录中的全部内容
			File[] listFiles = file.listFiles();
			if (listFiles != null) {
				for (File filelist : listFiles) {
					//继续依次判断
					listdir(filelist);
				}
			}
		}
		//输出完整路径
		return file;
	}

	// 3.创建方法获取指定文件夹下的文件大小，参数为文件绝对路径，返回值文件的大小
	public static long getFileSize(String copyPath) {
		// 创建文件对象
		File file = new File(copyPath);
		if (file.exists()) {
			// 获取文件夹下的集合
			File[] files = file.listFiles();
			// 用来保存文件的长度
			long count = 0;
			// 遍历文件集合
			for (File f : files) {
				// 如果是文件
				if (f.isFile()) {
					// 计算文件的长度
					count += f.length();
				} else {
					// 递归调用
					count += getFileSize(f.toString());
				}
			}
			return count;
		} else {
			return 0;
		}
	}

	//4.批量修改文件名称
	public static void renameDir(File file) {
		if (file.isDirectory()) {
			//列出目录中的全部内容
			File[] listFiles = file.listFiles();
			if (listFiles != null) {
				for (File filelist : listFiles) {
					//继续依次判断
					renameDir(filelist);
				}
			}
		} else {
			if(file.isFile()){ //如果是文件必须重新命名
				String fileName = null;
				if(file.getName().contains(".")){
					fileName = file.getName().substring(0, file.getName().indexOf("."))+".txt";
				} else{
					fileName = file.getName() +".txt";
				}
				File fileNewname = new File(file.getParentFile(), fileName);
				file.renameTo(fileNewname);//重命名
			}
		}
	}
}
