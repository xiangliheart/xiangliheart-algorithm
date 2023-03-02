/**
 * Copyright (c) 2023-2023 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.algorithm.datastructure.answers.linkedlist;

/**
 * AnwserQ5
 *
 * 给你单链表的头节点head，请你反转链表，并返回反转后的链表。
 * 示例1：
 * 输入：head=[1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 *
 * 示例2：
 * 输入：head=[1,2]
 * 输出：[2,1]
 *
 * 示例3：
 * 输入：head=[]
 * 输出：[]
 *
 * 提示：
 * 链表中节点的数目范围是[0,5000]
 * -5000<=Node.val<=5000
 *
 * 进阶：链表可以选用迭代或递归方式完成反转。你能否用两种方法解决这道题？
 * RelatedTopics递归链表
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2023/2/22
 */
public class AnwserQ4 {

    /**
     * 定义一个单向链表
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2023/3/2
     */
    public static class Node {
        public int value;

        public Node next;

        public Node(int data) {
            value = data;
        }
    }

    /**
     * reverseLinkedList 反转单向链表
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2023/3/2
     */
    public Node reverseLinkedList(Node head) {
        Node pre = null;
        Node next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    /**
     *  定义一个双向链表
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2023/3/2
     */
    public static class DoubleNode {
        public int value;

        public DoubleNode next;

        public DoubleNode pre;

        public DoubleNode(int data) {
            value = data;
        }
    }

    /**
     * reverseDoubleLinkList 反转双向链表
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2023/3/2
     */
    public DoubleNode reverseDoubleLinkList(DoubleNode head) {
        DoubleNode pre = null;
        DoubleNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            head.pre = next;
            pre = head;
            head = next;
        }
        return pre;
    }
}
