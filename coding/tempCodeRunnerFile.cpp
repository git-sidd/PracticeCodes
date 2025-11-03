#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin>>n;
    vector<int>ans;
    while(n--){
        cout<<"A,B";
        int a,b;
        cin>>a>>b;
        int hyp=sqrt((a*a+b*b));
        ans.push_back(ceil(hyp));
    }
    for(int i=0;i<ans.size();i++){
        cout<<ans[i]<<endl;
    }
    return 0;

    
}