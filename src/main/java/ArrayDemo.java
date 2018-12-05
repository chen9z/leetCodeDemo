import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created by chen on 2018/12/5.
 */
public class ArrayDemo {

    /**
     * 求满足左右两边相等的中间索引
     *
     * @param nums [-10000,10000]
     * @return -1
     */
    public int pivotIndex(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        float leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == sum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    /**
     * 至少是其他数字两倍的最大数
     * @param nums
     * @return
     */
    public int dominantIndex(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            int va = nums[i];
            if (va == max) {
                maxIndex = i;
                continue;
            }
            if (max < 2 * va) {
                return -1;
            }
        }
        return maxIndex;
    }

    /**
     * 加一
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i < digits.length; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
                if (i == 0) {
                    int[] resultArray = new int[digits.length + 1];
                    resultArray[0] = 1;
                    System.arraycopy(digits, 0, resultArray, 1, digits.length);
                    return resultArray;
                }
            } else {
                digits[i] = digits[i] + 1;
                return digits;
            }
        }
        return digits;
    }


}
