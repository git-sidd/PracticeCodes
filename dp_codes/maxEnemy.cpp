#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int maxKilledEnemies(vector<vector<char>>& grid) {
        if (grid.empty() || grid[0].empty()) return 0;

        int m = grid.size(), n = grid[0].size();
        int result = 0;
        int rowHits = 0;
        vector<int> colHits(n, 0);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                // Recompute rowHits if at start or after a wall
                if (j == 0 || grid[i][j-1] == 'W') {
                    rowHits = 0;
                    for (int k = j; k < n && grid[i][k] != 'W'; k++) {
                        if (grid[i][k] == 'E') rowHits++;
                    }
                }

                // Recompute colHits[j] if at top row or above is a wall
                if (i == 0 || grid[i-1][j] == 'W') {
                    colHits[j] = 0;
                    for (int k = i; k < m && grid[k][j] != 'W'; k++) {
                        if (grid[k][j] == 'E') colHits[j]++;
                    }
                }

                // If it's an empty cell, update result
                if (grid[i][j] == '0') {
                    result = max(result, rowHits + colHits[j]);
                }
            }
        }
        return result;
    }
};
int main() {
    Solution sol;
    vector<vector<char>> grid = {
        {'0','E','0','0'},
        {'E','0','W','E'},
        {'0','E','0','0'}
    };

    cout << sol.maxKilledEnemies(grid) << endl; // Output: 3
    return 0;
}
