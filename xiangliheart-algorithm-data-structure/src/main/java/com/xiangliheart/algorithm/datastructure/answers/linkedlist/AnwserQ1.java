/**
 * Copyright (c) 2023-2023 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.algorithm.datastructure.answers.linkedlist;

/**
 * AnwserQ1 定义一个单向链表
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2023/3/1
 */
public class AnwserQ1 {
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
}
