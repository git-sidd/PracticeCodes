#include<bits/stdc++.h>
using namespace std;

int main(){
    string str;
    cin>>str;
    int n=str.length();
    int i=0;
    while(i<n && str[i]=='a'){
        i++;
    }
    if(i==0){
        cout<<"False";
        return -1;
    }
    while(i<n && str[i]=='b'){
        i++;
    }    
    if(i==n && str[n-1]=='b'){
        cout<<"True";
        
    }else{
        cout<<"False";
    }
    return 0;
}