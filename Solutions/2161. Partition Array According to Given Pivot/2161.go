func pivotArray(nums []int, pivot int) []int {
    var less []int
    var great []int 
    equal := 0
    for _, num := range nums {
        if num < pivot {
            less = append(less, num)
        } else if num == pivot{
            equal++
        } else {
            great = append(great, num)
        }
    }
    for range equal {
        less = append(less, pivot)
    }
    for _, num := range great {
        less = append(less, num)
    }
    return less
}