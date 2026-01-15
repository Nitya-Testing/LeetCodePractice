package recursion;

public class TowerOfHanoiPractice {
	
	public static void solve(int n,String src,String helper,String dest) {
		//base condition
		if(n == 1) {
			System.out.println("Shift "+n+" from "+src+ " to "+dest);
			return;
		}
		
		//shift n-1 disk from src to helper
		solve(n-1,src,dest,helper);
		
		System.out.println("Shift "+n+" from " + src+ " to "+dest);
		
		//shift n-1 from helper to dest
		solve(n-1,helper,src,dest);
		
	}

	public static void main(String[] args) {
		
		int n = 3; // Number of disks
		 solve(n, "A", "B", "C"); // Solve the problem

	}

}
