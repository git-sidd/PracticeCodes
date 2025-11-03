#include <bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;
    double total=0.0;
    while(t--){

        double a,x,y;
        cout<<"ENTER (a,x,y):";
        cin>>a>>x>>y;
        double sp=a*(1+ x/100.0);
        double spf=sp*(1-y/100.0);
        total+=(spf-a);
    }
    if(total<0){
        cout<<"LOSS=>"<<(int)floor(-total);
    }
    else{
        cout<<"PROFIT=>"<<(int)floor(total);
    }
    return 0;
}