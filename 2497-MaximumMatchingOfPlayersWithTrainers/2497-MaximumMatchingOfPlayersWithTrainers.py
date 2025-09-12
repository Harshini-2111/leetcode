# Last updated: 12/09/2025, 19:18:30
class Solution:
    def matchPlayersAndTrainers(self, players: List[int], trainers: List[int]) -> int:
        players.sort()
        trainers.sort()
        
        match = 0
        i = j = 0
        
        while i < len(players) and j < len(trainers):
            if players[i] <= trainers[j]:
                match += 1
                i += 1
                j += 1
            else:
                j += 1
        
        return match
