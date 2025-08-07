let valides=false;
let i,contador=0,Añoactual=0,Mesactual=0,bandera,Añobin,Mesbin,Cvvbin,aux=0,Verificacionexp,CC;
let validez=false
const fechaActual=new Date();
Añoactual=fechaActual.getFullYear();
Mesactual=fechaActual.getMonth()+1;
let CCtxt="372754888804053 | 05 | 2030 | 1015"//xxxx xxxx xxxx xxx / MM / YYYY /  CVVV
CC=CCtxt.replace(/[^|\d/°_+\-]/g,'')
//28 caracteres divisores en 18/17 20/19 25/24


if(CC[0]==3){//codigo principal 
    bandera=true
    amex(CC,contador)
    if(Verificacionexp){
        valides=true
    }

}else{
    bandera=false
   general(CC,contador)
   if(Verificacionexp){
    valides=true
}
}/*aca ya se valido luhn y caducidad la cosa del cvv es innecesaria en
la validacion solo lo puse partede la estructura para guiarme
cosas como los slice se vuelven innecesarios en un entorno web donde el cuestionario
recibe esos datos ya extraidos la declaracion de variables deberia mejorarla  
*/


function verificarExp(){
    Verificacionexp=false;
if(bandera){//amex
Añobin=parseInt(CC.slice((19),(24)))
Mesbin=parseInt(CC.slice((16),(19)))
if(Añobin>Añoactual ||(Añobin==Añoactual && Mesbin>Mesactual)){
    Verificacionexp=true; 
}
}else{//general
Añobin=parseInt(CC.slice((20),(25)))//inicial,final excluido
Mesbin=parseInt(CC.slice((17),(20)))
if(Añobin>Añoactual ||(Añobin==Añoactual && Mesbin>Mesactual)){
    Verificacionexp=true;
}
}
}return Verificacionexp 

function amex(CC,contador){ 
    for(i=(0);i<(15);i++){
        aux=parseInt(CC[i])
        if(i & 1){
            aux=aux*2
            if(aux>=10){//verifica caso de 2 digitos
                aux=(aux-9)
            }
            contador=contador+aux;
        }else{
            contador=contador+aux;
        }
        }//final for
        if(contador%10!=0){}else{
            verificarExp()
        }//si cumple algoritmo luhn se va a verificar fechas 
}

function general(CC,contador){
    for(i=0;i<(16);i++){
        aux=parseInt(CC[i])
            if(i & 0){
                aux=aux*2
                if(aux>=10){//verifica caso de 2 digitos
                    aux=(aux-9)
                }
                contador=contador+aux;
        }else{
            contador=contador+aux;
        }
    }//final for
    if(contador%10!=0){}else{
        verificarExp()
    } //si cumple luhn se va a verificar fechas
}