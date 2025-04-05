func maximumTripletValue(nums []int) int64 {
    n := len(nums)
    max_suffix := make([]int, n+1)
    for i := n-1;  i > 0; i-- {
        max_suffix[i] = max(max_suffix[i+1], nums[i])
    }
    ans := 0
    i := nums[0]
    var j, k int
    for l := 1; l < n; l++{
        i = max(i, nums[l-1])
        j = nums[l]
        k = max_suffix[l+1]
        ans = max(ans, (i-j)*k)
    }
    return int64(ans)
}

