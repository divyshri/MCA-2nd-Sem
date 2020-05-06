%{ /*this is comment */ 
#include<stdio.h>
int ps=0;
%}
DIGIT [0-9]


%%
\+?{DIGIT}+ ps++;

%%

main()
{
printf("enter number ");
yylex();
printf("postive number = %d ",ps);
}
