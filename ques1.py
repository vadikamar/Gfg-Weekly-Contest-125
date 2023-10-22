from typing import List
class Solution:
    def generateAdjacencyList(self, V : int , E : int , edges : List[List[int]]) -> List[List[int]]:
        # code here
        h={v:[] for v in range(V)}
        for edge in edges:
            u,v=edge
            if u in h:
                if v not in h[u]:
                    h[u].append(v)
            if v in h:
                if u not in h[v]:
                    h[v].append(u)
        for i in h:
            h[i]=sorted(h[i])
        return h
