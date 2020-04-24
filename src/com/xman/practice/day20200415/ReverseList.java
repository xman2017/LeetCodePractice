package com.xman.practice.day20200415;

import com.xman.practice.common.ListNode;

/**
 * @Author: xman
 * @CreateDate: 2020/4/15 17:35
 * @Description: 反转链表 #Leetcode 24
 */
public class ReverseList {

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur !=null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }

        return pre;
    }
}
