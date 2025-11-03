// We can scramble a string s to get a string t using the following algorithm:

// If the length of the string is 1, stop.
// If the length of the string is > 1, do the following:
// Split the string into two non-empty substrings at a random index, i.e., if the string is s, divide it to x and y where s = x + y.
// Randomly decide to swap the two substrings or to keep them in the same order. i.e., after this step, s may become s = x + y or s = y + x.
// Apply step 1 recursively on each of the two substrings x and y.
// Given two strings s1 and s2 of the same length, return true if s2 is a scrambled string of s1, otherwise, return false.

 

// Example 1:

// Input: s1 = "great", s2 = "rgeat"
// Output: true
// Explanation: One possible scenario applied on s1 is:
// "great" --> "gr/eat" // divide at random index.
// "gr/eat" --> "gr/eat" // random decision is not to swap the two substrings and keep them in order.
// "gr/eat" --> "g/r / e/at" // apply the same algorithm recursively on both substrings. divide at random index each of them.
// "g/r / e/at" --> "r/g / e/at" // random decision was to swap the first substring and to keep the second substring in the same order.
// "r/g / e/at" --> "r/g / e/ a/t" // again apply the algorithm recursively, divide "at" to "a/t".
// "r/g / e/ a/t" --> "r/g / e/ a/t" // random decision is to keep both substrings in the same order.
// The algorithm stops now, and the result string is "rgeat" which is s2.
// As one possible scenario led s1 to be scrambled to s2, we return true.
// Example 2:

// Input: s1 = "abcde", s2 = "caebd"
// Output: false
// Example 3:

// Input: s1 = "a", s2 = "a"
// Output: true


#include <bits/stdc++.h>
using namespace std;
unordered_map<string, bool> mpp; // make it class-level

bool isScramble(string s1, string s2)
{
    if (s1 == s2)
        return true;
    if (s1.length() != s2.length())
        return false;

    string key = s1 + "_" + s2;
    if (mpp.find(key) != mpp.end())
        return mpp[key];

    int n = s1.length();

    // Small pruning step: if sorted chars differ, can't be scramble
    string a = s1, b = s2;
    sort(a.begin(), a.end());
    sort(b.begin(), b.end());
    if (a != b)
        return mpp[key] = false;

    bool result = false;
    for (int i = 1; i < n; i++)
    {
        // Case 1: swapped
        bool swapped = isScramble(s1.substr(0, i), s2.substr(n - i, i)) &&
                       isScramble(s1.substr(i, n - i), s2.substr(0, n - i));

        // Case 2: not swapped
        bool not_swapped = isScramble(s1.substr(0, i), s2.substr(0, i)) &&
                           isScramble(s1.substr(i, n - i), s2.substr(i, n - i));

        if (swapped || not_swapped)
        {
            result = true;
            break;
        }
    }

    return mpp[key] = result;
}
