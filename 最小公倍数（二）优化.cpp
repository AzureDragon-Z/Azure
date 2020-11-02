#include<stdio.h>
int min(int a,int b) {
	return a<b?a:b;
}
int main()
{
	int a,b,i;
	scanf("%d %d",&a,&b);
	int k = min(a,b);
  	for(i = k; i <= a*b; i+=k)
    	if(i % a == 0 && i % b == 0){
       		break;
    	}
 	printf("最小公倍数为:%d\n",i);
	return 0;
}
