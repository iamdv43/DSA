package problemStmt;

import solution.TwoSumSolution;

import java.util.Arrays;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

public class TwoSum implements problems {

    int[] numbs;
    int target;

    public TwoSum(int[] num, int target) {
        this.numbs = num;
        this.target = target;
    }

    @Override
    public void solve() {

        TwoSumSolution twoSumSolution = new TwoSumSolution();

        System.out.println(Arrays.toString(twoSumSolution.twoSum(numbs, target)));

    }
}
