package recursionPractice7thMarch;

public class TowerOfHanoi {
	
	public static void solve(int n, String src, String helper, String dest) {
		//base Condition
		if(n == 1) {
			System.out.println("Pick "+n+ " from "+ src +" and put it on " + dest);
			return;
		}
		
		//pick n-1 and put it on helper
		solve(n-1, src, dest, helper);
		
		//Pick last disk and put it on Dest
		System.out.println("Pick "+n+ " from "+ src +" and put it on " + dest);
		
		//pick disk from helper and put it on dest
		solve(n-1, helper, src, dest);
	}

	public static void main(String[] args) {
		
		int n = 3;
		solve(n, "src", "helper", "dest");

	}

}
