/**
 * Copyright (c) 2022-2023 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.algorithm.datastructure.answers.bitwise_operator;

/**
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2023/2/17
 */
public class AnswerQ3 {

    /**
     * 利用N^N=0性质，则所有出现偶数次的数异或结果都为0，遍历数组将所有的数异或，
     * 得到的结果即为出现奇数次的数
     *
     * a    1000 1011 0011 1101
     * a    1000 1011 0011 1101
     * a^a  0000 0000 0000 0000
     * a^0  1000 1011 0011 1101
     */
    public static int getOddTimesNum(int[] arr) {
        int result = arr[0];
        for (int n : arr) {
            result ^= n;
        }
        return result;
    }
}
