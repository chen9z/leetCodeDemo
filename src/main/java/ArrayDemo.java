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

    /**
     * 对角线遍历
     * @param matrix
     * @return
     */
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int m=matrix.length;
        int n=matrix[0].length;
        int[] mArray = new int[m * n];

        int row=0;
        int col=0;
        //记录方向，右上和左下
        int[][] dirs = {{-1, 1}, {1, -1}};
        //方向标记
        int k=0;
        for (int i = 0; i < mArray.length; i++) {
            mArray[i] = matrix[row][col];
            row += dirs[k][0];
            col += dirs[k][1];

            if (col > n - 1) {
                col=n-1;
                row+=2;
                k=1-k;
            }
            if (col < 0) {
                col=0;
                k=1-k;
            }
            if (row > m - 1) {
                row=m-1;
                col+=2;
                k=1-k;
            }
            if (row < 0) {
                row=0;
                k=1-k;
            }
        }
        return mArray;
    }

}
