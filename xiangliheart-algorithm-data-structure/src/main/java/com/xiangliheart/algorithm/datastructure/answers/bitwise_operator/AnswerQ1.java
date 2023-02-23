/**
 * Copyright (c) 2022-2023 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.algorithm.datastructure.answers.bitwise_operator;

/**
 * 提取一个数最右侧的1
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2023/2/17
 */
public class AnswerQ1 {
    /**
     * 将一个数按位取反，再加1，并和它本身相与，得到的是这个数最右侧出现1的位置
     * 一个数:  0101 0000 1111 0010
     * ~:     1010 1111 0000 1101
     * 加1:   1010 1111 0000 1110
     * &:    0000 0000 0000 0010 */
    public static int getRightOne(int n){
        return n&(~n+1);
    }
}
