# Reverse Words in a String

- Given an input string `s`, _reverse the order_ of the words.
- A _word_ is defined as a _sequence of non-space characters_. The words in _s_ will be separated by at least one space.
- Return a string of the words in reverse order concatenated by a single space.

- **Note** that `s` may contain _leading_ or _trailing_ spaces or _multiple_ spaces between two words. The returned string should _only have a single space_ separating the words. Do **not** include any _extra spaces_.

## Example 1:
```
Input: s = "the sky is blue"
Output: "blue is sky the"
```

## Example 2:
```
Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
```

## Example 3:
```
Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
```

## Constraints:

    1 <= s.length <= 104
    s contains English letters (upper-case and lower-case), digits, and spaces ' '.
    There is at least one word in s.



## Follow-up
If the string data type is _mutable_ in your language, can you solve it in-place with O(1) extra space?
