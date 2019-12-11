
public class HashString {
	public static String hashString(int k) throws IllegalArgumentException{
		if(k < 0) {
			throw new IllegalArgumentException("k must > 0");
		} else if(k == 0) {
			return "#";
		} else {
			String hash = repeatString("#", (int) Math.pow(2, k-1));
			return hash + hashString(k - 1);
		}
	}
	
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
		System.out.println(hashString(3));
	}

}
