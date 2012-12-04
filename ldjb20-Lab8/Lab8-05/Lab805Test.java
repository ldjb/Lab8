public class Lab805Test {
	
	private static boolean isPrime(int n) {
		if (n > 1) {
			for (int i=2; i<n; i++) {
				if (n%i == 0) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		for (int i=-5; i<21; i++) {
			System.out.print(Integer.toString(i) + " is ");
			if (!isPrime(i)) {
				System.out.print("not ");
			}
			System.out.println("prime.");
		}
	}
	
}