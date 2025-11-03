#include<bits/stdc++.h>
using namespace std;

int main(){
    int n2000,n500,n100,n20,amount;
    cin>>n2000>>n500>>n100>>n20>>amount;

    int u2000=0,u500=0,u100=0,u20=0;
    
    u2000=min(amount/2000,n2000);
    amount-=u2000*2000;
    
    u500=min(amount/500,n500);
    amount-=u500*500;

    u100=min(amount/100,n100);
    amount-=u100*100;

    u20=min(amount/20,n20);
    amount-=u20*20;

    if(amount==0){
        cout<<u2000<<" "<<u500<<" "<<u100<<" "<<u20;
        return 0;
    }
    cout<<"AMOUNT NOT SATISFIED";
    return -1;



}