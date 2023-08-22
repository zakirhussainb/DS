#### DP on Strings
- A subsequence can either be consecutive or cannot be consecutive, but it should always maintain the order in the string.
- To print all the subsequences in a string, you can use either Power Set or the recursion method.
- E.g. "abc" -> ["", a, b, c, ab, ac, bc, abc], there will be 2 to the power 3 (length of the string) subsequences for 
a given string.
- So in the above case 2^3 = 8 subsequences.
- For all the string related comparison problems, you will always see match or not match.