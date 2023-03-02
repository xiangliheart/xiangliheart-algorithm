/**
 * Copyright (c) 2023-2023 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.algorithm.datastructure.answers.linkedlist;

/**
 * AnwserQ3
 * <p>
 * 有一个单链表的head，我们想删除它其中的一个节点node。
 * <p>
 * 给你一个需要删除的节点node 。你将无法访问第一个节点head。
 * <p>
 * 链表的所有值都是 唯一的,并且保证给定的节点node不是链表中的最后一个节点。
 * <p>
 * 删除给定的节点。注意，删除节点并不是指从内存中删除它。这里的意思是：
 * 给定节点的值不应该存在于链表中。
 * 链表中的节点数应该减少 1。
 * node 前面的所有值顺序相同。
 * node 后面的所有值顺序相同。
 * <p>
 * 自定义测试：
 * 对于输入,你应该提供整个链表head和要给出的节点node。node不应该是链表的最后一个节点，而应该是链表中的一个实际节点。
 * 我们将构建链表，并将节点传递给你的函数。
 * 输出将是调用你函数后的整个链表。
 * <p>
 * 示例 1：
 * 输入：head = [4,5,1,9], node = 5
 * 输出：[4,1,9]
 * 解释：指定链表中值为5的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9
 * <p>
 * 示例 2：
 * 输入：head = [4,5,1,9], node = 1
 * 输出：[4,5,9]
 * 解释：指定链表中值为1的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9
 * <p>
 * 提示：
 * 链表中节点的数目范围是 [2, 1000]
 * -1000 <= Node.val <= 1000
 * 链表中每个节点的值都是唯一的
 * 需要删除的节点node是链表中的节点,且不是末尾节点
 * <p>
 * Related Topics 链表
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2023/2/22
 */
public class AnwserQ3 {

    /**
     * 定义一个单向链表
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2023/3/2
     */
    public static class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    /**
     * deleteNode 删除链表中指定的数据节点
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2023/3/2
     */
    public Node deleteNode(Node head, int num) {
        if (head == null) {
            return null;
        }
        Node pre = head;
        Node cur = head;
        while (cur != null) {
            if (cur.data == num) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }
}
