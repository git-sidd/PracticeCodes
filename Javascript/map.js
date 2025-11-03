// const dates=[21,23,24,28,25,29];
// const mapped=dates.map(date=>date*2);
// const even=dates.filter(date=>date%2===0)
// console.log(mapped)

import { useState } from "react";

let a=10;
let b=20;
let temp=a;
a=b;
b=temp;
// console.log(a,b)

// function fib(n){
//     if(n==0){
//         return 0;
//     }
//     if(n==1){
//         return 1;
//     }
//     let a=0;
//     let b=1;
//     for(let i=2;i<=n;i++){
//         ans=a+b;
//         a=b
//         b=ans
//     }
//     console.log(ans)
// }
// fib(6)
const App=()=>{
    const [user,setUser]=useState([]);

    useEffect(()=>{
        axios.get("http://localhost:3000/users")
        .then((res)=>{setUser(res.data)})
        .catch((error)=>console.log(error))
    },[])
    return(
        <div>

        </div>
    )
}