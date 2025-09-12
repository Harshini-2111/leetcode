# Last updated: 12/09/2025, 19:18:42
from functools import lru_cache

class Solution:
    def earliestAndLatest(self, n: int, firstPlayer: int, secondPlayer: int):
        @lru_cache(None)
        def dfs(players: tuple, round_num: int):
            # Check all matches
            l, r = 0, len(players) - 1
            while l < r:
                if {players[l], players[r]} == {firstPlayer, secondPlayer}:
                    return (round_num, round_num)
                l += 1
                r -= 1

            def get_winners(players):
                winners = []
                l, r = 0, len(players) - 1
                match = []
                while l < r:
                    p1, p2 = players[l], players[r]
                    if p1 == firstPlayer or p2 == firstPlayer:
                        winners.append(firstPlayer)
                    elif p1 == secondPlayer or p2 == secondPlayer:
                        winners.append(secondPlayer)
                    else:
                        match.append((p1, p2))
                    l += 1
                    r -= 1
                if l == r:
                    winners.append(players[l])
                return winners, match

            winners, undecided = get_winners(players)

            res = []

            def backtrack(index, path):
                if index == len(undecided):
                    new_players = tuple(sorted(path + winners))
                    res.append(dfs(new_players, round_num + 1))
                    return
                a, b = undecided[index]
                path.append(a)
                backtrack(index + 1, path)
                path.pop()
                path.append(b)
                backtrack(index + 1, path)
                path.pop()

            backtrack(0, [])

            return (
                min(x[0] for x in res),
                max(x[1] for x in res)
            )

        return list(dfs(tuple(range(1, n + 1)), 1))
