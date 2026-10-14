package heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TaskScheduler {
	
	public static int leastInterval(char[] tasks, int n) {
		int size = tasks.length;
		int seat = 1;
		Map<Character,Integer> hm = new HashMap<>();
		Map<Character,Integer> freeMap = new HashMap<>();
		PriorityQueue<Pair> maxHeap = new PriorityQueue<>(
				(a,b)->{
					if(a.freq != b.freq) {
						return b.freq - a.freq;
					}else {
						return b.child - a.child;
					}
				}
		);
		
		for(int i=0;i<size;i++) {
			hm.put(tasks[i],hm.getOrDefault(tasks[i], 0)+1);
			freeMap.put(tasks[i], 1);
		}
		
		for(Map.Entry<Character,Integer> entry:hm.entrySet()) {
			maxHeap.add(new Pair(entry.getValue(),entry.getKey()));
		}
		
		while(!maxHeap.isEmpty()) {
			ArrayList<Pair> stashList = new ArrayList<>();
			
			while(!maxHeap.isEmpty()) {
				Pair p = maxHeap.poll();
				int freq = p.freq;
				char child = p.child;
				
				if(freeMap.get(child)<=seat) {
					int updatedFreq = freq-1;
					if(updatedFreq>0) {
						maxHeap.add(new Pair(updatedFreq,child));
						int freeSlot = seat+n+1;
						freeMap.put(child, freeSlot);
					}
					break;
				}else {
					stashList.add(p);
				}
			}
			
			for(int i=0;i<stashList.size();i++) {
				maxHeap.add(stashList.get(i));
			}
			seat++;
			
		}
		return seat-1;
		
		
	}

	public static void main(String[] args) {
		
		char[] tasks = {'A','A','A','B','B','B'};
		int n = 2;
		int num = leastInterval(tasks, n);
		System.out.println(num);
		
		

	}

}
