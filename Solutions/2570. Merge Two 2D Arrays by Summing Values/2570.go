func mergeArrays(nums1 [][]int, nums2 [][]int) [][]int {
    i := 0
    j := 0
    n1 := len(nums1)
    n2 := len(nums2)
    res_map := make(map[int][]int)
    var res [][]int
    for i < n1 && j < n2{
        if nums1[i][0] < nums2[j][0] {
            if _, ok := res_map[nums1[i][0]]; ok{
                res_map[nums1[i][0]][1] += nums1[i][1]
            }else{
                res_map[nums1[i][0]] = nums1[i]
                res = append(res, nums1[i])
            }
            i += 1
        }else{
            if _, ok := res_map[nums2[j][0]]; ok{
                res_map[nums2[j][0]][1] += nums2[j][1]
            } else{
                res_map[nums2[j][0]] = nums2[j]
                res = append(res, nums2[j])   
            }
            j += 1   
        }
    }
    for i < n1{
        if _, ok := res_map[nums1[i][0]]; ok{
            res_map[nums1[i][0]][1] += nums1[i][1]
        }else{
            res_map[nums1[i][0]] = nums1[i]
            res = append(res, nums1[i])
        }
        i += 1
    }
    for j < n2{
        if _, ok := res_map[nums2[j][0]]; ok{
            res_map[nums2[j][0]][1] += nums2[j][1]
        }else{
            res_map[nums2[j][0]] = nums2[j]
            res = append(res, nums2[j])  
        } 
        j += 1   
    }
    return res
}
 