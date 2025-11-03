#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin>>n;
    int arr1[n];
    int arr2[n-1];
    int arr3[n-2];
    int x=0;
    int y=0;
    cout<<"------------"<<endl;
    for(int i=0;i<n;i++){
        cin>>arr1[i];
        x=x ^ arr1[i];
    }
    cout<<"------------"<<endl;
    for(int i=0;i<n-1;i++){
        cin>>arr2[i];
        x=x^ arr2[i];
        y=y^ arr2[i];
    }
    cout<<"------------"<<endl;
    for(int i=0;i<n-2;i++){
        cin>>arr3[i];
        y=y^arr3[i];
    }
    cout<<"------------"<<endl;
    cout<<"x:"<<x<<endl;
    cout<<"y:"<<y<<endl;
    return 0;

}