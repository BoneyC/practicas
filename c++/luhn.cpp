#include <iostream>
#include <string>

int main(){
    bool orden;
    std::string codigo = "4258812475889092";
    int numDigitos = codigo.length();   
        if(! (numDigitos & 1)){
        orden=false;
    }else{
        orden = true;
    } 
   int i;
   int auxiliar;
   int suma = 0;
   std::string digito;
   for( i = 0 ; i < numDigitos ; i++){//desde aca
    digito = codigo[i];
    auxiliar = stoi(digito);
    if(( i & 1 ) == orden ){/*el "&1" es para saber si es par o impar la posicion y orden para saber*/
        auxiliar=auxiliar*2;//para seguir la estructura de tre true=true y false false=true 
        if(auxiliar>9){//"&1" donde estoy y orden en que posicion hacer
            auxiliar=(auxiliar-9);
        }
    }
    suma=suma+auxiliar;
   }/* hasta aca estan los calculos que validan luhn lo otro solo es validar dio divisble 
   entre 10 el resto solo es escabilidad a diferentes legth*/
    //return suma % 10 == 0 ? false : true;
   if(suma % 10 == 0){
    return false;
   }else{
    return true;
   }
   
}