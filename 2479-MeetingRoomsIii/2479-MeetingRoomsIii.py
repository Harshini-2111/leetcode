# Last updated: 12/09/2025, 19:18:32
import heapq

class Solution:
    def mostBooked(self, n, meetings):
        meetings.sort()
        free_rooms = list(range(n))
        heapq.heapify(free_rooms)
        busy_rooms = []
        meeting_count = [0] * n

        for start, end in meetings:
            duration = end - start

            while busy_rooms and busy_rooms[0][0] <= start:
                end_time, room = heapq.heappop(busy_rooms)
                heapq.heappush(free_rooms, room)

            if free_rooms:
                room = heapq.heappop(free_rooms)
                heapq.heappush(busy_rooms, (end, room))
            else:
                earliest_end, room = heapq.heappop(busy_rooms)
                heapq.heappush(busy_rooms, (earliest_end + duration, room))

            meeting_count[room] += 1

        max_meetings = max(meeting_count)
        for i in range(n):
            if meeting_count[i] == max_meetings:
                return i
