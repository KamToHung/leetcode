package ___两数相加

type ListNode struct {
	Val  int
	Next *ListNode
}

func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
	node := &ListNode{}
	cur := node
	flag := 0
	for l1 != nil || l2 != nil {
		var m = 0
		var n = 0
		if l1 != nil {
			m = l1.Val
		}
		if l2 != nil {
			n = l2.Val
		}
		sum := m + n + flag
		flag = sum / 10
		curValue := sum % 10
		curNode := &ListNode{
			Val: curValue,
		}
		cur.Next = curNode
		cur = cur.Next
		if l1 != nil {
			l1 = l1.Next
		}
		if l2 != nil {
			l2 = l2.Next
		}
	}
	// 最后如果还有进位未处理需要加一
	if flag == 1 {
		cur.Next = &ListNode{
			Val: flag,
		}
	}
	return node.Next
}
