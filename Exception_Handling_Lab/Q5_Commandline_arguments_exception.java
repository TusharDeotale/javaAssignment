package lab;

public class Q5_Commandline_arguments_exception {

	public static void main(String[] args) throws Exception {
		try {
			if (args.length > 0) {
				for (int i = 0; i < args.length; i++) {
					System.out.println("args[" + i + "] = " + args[i]);
				}
			} else
				throw new Exception();
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			System.out.println("finally");
		}
	}

}
