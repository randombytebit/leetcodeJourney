Remark - MySoluction: 
The idea came up with checking the length of input array first
To calcuate each customer wealth:
I used two for loop to loop all the customer money stored in different banks

Estimated accounts[n][m], n.length = 4, m.length = 2
```
i: 0     1    2    3
j: 0,1  0,1  0,1  0,1
```

Using accounts[i][j] can loop and sum the wealth
I also created a temp value to store temp result of customer wealth

Finally I created a highest value and if any temp value higher than it just recover it

Time Complexity: O(n * m), n is the number of customers and m is the number of banks
Space Complexity: O(1), constant amount of temp and highest
