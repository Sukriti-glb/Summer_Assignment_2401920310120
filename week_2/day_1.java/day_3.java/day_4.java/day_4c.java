class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, "", 0, 0, n);
        return res;
    }

    private void backtrack(List<String> res, String currentString, int openN, int closedN, int n) {
        // Base case
        if (openN == n && closedN == n) {
            res.add(currentString);
            return;
        }
        if (openN < n) {
            backtrack(res, currentString + "(", openN + 1, closedN, n);
        }
        if (closedN < openN) {
            backtrack(res, currentString + ")", openN, closedN + 1, n);
        }
    }
}