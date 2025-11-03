// INF  -1   0  INF
// INF INF INF -1
// INF  -1 INF -1
//   0  -1 INF INF

// 📖 Problem Statement (in your own words)

// You are given a 2D grid (matrix) representing rooms in a building. Each cell can be:

// Gate → 0

// Wall → -1

// Empty room → INF (represented by INT_MAX, e.g. 2147483647)

// 👉 Your job is to fill each empty room with the distance to its nearest gate.

// If a room is next to a gate → value becomes 1.

// If a room is two steps away → value becomes 2, and so on.

// If a room cannot reach any gate (blocked by walls), keep it as INF.

#include<bits/stdc++.h>
using namespace std;

int solve(vector<vector<int>>&grid){
    int m=grid.size();
    int n=grid[0].size();

    queue<pair<int,int>>q;

    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(grid[i][j]==0){
                q.push({i,j});
            }
        }
    }


    int dx[4]={1,-1,0,0};
    int dy[4]={0,0,1,-1};

    while(!q.empty()){
        pair<int,int>cell=q.front();
        q.pop();

        int x=cell.first;
        int y=cell.second;

        for(int k=0;k<4;k++){
            int nx=x+dx[k];
            int ny=y+dy[k];

            if(nx>=0 && ny>=0 && nx<m && ny<n && grid[nx][ny]==INT_MAX){
                grid[nx][ny]=grid[x][y]+1;
                q.push({nx,ny});
            }
        }
    }
}
