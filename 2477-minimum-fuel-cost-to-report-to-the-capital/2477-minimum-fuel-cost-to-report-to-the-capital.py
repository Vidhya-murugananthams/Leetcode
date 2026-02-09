class Solution:
    def minimumFuelCost(self, roads: List[List[int]], seats: int) -> int:
        n = len(roads) + 1
        
        graph = [[] for _ in range(n)]
        for u, v in roads:
            graph[u].append(v)
            graph[v].append(u)
        
        fuel, _ = self.dfs(0, -1, graph, seats)
        return fuel
    
    def dfs(self, node: int, parent: int, graph: List[List[int]], seats: int) -> (int, int):
        people = 1
        fuel = 0
        for nei in graph[node]:
            if nei == parent:
                continue
            child_fuel, child_people = self.dfs(nei, node, graph, seats)
            fuel += child_fuel
            people += child_people
        if node != 0:
            fuel += (people + seats - 1) // seats
        return fuel, people