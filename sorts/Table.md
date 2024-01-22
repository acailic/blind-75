// generate table of all sorts and time complexities
// first header

| Sort | Best | Average | Worst | Memory | Stable | Method | Notes |
| ---- | ---- | ------- | ----- | ------ | ------ | ------ | ----- |
| [Bubble sort](BubbleSort.md) | Θ(n) | Θ(n^2) | Θ(n^2) | Θ(1) | Yes | Exchanging | |
| [Insertion sort](InsertionSort.md) | Θ(n) | Θ(n^2) | Θ(n^2) | Θ(1) | Yes | Insertion | |
| [Selection sort](SelectionSort.md) | Θ(n^2) | Θ(n^2) | Θ(n^2) | Θ(1) | No | Selection | |
| [Merge sort](MergeSort.md) | Θ(n log(n)) | Θ(n log(n)) | Θ(n log(n)) | Θ(n) | Yes | Merging | |
| [Quicksort](QuickSort.md) | Θ(n log(n)) | Θ(n log(n)) | Θ(n^2) | Θ(log(n)) | No | Partitioning | |
| [Heapsort](HeapSort.md) | Θ(n log(n)) | Θ(n log(n)) | Θ(n log(n)) | Θ(1) | No | Selection | |
| [Counting sort](CountingSort.md) | Θ(n + k) | Θ(n + k) | Θ(n + k) | Θ(k) | Yes | Non-comparison | k = max-min+1 |


Fastest: Quicksort, Mergesort, Heapsort
Slowest: Bubble sort, Insertion sort, Selection sort
Memory efficient: Mergesort, Heapsort, Quicksort