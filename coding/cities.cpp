#include<bits/stdc++.h>
using namespace std;

int main(){
    int n=10;
    int k=4;
    vector<int>arr(10,0);
    while (k--)
    {
        int l,r,x;
        cin>>l>>r>>x;
        for(int i=l-1;i<r;i++){
            arr[i]+=x;
        }
    }
    int max=INT_MIN;
    for(int i=0;i<arr.size();i++){
        if(arr[i]>max){
           max=arr[i]; 
        }
    }
    cout<<max;
    return 0;
    
}