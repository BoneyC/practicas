let valides = false;
let luhn = false;
let i;
let contador = 0
let bandera;
let Añobin;
let Mesbin;
let Cvvbin;
let aux = 0;
let Verificacionexp;
const fechaActual = new Date();
const Añoactual = fechaActual.getFullYear();
const Mesactual = fechaActual.getMonth()+1;
let CCtxt="372754888804053 | 05 | 2030 | 1015";//xxxx xxxx xxxx xxx / MM / YYYY /  CVVV
const CC = CCtxt.replace(/[^|\d/°_+\-]/g,'');
//28 caracteres divisores en 18/17 20/19 25/24


if(CC[0] == 3){//codigo principal 
    bandera = true;
    verificarExp();
    if(Verificacionexp && luhn){
        valides = true;
    }
}else{
    bandera = false;
    verificarExp();
   if(Verificacionexp && luhn){
    valides = true;
   }//valides seria el valor retornable del modulo 
}/*aca ya se valido luhn y caducidad la cosa del cvv es innecesaria en
la validacion solo lo puse partede la estructura para guiarme
cosas como los slice se vuelven innecesarios en un entorno web donde el cuestionario
recibe esos datos ya extraidos la declaracion de variables deberia mejorarla  */

function verificarExp(){
    Verificacionexp = false;
    if(bandera){//amex
    Añobin = parseInt(CC.slice((19) , (24)));
    Mesbin = parseInt(CC.slice((16) , (19)));
    if(Añobin > Añoactual || (Añobin == Añoactual && Mesbin > Mesactual)){
       Verificacionexp = true; 
       amex(CC,contador);
    }
    }else{//general
    Añobin = parseInt(CC.slice((20),(25)))//inicial,final excluido
    Mesbin = parseInt(CC.slice((17),(20)))
    if(Añobin > Añoactual || (Añobin == Añoactual && Mesbin > Mesactual)){
       Verificacionexp=true;
        general(CC,contador);
    }
    }
    return Verificacionexp;//primero verificamos fechas que es el proceso mas ligero
}

function amex(CC,contador){ 
    for(i = (0) ; i < (15) ; i++){
        aux = parseInt(CC[i])
        if(i & 1){
            aux = aux * 2
            if(aux >= 10){//verifica caso de 2 digitos
                aux = (aux - 9)
            }
            contador = contador + aux;
        }else{
            contador = contador + aux;
        }
        }//final for
        return contador % 10 == 0 ? luhn = true : luhn = false;//luhn retorna si se cumple luhn o no 
}

function general(CC,contador){
    for(i = 0 ; i < (16) ; i++){
        aux = parseInt(CC[i])
            if(i & 0){
                aux = aux*2
                if(aux >= 10){//verifica caso de 2 digitos
                    aux = (aux - 9)
                }
                contador = contador + aux;
        }else{
            contador = contador + aux;
        }
    }//final for
    return contador % 10 == 0 ? luhn = true : luhn = false;  //luhn retorna si se cumple luhn o no 
}