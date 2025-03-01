func applyOperations(nums []int) []int {
    n := len(nums)
    for i := 0; i < n - 1; i++ {
        if nums[i] == nums[i+1] {
            nums[i] *= 2
            nums[i+1] = 0
        }
    }
    ans := make([]int, n)
    i := 0
    for j := range len(nums) {
        if nums[j] != 0 {
            ans[i] = nums[j]
            i += 1
        }
    }
    return ans
}