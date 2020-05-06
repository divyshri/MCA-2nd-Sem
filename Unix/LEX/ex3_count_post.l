%{ /*this is comment */ 
#include<stdio.h>
int ps=0;
%}



%%
[+]?[0-9]+    {ps++;}
%%

main()
{
printf("enter number ");
yylex();
printf("postive number = %d ",ps);
}
