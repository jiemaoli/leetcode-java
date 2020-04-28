package difficulty.easy;

/**
 * Description: COPY 官网答案
 * User: jerry
 * DateTime: 2020-04-27 16:48
 */
public class 整数反转 {
    public static void main(String[] args) {
        int test1 = solution(123);

    }

    /**
     * 官网解法（数学公式法）
     *
     * @param x
     * @return
     */
    private static int solution(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            if ((rev > Integer.MAX_VALUE / 10) || (rev == Integer.MAX_VALUE / 10 && pop > 7))
                return 0;
            if ((rev < Integer.MIN_VALUE / 10) || (rev == Integer.MIN_VALUE / 10 && pop < -8))
                return 0;
            rev = rev * 10 + pop;
            x /= 10;
        }
        return rev;
    }

    /**
     * 字符串转
     *
     * @param x
     * @return
     */
    public int reverse(int x) {
        String xString = Integer.toString(x);
        if (x < 0)
            xString = xString.substring(1, xString.length());
        StringBuilder sb = new StringBuilder(xString);
        sb.reverse();
        if (x < 0)
            sb.insert(0, "-1");
        try {
            Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
        return Integer.parseInt(sb.toString());
    }

    /**
     * 字符串简单写法
     *
     * @param x
     * @return
     */
    public int reverse2(int x) {
        String rev = x < 0 ? new StringBuilder(String.valueOf(-x)).reverse().insert(0, "-").toString()
                : new StringBuilder(String.valueOf(x)).reverse().toString();
        try {
            return Integer.parseInt(rev);
        } catch (Exception e) {
            return 0;
        }
    }
}
