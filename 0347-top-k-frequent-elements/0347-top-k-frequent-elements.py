class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        d={}
        for i in nums:
            if i in d:
                d[i]+=1
            else:
                d[i]=1
        ans=[]
        for _ in range(k):
            max1=0
            key=None
            for i in d:
                if d[i]>max1:
                    max1=d[i]
                    key=i
            ans.append(key)
            del d[key]
        return ans