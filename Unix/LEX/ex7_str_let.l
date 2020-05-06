%{
#include <stdio.h>
#include <string.h>
char* longest;
%}
longest     [a-zA-Z]{8,}

%%
{longest}   {
            if (yyleng > strlen(longest)) {
                longest = (char*)realloc(longest, yyleng + 1);
                strcpy(longest, yytext);
            }
        }
<*>.|\n     /* skip all unrecognized text */
%%

int main() {
    longest = (char*)malloc(1);
    longest[0] = '\0';
    yylex();
    printf("Longest string is '%s'\n", longest);
      free(longest);
    return 0;
}
