Remark - MySoluction: 
At first i was thinking about the create a ArrayList first to contain all the numbers from 1 to input n
After create it and check the condition of divisible

I created an empty ArrayList here:

```
ArrayList<String> result = new ArrayList<String>();
```

And trying to use a for loop to loop through the numbers from 1 to input n

```
for(int i = 1; i <= n; i++){
    result.add(Integer.toString(i));
}
```

After successfully output the number in string. I add if else condition to check the fizz buzz


Time Complexity: O(n), for loop
Space Complexity: O(1), The ArrayList<String> result stores n strings, one for each number from 1 to n.