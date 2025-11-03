#include <bits/stdc++.h>
using namespace std;

int solve(vector<vector<int>>& grid, int i, int j, vector<vector<int>>& dp) {
    int m = grid.size();
    int n = grid[0].size();

    if(i == m-1 && j == n-1) {
        return dp[i][j] = 1;  // reached destination
    }
    // if already computed
    if(dp[i][j] != -1) return dp[i][j];

    

    int best = INT_MIN;

    // right
    if(j+1 < n && grid[i][j+1] > grid[i][j]) {
        best = max(best, 1 + solve(grid, i, j+1, dp));
    }
    // down
    if(i+1 < m && grid[i+1][j] > grid[i][j]) {
        best = max(best, 1 + solve(grid, i+1, j, dp));
    }

    return dp[i][j] = (best == INT_MIN ? -1 : best);
}

int main() {
    vector<vector<int>> grid = {
        {1,2,1,4},
        {5,6,7,8},
        {9,4,5,2}
    };

    int m = grid.size();
    int n = grid[0].size();

    vector<vector<int>> dp(m, vector<int>(n, -1));

    int ans = solve(grid, 0, 0, dp);
    cout << "Length is: " << ans << endl;
}
