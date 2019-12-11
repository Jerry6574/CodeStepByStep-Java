
public class MirrorSequence {
	public static void mirrorSequence(int n) throws IllegalArgumentException{
		if(n < 1) {
			throw new IllegalArgumentException();
		} else if(n == 1) {
			System.out.print("1");
		} else if(n == 2){
			System.out.print("1 1");
		} else {
			if(n % 2 == 1) {
				System.out.print((n / 2 + 1) + " ");
				mirrorSequence(n - 2);
				System.out.print(" " + (n / 2 + 1));
			} else {
				System.out.print(n / 2 + " ");
				mirrorSequence(n - 2);
				System.out.print(" " + n / 2);
			}
		}
	}
	public static void main(String[] args) {
		mirrorSequence(4);
	}

}
