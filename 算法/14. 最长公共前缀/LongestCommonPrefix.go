package _4__最长公共前缀

import "strings"

func longestCommonPrefix(strs []string) string {
	first := strs[0]
	for j := 1; j < len(strs); j++ {
		index := strs[j]
		for !strings.HasPrefix(index, first) {
			if len(first) == 1 {
				return ""
			}
			first = first[0 : len(first)-1]
		}
	}
	return first
}
