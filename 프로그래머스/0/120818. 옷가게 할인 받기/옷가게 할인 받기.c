#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int price) {
    float answer = price;
    if(price >=100000 && price <300000){
        answer = answer*0.95;
    }else if(price >=300000&& price <500000){
        answer = answer*0.9;
    }else if(price >=500000){
        answer = answer*0.8;
    }
    return (int)answer;
}