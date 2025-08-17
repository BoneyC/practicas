let s="()((())"
let txt=s.split("");
let i=0;
let salida="";
let j=0;
let firstMatch=false;
while(txt.length>0){
    j=j+1;
    if(txt[i] === "("){
        for(j = 0; j < txt.length; j++){
        if(txt[j] === ")" && !(firstMatch)){
            salida += txt[i]+""+txt[j]
                txt.splice(i , 1);
                txt.splice(j-1 , 1);
                j=0;
                break;
        }else if(txt[j]!==")" && j===txt.length-1){
            break;
        }
        }
    }else{
        txt.splice(i,1);
        j=0;
    }
}
console.log(salida)