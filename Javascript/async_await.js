// function fetchData(){
//     return new Promise(()=>{
//         setTimeout(()=>{
//             let success=false;
//             if(success){
//                 console.log("SUCCESS")
//             }
//             else{
//                 console.log( "FAILURE")
//             }
//         },1000)
//     })
// }



function fetchData(){
    return new Promise((res,rej)=>{
        setTimeout((()=>{
            let success=false;
            if(success){
                res("Resolved")
            }else{
                rej("Rejected")
            }
        }),1000)
    })
}






async function ans(){
    try{
        const response=await fetchData();
        console.log(response)
    }catch(error){
        console.log(error)
    }
}
ans()