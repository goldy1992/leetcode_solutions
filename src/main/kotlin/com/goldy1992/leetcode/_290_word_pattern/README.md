# Word Pattern

- Given a `pattern` and a string `s`, find if `s` follows the _same_ pattern.
- Here follow means a full match, such that there is a _bijection_ between a letter in `pattern` and a _non-empty_ word in `s`.

## Example 1:
```
Input: pattern = "abba", s = "dog cat cat dog"
Output: true
```

## Example 2:
```
Input: pattern = "abba", s = "dog cat cat fish"
Output: false
```

## Example 3:
```
Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false
```


## Constraints:

- `1 <= pattern.length <= 300`
- `pattern` contains only _lower-case_ English letters.
- `1 <= s.length <= 3000`
- `s` contains only _lowercase_ English letters and spaces `' '`.
- `s` does not contain any leading or trailing spaces.
- All the words in `s` are separated by a _single space_.

