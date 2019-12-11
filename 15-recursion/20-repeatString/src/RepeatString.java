
public class RepeatString {
	
	public static String repeatString(String s, int n) throws IllegalArgumentException{
		if(n < 0) {
			throw new IllegalArgumentException("n must be > 1");
		} else if(n == 0) {
			return "";
		} else {
			return s + repeatString(s, n-1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(repeatString("ABC", 3));
	}

}
