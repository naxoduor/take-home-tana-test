#Language Used - Java
Execute file e.g java Question1_GetLongestString.java
Java version - 21.0.8

#Question One
##getLongestString Method
Initializes a result string and keeps track of the longest length found (len).
For each item in the list:
It checks:
No consecutive repeated characters (checkNoRepetition)

All characters must be from the allowed characters chars (checkUnique)

If both checks pass and the string is longer than the current longest, update the result.

##3. checkNoRepetition Method
Ensures that there are no consecutive repeated characters in the word.

##4. checkUnique Method
Checks that all characters in word are present in the chars string.

#Question Two
It loops over the original list (products), checking the frequency of each item using the productFrequency map.

The first one that has a frequency of 1 is returned.

#Question 3
Initialize with max possible distance.
Find the first index where the minimum appears.
Loop through the rest of the list.

Each time the number is found again, calculate the distance from the last index it appeared.

Update the distance.
#Question 4
First, find the maximum frequency among all words (in our example, it's 2).
Then, collect all words that have that max frequency.
Sort the result alphabetically using default sorting.

#Question 5
Fills result list with the same size as str, all values initially "none".
For each index i, it:

Computes new index as (i + n) % size

Places the element from index i of original list into index y of the result list
