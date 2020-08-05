package com.zsun.java.leetcode;

/**
 * Created by qzou at 2020-08-05 20:36
 *
 * @author qzou
 */
public class CodilityFour {
    /**
     * 相邻相同的字母，只保留两个
     */
    public String Solution(String S) {
        if ("".equals(S) || S.length() == 1) {
            return S;
        }

        char[] chars = S.toCharArray();
        StringBuffer sb = new StringBuffer(chars.length);
        int slow = 0;
        int fast = 1;
        int length = chars.length;
        int currentCharCount = 1;
        sb.append(chars[slow]);
        while (fast < length) {
            if (chars[fast] != chars[slow]) {
                sb.append(chars[fast]);
                slow = fast;
                fast++;
                currentCharCount = 1;
                continue;
            }
            if (currentCharCount == 1) {
                currentCharCount++;
                sb.append(chars[fast]);
                slow = fast;
                fast++;
                continue;
            }
            fast++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        CodilityFour codilityFour = new CodilityFour();
        System.out.println(codilityFour.Solution("eedaaad"));
        System.out.println(codilityFour.Solution("xxxtxxx"));
        System.out.println(codilityFour.Solution("uuuuxaaaaxuuu"));
        System.out.println(codilityFour.Solution(""));
        System.out.println(codilityFour.Solution("s"));
        System.out.println(codilityFour.Solution("ssssss"));
        System.out.println(codilityFour.Solution("ssssst"));
        System.out.println(codilityFour.Solution("abc"));
        System.out.println(codilityFour.Solution("sdfalsdjfaksldjfklasjdfkajsdfjalskdjfklasdjfklsjdkfjsdkfjskldfjoiweurpioqweieurtergihfdksdfalsdjfaksldjfklasjdfkajsdfjalskdjfklasdjfklsjdkfjsdkfjskldfjoiweurpioqweieurtergihfdksdfalsdjfaksldjfklasjdfkajsdfjalskdjfklasdjfklsjdkfjsdkfjskldfjoiweurpioqweieurtergihfdksdfalsdjfaksldjfklasjdfkajsdfjalskdjfklasdjfklsjdkfjsdkfjskldfjoiweurpioqweieurtergihfdksdfalsdjfaksldjfklasjdfkajsdfjalskdjfklasdjfklsjdkfjsdkfjskldfjoiweurpioqweieurtergihfdksdfalsdjfaksldjfklasjdfkajsdfjalskdjfklasdjfklsjdkfjsdkfjskldfjoiweurpioqweieurtergihfdksdfalsdjfaksldjfklasjdfkajsdfjalskdjfklasdjfklsjdkfjsdkfjskldfjoiweurpioqweieurtergihfdksdfalsdjfaksldjfklasjdfkajsdfjalskdjfklasdjfklsjdkfjsdkfjskldfjoiweurpioqweieurtergihfdksdfalsdjfaksldjfklasjdfkajsdfjalskdjfklasdjfklsjdkfjsdkfjskldfjoiweurpioqweieurtergihfdksdfalsdjfaksldjfklasjdfkajsdfjalskdjfklasdjfklsjdkfjsdkfjskldfjoiweurpioqweieurtergihfdksdfalsdjfaksldjfklasjdfkajsdfjalskdjfklasdjfklsjdkfjsdkfjskldfjoiweurpioqweieurtergihfdksdfalsdjfaksldjfklasjdfkajsdfjalskdjfklasdjfklsjdkfjsdkfjskldfjoiweurpioqweieurtergihfdksdfalsdjfaksldjfklasjdfkajsdfjalskdjfklasdjfklsjdkfjsdkfjskldfjoiweurpioqweieurtergihfdksdfalsdjfaksldjfklasjdfkajsdfjalskdjfklasdjfklsjdkfjsdkfjskldfjoiweurpioqweieurtergihfdksdfalsdjfaksldjfklasjdfkajsdfjalskdjfklasdjfklsjdkfjsdkfjskldfjoiweurpioqweieurtergihfdksdfalsdjfaksldjfklasjdfkajsdfjalskdjfklasdjfklsjdkfjsdkfjskldfjoiweurpioqweieurtergihfdksdfalsdjfaksldjfklasjdfkajsdfjalskdjfklasdjfklsjdkfjsdkfjskldfjoiweurpioqweieurtergihfdksdfalsdjfaksldjfklasjdfkajsdfjalskdjfklasdjfklsjdkfjsdkfjskldfjoiweurpioqweieurtergihfdksdfalsdjfaksldjfklasjdfkajsdfjalskdjfklasdjfklsjdkfjsdkfjskldfjoiweurpioqweieurtergihfdksdfalsdjfaksldjfklasjdfkajsdfjalskdjfklasdjfklsjdkfjsdkfjskldfjoiweurpioqweieurtergihfdksdfalsdjfaksldjfklasjdfkajsdfjalskdjfklasdjfklsjdkfjsdkfjskldfjoiweurpioqweieurtergihfdksdfalsdjfaksldjfklasjdfkajsdfjalskdjfklasdjfklsjdkfjsdkfjskldfjoiweurpioqweieurtergihfdk"));
    }
}
