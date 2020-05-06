%{
   /* hi this program count +ve -ve +ve freation and -ve fraction numbers */
#include<stdio.h>
int pn=0,pf=0;

%}

%%
  /*[+]?[0-9]+			 {pn++; }*/
[0-9]+               {pn++; printf("+ve nu =%s\n",yytext);}
[0-9]*\.[0-9]+       {pf++; printf("+ve fraction =%s\n",yytext);}
  

%%

main()
{
printf("enter any number");
yylex();
printf("the number +ve integer : %d \n",pn);
printf("+ve fraction nu =%d \n",pf);

}

