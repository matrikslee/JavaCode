package UI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		System.out.println("添加学生(a) 删除学生(b) 查找学生(c)");
		System.out.print("请输入操作类型:");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String type = br.readLine();
		} catch (IOException e) {
			
		}
	}

}
