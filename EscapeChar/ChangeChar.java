//在控制台按Tab键可以实现命令补齐
//演示转义字符的使用
public class ChangeChar {

	//编写一个main
	public static void main(String[] args) {

	//  \t :一个制表位，实现对齐功能
	 	System.out.println("北京\t天津\t上海");
	//  \n	:换位符
	 	System.out.println("jack\nsmith\nmary");
	//  \\	:一个\
	 	System.out.println("D:\\OneDrive\\Desktop\\Java");
	//  \"	:一个"
		System.out.println("小徐说：\"好好学java，有前途\"");
	//  \'	:一个'
		System.out.println("小徐说：\'好好学java，有前途\'");
	//	\r	:一个回车	System.out.println("小徐\r北京");
		System.out.println("小徐\r\n北京");
	}

}