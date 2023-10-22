class Solution {
    public static int stableArray(int n, int[] a) {
        // code here
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
            if(h.containsKey(a[i]))
            h.put(a[i],1+h.get(a[i]));
            else
            h.put(a[i],1);
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i:h.keySet())
        {
            max=Math.max(max,h.get(i));
            min=Math.min(min,h.get(i));
        }
        int ans=Integer.MAX_VALUE;
        for(int i=min;i<=max;i++)
        {
            int s=0;
            for(int j:h.keySet())
            {
                if(h.get(j)<i)
                s+=h.get(j);
                else
                s+=h.get(j)-i;
            }
            ans=Math.min(ans,s);
        }
        return ans;
    }
}
