package cn.dubby.leet;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author dubby
 * @date 2019/12/29 11:04
 */
public class Problem1 {

    public static void main(String[] args) {
        //[2,7,11,15] 9 [0,1]
    }

    //暴力
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; ++i) {
            int current = nums[i];
            for (int j = i + 1; j < nums.length; ++j) {
                int another = nums[j];
                if (current + another == target) {
                    int[] result = new int[]{-1, -1};
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        throw new IllegalArgumentException("no solution");
    }

    //hash表

}
