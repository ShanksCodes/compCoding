/*
    Time Complexity     :   O(N ^ 2)
    Space Complexity    :   O(N)

    Where 'N' is the number of the presentations.
*/

// // // // Ninja is organizing a meeting in an office that starts at a time ‘0’ and will end at a time ‘LAST’. 
// // // There are ‘N’ presentations that are going to take place in that meeting whose start and end times 
// // are given, i.e., ‘ith’ presentation starts at ‘START[i]’ and ends at ‘END[i]’. 
//   The presentations don’t overlap with 
// // each other. Ninja wants to reschedule at most ‘K’ presentations keeping the original order 
// // intact so that the longest period in which there is no presentation scheduled during the 
// // meeting is maximized. Since Ninja is busy with other office work, your task is to help Ninja 
// to reschedule at most ‘K’ presentation


import java.util.ArrayList;

public class cventNinja{
	public static int maxInterval(int t, ArrayList<Integer> start, ArrayList<Integer> end, int k) {
		
		// Create an ArrayList to store the time duration in which there is no presentation.
		ArrayList<Integer> emptySlots = new ArrayList<>();

		// Fill the ArrayList 'emptySlots'.
		int prevEnd = 0;

		for (int i = 0; i < start.size(); i++) {
			emptySlots.add(start.get(i) - prevEnd);
			prevEnd = end.get(i);
		}

		emptySlots.add(t - prevEnd);
		int len = emptySlots.size();

		// Declare a variable to store the final answer.
		int ans = 0;

		// Find the subarray sum of all subarray of size K + 1.
		for (int i = 0; i < len; i++) {
		
			// Create a variable to store the sum of current subarray.
			int sum = 0;

			for (int j = i; j < len && j < i + (k + 1); j++) {
				sum += emptySlots.get(j);
			}

			// Update 'ans' with the maximum.
			ans = Math.max(ans, sum);
		}

		return ans;
	}
}