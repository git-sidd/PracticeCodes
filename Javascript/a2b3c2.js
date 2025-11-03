function solve(){
    let s="aababbccc";
    let count=1;
    let res="";
    
    console.log(news)
    for(let i=1;i<s.length;i++){
        if(s[i]===s[i-1]){
            count++;
        }
        else{
            res+=s[i-1]+(count);
            count=1;
        }
    }
    res+=s[s.length-1]+(count);
    console.log(res);

}
solve()