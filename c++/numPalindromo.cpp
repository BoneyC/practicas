#include <iostream>

int main(){
    bool palindromo=true;
    std::string num="612131216";
    int i;
    for(i=0;i<(num.length()/2);i++){
        if(num[i]!=num[num.length()-i-1]){
            palindromo=false;
            break;
        }
    }
    //en este solo intente buscar la forma mas eficiente 
    //de evaluar si un numero es palindromo
    return 0;
}