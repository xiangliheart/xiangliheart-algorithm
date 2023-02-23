/**
 * Copyright (c) 2022-2023 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.algorithm.datastructure.answers.bitwise_operator;

/**
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2023/2/17
 */
public class AnswerQ2 {

    /**
     * 异或运算可实现两个变量值交换，但两个变量必须指向不同的内存空间。
     * 如果两个变量指向同一个内存空间，则会报错
     *
     * a:    0000 1011 0101 0000
     * b:    0011 0110 1011 0101
     * a=a^b 0011 1101 1110 0101
     * b=a^b 0000 1011 0101 0000
     */
    public static void swap(int i,int j){
        i=i^j;
        j=i^j;
        i=i^j;
    }
}
