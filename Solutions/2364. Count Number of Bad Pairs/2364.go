func countBadPairs(nums []int) int64 {
    goodPairs := 0
    totalPairs := 0
    count := make(map[int]int)

    for i, v := range nums {
        totalPairs += i
        goodPairs += count[v-i]
        count[v-i] ++
    } 
    return int64(totalPairs - goodPairs)
}