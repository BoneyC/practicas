#include <iostream>

int main(){
    int Tamanio=5;
    int Num1=1,Num2=0,aux;
    std::string txt="";
    for(int i=0;i<Tamanio;i++){
        txt=txt+std::to_string(Num1)+"\n";
        aux=Num1;
        Num1=Num1+Num2;
        Num2=aux;
    }
    std::cout<<txt;
}