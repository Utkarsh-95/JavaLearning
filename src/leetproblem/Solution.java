/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetproblem;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff) && map.get(diff) != i) {
                System.out.println(i + "-" + map.get(diff));
                return new int[]{i, map.get(diff)};
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {

        int[] array = {2, 7, 11, 15};

        Solution sol = new Solution();
        sol.twoSum(array, 9);
    }
}
