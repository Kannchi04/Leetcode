class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        set1 = set()
        n1 = len(nums1)
        n2 = len(nums2)

        for i in range(n1):
            if nums1[i] in nums2:
                if nums1[i] not in set1:
                    set1.add(nums1[i])
        
        return list(set1)
