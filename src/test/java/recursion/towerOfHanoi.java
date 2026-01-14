package recursion;

public class towerOfHanoi {
	
	public static void solve(int n, String src,String dest, String helper) {
		
		if(n == 1) {
			System.out.println("Moving the disk " +n+ " from " + src + " and putting it in " + dest);
			return;
		}
		
		// Step 1: Move n-1 disks from source to helper
		solve(n-1, src, helper, dest);
		
		// Step 2: Move nth disk from source to destination
        System.out.println("Move disk " + n + " from " + src + " to " + dest);

        
        //Step 3: Move n-1 disks from helper to destination
		solve(n-1, helper, dest, src);
		
	}

	public static void main(String[] args) {
		 int n = 3; // Number of disks
		 solve(n, "A", "B", "C"); // Solve the problem

	}

}
