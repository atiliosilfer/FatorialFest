#include <stdio.h>

int fat(int n){
    int resp;
    if(n==0||n==1){
        resp = 1;
    }
    else {
        resp = n*fat(n-1);
    }
    return resp;
}
int main(){
    int n = 0;
    printf("Entre com o valor para o calculo do fatorial\n");
    scanf("%d",&n);
    int resp = fat(n);
    printf("O valor do fatorial de %d = %d",n,resp);
}