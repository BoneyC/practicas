#include <iostream>
#include <string>

int valOrden(int numDigitos);
int valuhn(bool orden, std::string codigo, int numDigitos);

int main(){
    std::string codigo = "4258812475889092";
    const int numDigitos = codigo.length();   
    const bool orden = valOrden(numDigitos);// los codigos de length impares usan posiciones impares y los pares posiciones pares 
    const bool result = valuhn(orden, codigo, numDigitos);// hago que redirija a la funcion 
    if(result){
          std::cout<<"el codigo "<<codigo<<" es valido";
    }else{
         std::cout<<"el codigo "<<codigo<<" es invalido";
    }
}

int valOrden(int numDigitos){
    return !(numDigitos & 1)? false : true;
}

int valuhn(bool orden , std::string codigo , int numDigitos){
   int i;
   int auxiliar;
   int suma = 0;
   bool result;
   std::string digito;
   for( i = 0 ; i < numDigitos ; i++){//desde aca
    digito = codigo[i];
    auxiliar = stoi(digito);
    if(( i & 1 ) == orden){/*el "&1" es para saber si es par o impar la posicion y orden para saber*/
        auxiliar = auxiliar*2;//para seguir la estructura de tre true=true y false false=true 
        if(auxiliar > 9){//"&1" donde estoy y orden en que posicion hacer
            auxiliar = (auxiliar - 9);
        }
    }
    suma += auxiliar;
   }/* hasta aca estan los calculos que validan luhn lo otro solo es validar dio divisble 
   entre 10 el resto solo es escabilidad a diferentes legth*/
   return suma % 10 == 0? result = true : result = false;  
}