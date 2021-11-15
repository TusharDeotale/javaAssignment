package string;
//Q 7 wap that takes input like below and generate expected output
//Input 
//  welcome to java 
//expected :
// Welcome to Java 
public class Q7_2reverse {

	public static void main(String[] args) {
		StringBuffer output = new StringBuffer();
		String input = "welcome to java";
		String[] str = input.split("\s");
		for (int i = str.length - 1; i >= 0; i--) {
			str[i] = str[i].substring(0, 1).toUpperCase() + str[i].substring(1);
			output.append(str[i] + " ");
		}
		System.out.println(output);
	}

}
