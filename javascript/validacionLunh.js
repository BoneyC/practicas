let tarjeta="5443242137969657|10|2026|000"
let luhn = false;
let i;
let contador = 0
let bandera;
let anioBin;
let mesBin;
let aux = 0;
let Verificacionexp;
const fechaActual = new Date();
const añoActual = fechaActual.getFullYear();
const mesActual = fechaActual.getMonth()+1;
//xxxx xxxx xxxx xxx / MM / YYYY /  CVVV
// esto lo hice como sustito a recibirlos desde el frontend 
//28 caracteres divisores en 18/17 20/19 25/24
const posiciones = [...tarjeta.matchAll(/\|/g)].map(m => m.index);
let CC = tarjeta.slice(0, posiciones[0]);
//codigo principal 
    verificarExp();
    if(Verificacionexp && luhn){
        console.log(tarjeta);
    }
    
//valides seria el valor retornable del modulo 
/*aca ya se valido luhn y caducidad la cosa del cvv es innecesaria en
la validacion solo lo puse partede la estructura para guiarme
cosas como los slice se vuelven innecesarios en un entorno web donde el cuestionario
recibe esos datos ya extraidos la declaracion de variables deberia mejorarla  */

function verificarExp(){
    Verificacionexp = false;
    mesBin = parseInt(tarjeta.slice(posiciones[0]+1, posiciones[1]));
    anioBin = parseInt(tarjeta.slice(posiciones[1]+1, posiciones[2]));
    if(anioBin > añoActual || (anioBin == añoActual && mesBin > mesActual)){
       Verificacionexp = true; 
       Luhn(CC,contador);
    }
    return Verificacionexp;//primero verificamos fechas que es el proceso mas ligero

}



function Luhn(CC,contador){
    for(i = 0; i < CC.length; i++){
        aux = parseInt(CC[i])
            if(i % 2 == (CC.length % 2)){
                aux *= 2
                if(aux > 9){//verifica caso de 2 digitos
                    aux = (aux - 9)
                }
                contador = contador + aux;
        }else{
            contador = contador + aux;
        }
        console.log(CC[i]+" "+contador+" "+aux) 
    }//final for
    return contador % 10 == 0 ? luhn = true : luhn = false;  //luhn retorna si se cumple luhn o no 
}