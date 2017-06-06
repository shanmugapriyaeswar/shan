#include<stdio.h>
int main()
{
    int yr;
    scanf("%d",&yr);
    if(yr%4==0)
    {
        if(yr%100==0)
        {
            if(yr%400==0)
                printf("Given year is leap year");
            else
                printf("Given year is not a leap year");
        }
        else
            printf("Given yer is leap year");
        }
        else

            printf("Given year is not a leap year");

    return 0;
}
