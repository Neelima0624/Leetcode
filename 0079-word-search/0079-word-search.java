class Solution {

    public boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[0].length; j++) {

                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean dfs(char[][] board, String word,
                       int r, int c, int index) {

        // Boundary check
        if (r < 0 || r >= board.length ||
            c < 0 || c >= board[0].length) {
            return false;
        }

        // Character doesn't match
        if (board[r][c] != word.charAt(index)) {
            return false;
        }

        // Complete word found
        if (index == word.length() - 1) {
            return true;
        }

        // Choose
        char temp = board[r][c];

        // Mark as visited
        board[r][c] = '#';

        // Explore
        boolean found =
            dfs(board, word, r + 1, c, index + 1) ||
            dfs(board, word, r - 1, c, index + 1) ||
            dfs(board, word, r, c + 1, index + 1) ||
            dfs(board, word, r, c - 1, index + 1);

        // Backtrack / undo
        board[r][c] = temp;

        return found;
    }
}