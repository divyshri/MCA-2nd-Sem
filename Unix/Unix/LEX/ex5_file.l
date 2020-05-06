%{
#include<stdio.h>
int pn=0;
int nn=0;
int pf=0;
int nf=0;
%}
DIGIT [0-9]
/*
%%
[-][0-9]+  {nn++;}
[+]?[0-9]+  {pn++;}
[-][0-9]*\.[0-9]+  {nf++;}
[+]?[0-9]*\.[0-9]+ {pf++;}
.               ;
%%
*/


%%
\+?{DIGIT}+ 	pn++;
-{DIGIT}+	nn++;
\+?{DIGIT}*\.{DIGIT}+ pf++;
-{DIGIT}*\.{DIGIT}+ 	nf++;
.			;
%%


void main(int argc, char *argv[])
{
   if(argc!=2)
   {
 	printf("usage: ./a.out in.txt \n");
	exit(0);
 	}
  yyin=fopen(argv[1],"r");
yylex();
printf("+ve nu =%d \n",pn);
printf("-ve nu =%d \n",nn);
printf("-ve fraction nu =%d \n",nf);
printf("+ve fraction nu =%d \n",pf);
}
int yywrap()
{
   return 1;
}


/*
main()
{
//printf("enter any number");
yylex();
printf("+ve nu =%d \n",pn);
printf("-ve nu =%d \n",nn);
printf("-ve fraction nu =%d \n",nf);
printf("+ve fraction nu =%d \n",pf);
return 0;
}
*/
