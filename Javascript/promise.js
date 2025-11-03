// function fetchData(){
//     return new Promise((res,rej)=>{
//         setTimeout(()=>{
//             let success=true;
//             if(success){
//                 res("success")
//             }
//             else{
//                 rej("Failure")
//             }
//         },2000)
//     })
// }
// fetchData()
// .then((result)=>{
//     console.log(result)
// })
// .catch((error)=>{
//     console.log(error)
// })




























function fetchData(){
    return new Promise((res,rej)=>{
        let val=false;
        if(val){
             res("Resolved")
        }else{
            rej("Reject")
        }
    })
}
fetchData()
.then((res)=>{
    console.log(res)
})
.catch(err=>console.log(err))