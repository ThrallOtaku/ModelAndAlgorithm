package com.tht.swordOffer;

/**
 *
 */
public class deleteDuplication {
    /**
     * 删除链表中重复的节点
     * 输入1，2，2，3，3，4
     * 输出1，4
     * @param pHead
     * @return
     */
    public duplicateNo.ListNode deleteDuplication(duplicateNo.ListNode pHead) {
        //如果只有一个节点不用删除
        if (pHead == null || pHead.next == null)
            return pHead;
        duplicateNo.ListNode next = pHead.next;
        //找到跟head重复的节点
        if (pHead.val == next.val) {
            while (next != null && pHead.val == next.val)
                next = next.next;
            return deleteDuplication(next);
        } else {
            pHead.next = deleteDuplication(pHead.next);
            return pHead;
        }
    }

}
