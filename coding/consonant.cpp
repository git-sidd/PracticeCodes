#include <bits/stdc++.h>
using namespace std;

int main(){
    string str;
    cin>>str;
    vector<char>consarr;
    for(int i=0;i<str.length();i++){
        if(str[i]!='a'&& str[i]!='e'&& str[i]!='i'&& str[i]!='o'&& str[i]!='u'&& str[i]!='A'&& str[i]!='E'&& str[i]!='I'&& str[i]!='O'&& str[i]!='U'){
            consarr.push_back(str[i]);
        }
    }
    reverse(consarr.begin(),consarr.end());
    if(consarr.size()>=3){
        cout<<consarr[2];
    }else{
        cout<<"Consonant less than 3";
    }
    return 0;
}