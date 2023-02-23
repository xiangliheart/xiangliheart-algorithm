/**
 * Copyright (c) 2022-2023 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.algorithm.datastructure.answers.bitwise_operator;

/**
 * 一个数组中有两个数出现了奇数次，其他数都出现了偶数次，怎么找到并打印这两个数
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2023/2/17
 */
public class AnswerQ4 {
    /** 假设出现奇数次的两个数分别为a,b,
     * 1.第一次遍历数组，将所有数异或后的结果即为两个出现了奇数次的数异或的结果，即eor=a^b
     * 2.将一个数按位取反，再加1，并和它本身相与，得到的是这个数最右侧出现1的位置.
     * 一个数:  0101 0000 1111 0010
     * ~:      1010 1111 0000 1101
     * 加1:    1010 1111 0000 1110
     * &:      0000 0000 0000 0010
     * 即rightOne求出这两个数在右侧某一位上是1，两个数异或在这一位上为1，即证明a和b,
     * 这两个数在这一位上不同，即其中一个在这一位上为0.
     * 3.(arr[i]&rightOne)!=0 得到的是数组中在这一位上为1的数。
     * 4.第二次遍历，将数组中在这一位上为1的所有的数相异或，得到的结果即为，在这位上为1，且出现了奇数次的那个数onlyOne。
     * 5.已知异或的结果，已求出其中一个出现奇数次的数，则另一个出现奇数次的数为eor^onlyOne.
     */
    public static void getOddTimesNums(int[] arr) {
        //怎么把一个整型的数提取出最右侧的1
        //    N N&((~N)+1)
        int eor=0;
        for (int i=1;i<arr.length;i++){
            eor^=arr[i];
        }
        int rightOne=eor&(~eor+1); //提取出最右侧的1
        int onlyOne=0;
        for (int i=0;i< arr.length;i++){
            if ((arr[i]&rightOne)!=0){
                onlyOne^=arr[i];
            }
        }
        System.out.println(onlyOne+"  "+(eor^onlyOne));
    }
}
