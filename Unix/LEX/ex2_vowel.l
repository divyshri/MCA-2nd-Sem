%{
   #include<stdio.h>
   int vc=0; 
%}

%%

[aeiouAEIOU]       {vc++;}

%%

main()
{
printf("enter string for count vowels and consonent");
yylex();
printf("the no. of vowels: %d \n",vc);
return 0;
}
