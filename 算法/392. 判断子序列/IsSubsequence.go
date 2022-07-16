package _92__判断子序列

func isSubsequence(s string, t string) bool {
	sLen := 0
	tLen := 0
	for {
		if sLen == len(s) || tLen == len(t) {
			break
		}
		if s[sLen] == t[tLen] {
			sLen++
			tLen++
		} else {
			tLen++
		}
	}
	return sLen == len(s)
}
