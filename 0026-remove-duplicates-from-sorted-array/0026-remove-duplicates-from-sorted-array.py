class Solution(object):
    def removeDuplicates(self, nums):
        result = list(set(nums))
        result.sort()
        for i in range(len(result)):
            nums[i] = result[i]
        return len(result)

        