Remark - MySoluction:
The first idea came up with the counting of index position
Estimated nums lenght is 4
```
i: 0    1     2     3
j: /    0    0,1. 0,1,2 
```

At first i created an array to store the result with the input array lenght

```
int[] result = new int[nums.lenght];
```

Then i initalize the result[0] with input array[0] as it wont change
Finally calcuate the result by two for loop

```
for(int i = 1; i < nums.lenght; i++){...} ->  1    2     3
for(int j = 0; j < i; j++){...}          ->   0   0,1  0,1,2
```

Time Complexity: O(n^2)
Space Complexity: O(n)


Remark - LeetCode Soluction:
```
for(int i=1;i<nums.length;i++){
    nums[i]=nums[i-1]+nums[i];
}
```

Using one for loop to sum up the current index position with the last complete adding index
Modify direct the nums so there's no space complexity

Time Complexity: O(n)
Space Complexity: O(1)