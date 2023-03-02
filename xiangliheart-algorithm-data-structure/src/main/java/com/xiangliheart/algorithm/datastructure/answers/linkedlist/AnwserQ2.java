/**
 * Copyright (c) 2023-2023 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.algorithm.datastructure.answers.linkedlist;

/**
 * AnwserQ2 定义一个双向链表
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2023/3/1
 */
public class AnwserQ2 {

    /**
     *  定义一个双向链表
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2023/3/2
     */
    public static class Node {
        public int value;

        public Node next;

        public Node pre;

        public Node(int data) {
            value = data;
        }
    }

    /**
     * reverseDoubleLinkList 反转双向链表
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2023/3/2
     */
    public Node reverseDoubleLinkList(Node head) {
        Node pre = null;
        Node next = null;
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
