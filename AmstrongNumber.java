package pgdacb;

public class AmstrongNumber {

	public static void main(String[] args) {

		int n, x, temp, sum = 0;
		int sr = 1;
		int er = 500;
		System.out.print("Amstrong Numbers are --> ");

		for (int i = sr + 1; i <= er; i++) {
			temp = i;
			sum = 0; 
			while (temp != 0) 
			{
				n = temp % 10; 
				x = n * n * n; 
				sum = sum + x; 
				temp = temp / 10; 
			}
			if (i == sum) 
				System.out.print(i + ", ");

		}
	}

}
