let s="()(())"

const large=s.length;
    let salida="";
    let txt=s;
    let i=0;
    for(i=0; i<txt.length; i++){
        for(let j=i+1; j<txt.length; j++){
        if(txt[i]==="(" && txt[j]===")"){
            salida+=(txt[i]+txt[j]);
             txt=txt.slice(0,i)+txt.slice(i+1,j)+txt.slice(j+1,txt.length+1);
             i=0;
             j=0;
             
        }
        }
    }