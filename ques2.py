class Solution:
    #Function to find the smallSum of the given array
    def smallSum(self, a, k):
        #Write your code here
        s=0
        for i in range(len(a)-1):
            if a[i]<a[i+1]:
                s+=a[i]
            else:
                s+=a[i]%k
        if a[len(a)-1]<a[0]:
            s+=a[len(a)-1]
        else:
            s+=a[len(a)-1]%k
        return s%(pow(10,9)+7)
