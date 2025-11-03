// MADAM
// ABACAMA
// LFLDLSL
#include<bits/stdc++.h>
using namespace std;

int main(){
    string str;
    cin>>str;
    int n=str.length();
    char prev=str[0];
    for(int i=0;i<n;i=i+2){
        if(str[i]!=prev){
            cout<<"False=>0";
            return -1;
        }
        prev=str[i];
    }
    cout<<"True=>1";
    return 0;
}