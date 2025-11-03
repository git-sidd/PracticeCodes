import { useState } from "react"

const Login=()=>{
    const [formData,setFormData]=useState({name:""});
    const submitHandler=async(e)=>{
        e.preventDefault();
        try {
            const response= await axios.post("/",formData);
        console.log(response)
        } catch (error) {
            console.log(error)
        }
    }
    return(
        <div>
            <form onSubmit={submitHandler}>
            <label htmlFor="name">
                Name
            </label>
            <input
                type="text"
                name="name"
                id="name"
                value={formData.name}
                onChange={(e)=>(setFormData({...formData ,name:e.target.value}))}
                placeholder="Name"
            />
            </form>
        </div>
    )
}