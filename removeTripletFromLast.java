import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class removeTripletFromLast {
    private static int[] removeLastTriplet(int[] input) {
        boolean[] toRemove = new boolean[input.length];
        Map<Integer, Integer> counts = new HashMap<>();

        // Count how many times each input value is found.
        for (int value : input) {
            int count = counts.getOrDefault(value, 0);
            counts.put(value, count + 1);
        }

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            // Determine how many triplets we have for this value
            int tripletCount = value / 3;

            // Keep track of where we're starting
            int currentIndex = input.length - 1;

            // Remove each triplet
            for (int tripletIndex = 0; tripletIndex < tripletCount; tripletIndex++) {
                // Count the number of elements in this triplet
                int thisTripletCount = 0;

                // Mark each member of the triplet for deletion
                for (int inputIndex = currentIndex; thisTripletCount < 3; inputIndex--) {
                    if (input[inputIndex] == key) {
                        // Mark this index for removal
                        toRemove[inputIndex] = true;
                        thisTripletCount++;
                    }

                    // Keep track of where we are in the overall input array
                    currentIndex--;
                }
            }
        }

        // Create a list to store the non-removed elements
        List<Integer> outputList = new ArrayList<>();

        for (int index = 0; index < input.length; index++) {
            if (!toRemove[index]) {
                outputList.add(input[index]);
            }
        }

        // Convert the list to an array
        int[] output = new int[outputList.size()];
        for (int i = 0; i < outputList.size(); i++) {
            output[i] = outputList.get(i);
        }

        return output;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6, 6, 6 };
        int[] result = removeLastTriplet(arr);

        System.out.println(Arrays.toString(result));
    }
}
