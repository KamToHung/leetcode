package _807__替换字符串中的括号内容

import "strings"

func evaluate(s string, knowledge [][]string) string {
	// 构建散列表
	memo := make(map[string]string)
	for _, v := range knowledge {
		memo[v[0]] = v[1]
	}
	// 循环替换
	result := &strings.Builder{}
	start := 0
	flag := false
	// 循环字符串
	for index, value := range s {
		if value == '(' {
			// 如果是'('则记录下标
			start = index
			flag = true
		} else if value == ')' {
			// 结束,把从start开始到现在index的字符串截取下来
			// 左闭右开
			info := s[start+1 : index]
			if v, ok := memo[info]; ok {
				result.WriteString(v)
			} else {
				result.WriteString("?")
			}
			flag = false
		} else if !flag {
			result.WriteRune(value)
		}
	}
	return result.String()
}
