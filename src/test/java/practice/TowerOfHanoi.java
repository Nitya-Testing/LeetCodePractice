package practice;

public class TowerOfHanoi {
	
	public static void toesweOfHanoi(int disks, String src, String hlp, String dest) {
		if(disks == 1) {
			System.out.println("Place the disk " + disks + " from "+src+ " to "+ dest);
			return;
		}
		
		toesweOfHanoi(disks-1, src, dest, hlp);
		System.out.println("Place the disk "+disks+ " from"+ src+ " to "+dest);
		toesweOfHanoi(disks-1, hlp, src, dest);
	}

	public static void main(String[] args) {
		int disks = 3;
		toesweOfHanoi(disks, "S", "H", "D");

	}

}
