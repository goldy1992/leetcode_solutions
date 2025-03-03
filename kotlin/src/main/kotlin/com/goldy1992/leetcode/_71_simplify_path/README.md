# Simplify Path

- Given a string `path`, which is an **absolute path** (starting with a slash `'/'`) to a file or directory in a Unix-style file system, convert it to the simplified **canonical path**.
- In a Unix-style file system, a period `'.'` refers to the current directory, a double period `'..'` refers to the directory up a level, and any multiple consecutive slashes (i.e. `'//'`) are treated as a single slash `'/'`. 
- For this problem, any other format of periods such as `'...'` are treated as file/directory names.
- The **canonical path** should have the following format:
   - The path starts with a single slash `'/'`.
   - Any two directories are separated by a single slash `'/'`.
   - The path does not end with a trailing `'/'`.
   - The path only contains the directories on the path from the root directory to the target file or directory (i.e., no period `'.'` or double period `'..'`).
- Return the _simplified **canonical path**_.


## Example 1:
<pre>
<b>Input:</b> path = "/home/"
<b>Output:</b> "/home"
<b>Explanation:</b> Note that there is no trailing slash after the last directory name.
</pre>

## Example 2:
<pre>
<b>Input:</b> path = "/../"
<b>Output:</b> "/"
<b>Explanation:</b> Going one level up from the root directory is a no-op, as the root level is the highest level you can go.
</pre>
## Example 3:
<pre>
<b>Input:</b> path = "/home//foo/"
<b>Output:</b> "/home/foo"
<b>Explanation:</b> In the canonical path, multiple consecutive slashes are replaced by a single one.
</pre>


## Constraints:
- `1 <= path.length <= 3000`
- `path` consists of English letters, digits, period `'.'`, slash `'/'` or `'_'`.
- `path` is a valid absolute Unix path.

