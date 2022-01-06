package solution;

import java.util.HashMap;

public class TwoSumSolution {

    public int[] twoSum(int[] numbs, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbs.length; i++) {
            if (map.containsKey(target - numbs[i])) {
                return new int[] {map.get(target - numbs[i]), i };
            } else {
                map.put(numbs[i], i);
            }

        }

        return new int[] { -1, -1 };
    }

}


