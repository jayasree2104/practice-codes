import java.util.HashMap;

public class Twosum {
    // brute force o(n^2)and o(1) two for loops.
    //optimal o(n) and o(n)
    //     Traverse the array once. For each element num, compute diff = target - num.
    // If diff is already in the map, we found the pair (diff - idx, num - idx).
    // Otherwise, store num in the map and continue.
    public int[] twoSum(int[] array, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            int more = target - a;
            if (map.containsKey(more)) {
                return new int[] { map.get(more), i };
            } else {
                map.put(a, i);
            }
        }
        return new int[] { -1, -1 };
    }
}
