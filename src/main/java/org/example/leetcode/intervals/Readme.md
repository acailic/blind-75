# Intervals
### Merge Intervals
Create new array list, sort current intervals by starting point, add first one, 
go through intervals and check start point of interval is before end of last ans end point.if yes merge
else add to res intervals.
### Non-overlapping Intervals
Sorting by end time, getting first end time, going through list and if current start is before end count one merge
if not end time is current i end time
### MeetingRooms1
Sort times, if there is matching.
### MeetingRooms2 
Get started times and end times in separate lists, sort them.
count if is between start and time, if not end++ and count--.