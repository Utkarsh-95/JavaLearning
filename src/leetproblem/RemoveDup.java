/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetproblem;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class RemoveDup {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
//        System.out.println(nums[0] + "-" + nums[1] + "-" + nums[2]);
        for (int x = 0; x < i + 1; x++) {
            System.out.println(nums[x]);
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3};
        System.out.println(RemoveDup.removeDuplicates(array));
    }
}
