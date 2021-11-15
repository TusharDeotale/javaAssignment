package string;

//Q6 wap that takes input like below and generate expected output 
//Program Input 
//  my name  is khan 
//
//expected :
//  khan is name my 

public class Q6_ReverseString {

	public static void main(String[] args) {
		StringBuffer output = new StringBuffer();
		String input = "my name is khan";
		String[] str = input.split("\s");
		for (int i = str.length - 1; i >= 0; i--) {
			output.append(str[i] + " ");
		}
		System.out.println(output);
	}

}
