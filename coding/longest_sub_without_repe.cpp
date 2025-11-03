#include <bits/stdc++.h>
using namespace std;

//str=abcafghib
int main(){
    string str="abcafghib";
    int n=str.length();

    map<char,int>mpp;
    int maxlen=0;
    int start=0;
    for(int end=0;end<n;end++){
        if(mpp.find(str[end])!=mpp.end()){
            start=max(start,mpp[str[end]]+1);

        }
        mpp[str[end]]=end;
        maxlen=max(maxlen,end-start+1);

    }
    cout<<maxlen<<endl;
    return 0;
}