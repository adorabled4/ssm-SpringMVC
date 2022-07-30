package pers.dhx_.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigInteger;

/**
 * @author Dhx_
 * @className ExtensionTest
 * @description TODO
 * @date 2022/7/28 15:49
 */
@Controller
public class ExtensionTest {
    @RequestMapping("/test/hello")
    public void test(){

    }
    public int rob(int[] nums) {
     // 子问题：
    // f(k) = 偷 [0..k) 房间中的最大金额
    // f(0) = 0
    // f(1) = nums[0]
        int n=nums.length;
        int []dp=new int [n+1];
        dp[0]=0;
        dp[1]=nums[0];
        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[n];
    }
}
/*     int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        // 子问题：
        // f(k) = 偷 [0..k) 房间中的最大金额

        // f(0) = 0
        // f(1) = nums[0]
        // f(k) = max{ rob(k-1), nums[k-1] + rob(k-2) }

        int N = nums.length;
        int[] dp = new int[N+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int k = 2; k <= N; k++) {
            dp[k] = Math.max(dp[k-1], nums[k-1] + dp[k-2]);
        }
        return dp[N];
    }*/


