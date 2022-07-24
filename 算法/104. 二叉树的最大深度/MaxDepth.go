package _04__二叉树的最大深度

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func maxDepth(root *TreeNode) int {
	if root == nil {
		return 0
	}
	leftMax := maxDepth(root.Left)
	rightMax := maxDepth(root.Right)
	return max(leftMax, rightMax) + 1
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}
