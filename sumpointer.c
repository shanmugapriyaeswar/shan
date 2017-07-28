#include<stdio.h>
int main()
{
int *ptr1,*ptr2,num;
printf("Enter the two number");
scanf("%d%d",ptr1,ptr2);
num=*ptr1+*ptr2;
printf("%d",num);
return 0;
}