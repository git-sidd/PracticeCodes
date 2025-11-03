#include<bits/stdc++.h>
using namespace std;

int main(){
    int n=6;
    int sum=0;
    for(int i=1;i<=6;i++){
        if(n%i==0){
            sum+=i;
        }
    }
    cout<<sum;
    return 0;

}