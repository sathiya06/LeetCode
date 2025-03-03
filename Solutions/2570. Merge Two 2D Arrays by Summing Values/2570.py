class Solution:
    def mergeArrays(self, nums1: List[List[int]], nums2: List[List[int]]) -> List[List[int]]:
        n1 = len(nums1)
        n2 = len(nums2)
        res_map = {}
        res = []
        i, j = 0, 0
        while i < n1 and j < n2:
            if nums1[i][0] < nums2[j][0]:
                if nums1[i][0] in res_map:
                    res_map[nums1[i][0]][1] += nums1[i][1]
                else:
                    res_map[nums1[i][0]] = nums1[i]
                    res.append(nums1[i])
                i += 1
            else:
                if nums2[j][0] in res_map:
                    res_map[nums2[j][0]][1] += nums2[j][1]
                else:
                    res_map[nums2[j][0]] = nums2[j]
                    res.append(nums2[j])   
                j += 1   
        while i < n1:
            if nums1[i][0] in res_map:
                res_map[nums1[i][0]][1] += nums1[i][1]
            else:
                res_map[nums1[i][0]] = nums1[i]
                res.append(nums1[i])
            i += 1
        while j < n2:
            if nums2[j][0] in res_map:
                res_map[nums2[j][0]][1] += nums2[j][1]
            else:
                res_map[nums2[j][0]] = nums2[j]
                res.append(nums2[j])   
            j += 1   
        return res
                    
