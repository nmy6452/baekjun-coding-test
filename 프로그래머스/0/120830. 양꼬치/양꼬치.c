#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n, int k) {
    int answer = 0;
    //할인 드가자
    if(n>=10){
        int freeDrink=n/10;
        if(freeDrink > k){
            k = 0;
        }else{
            k= k-freeDrink;
        }
    }
    return (n*12000)+(k*2000);
}