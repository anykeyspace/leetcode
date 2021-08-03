package anykeyspace.p1containsduplicate;

import java.util.Arrays;
import java.util.HashSet;

/**
 * https://leetcode.com/problems/contains-duplicate/
 * #arrays
 */
public class ContainsDuplicate {

    public boolean containsDuplicateV1Sorting(int[] nums) {
        if (nums.length < 2) {
            return false;
        }

        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }

        return false;
    }

    public boolean containsDuplicateV2HashTable(int[] nums) {
        var seen = new HashSet<Integer>();

        for (var num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
