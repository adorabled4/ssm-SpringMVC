package pers.dhx_.algorithm;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author Dhx_
 * @className algorithm
 * @description TODO
 * @date 2022/7/23 20:24
 */
public class Solution {
    public int[] exchange(int[] nums) {
        //奇数  n&1==1
        int i=0,j=nums.length-1,temp=0;
        while(i<=j){
            while(i<=j&&(nums[i]&1)==1) i++;
            while(i<=j&&(nums[j]&1)==0) j--;
            if((nums[i]&1)==0&&(nums[j]&1)==1)
            {
                temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
            }
        }
        return nums;
    }
    @Test
    public void Test(){
        System.out.println(Arrays.toString(exchange(new int[]{1, 2, 3, 4})));
    }
}
