# Length of Last Word

- Given a string `s` consisting of _words_ and _spaces_, return the **length** of the _last word_ in the string.
- A **substring** is a _contiguous non-empty sequence of characters_ within a string.
- A **word** is a _maximal_ substring consisting of _non-space_ characters only.

## Example 1:
```
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
```

## Example 2:
```
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
```

## Example 3:
```
Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
```

## Constraints:
    1 <= s.length <= 104
    s consists of only English letters and spaces ' '.
    There will be at least one word in s.

