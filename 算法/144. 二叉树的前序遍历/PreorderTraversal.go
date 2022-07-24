package _44__二叉树的前序遍历

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func preorderTraversal(root *TreeNode) []int {
	var vals []int
	var order func(root *TreeNode)
	order = func(root *TreeNode) {
		if root == nil {
			return
		}
		vals = append(vals, root.Val)
		order(root.Left)
		order(root.Right)
	}
	order(root)
	return vals
}
