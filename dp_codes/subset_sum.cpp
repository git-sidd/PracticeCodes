#include<bits/stdc++.h>
using namespace std;

bool subsetSizeKSum(vector<int>arr,int k,int target){
    int n=arr.size();
    vector<vector<vector<bool>>>dp(n+1,vector<vector<bool>>(k+1,vector<bool>(target+1)));

    dp[0][0][0]=true;

    for(int i=1;i<=n;i++){
        for(int j=0;j<=k;j++){
            for(int s=0;s<=target;s++){

                //exclude
                dp[i][j][s]=dp[i-1][j][s];

                //include
                if(j>0 && s>=arr[i-1]){
                    dp[i][j][s]=dp[i][j][s]||dp[i-1][j-1][s-arr[i-1]];
                }
            }
        }
    }
    return dp[n][k][target];
}
int main() {
    vector<int> arr = {2, 4, 6, 8};
    int k = 3, target = 18;
    cout << (subsetSizeKSum(arr, k, target) ? "YES" : "NO") << endl; 
    // Output: YES (because 4 + 6 = 10)
}