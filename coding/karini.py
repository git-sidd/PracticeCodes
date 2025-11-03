def solve(str,part):
    
    if(part not in str):
        print(str)
        return str
    if part in str:
        str=str.replace("ab","")
        solve(str,part)



str="xaabbdfaby"
part="ab"
solve(str,part)