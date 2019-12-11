
public class SumUpTo {
	
	public static double sumUpTo(int n) throws IllegalArgumentException{
		if(n < 0) {
			throw new IllegalArgumentException();
		} else if(n <= 1) {
			return (double) n;
		} else {
			return 1.0 / n + sumUpTo(n - 1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(sumUpTo(3));
	}

}
