
#include "fun2.h"
void Fun1(int *p, int a, int b, int c)
{
	
	int i, j, k, temp[b-a+1];
	i = a;
	k = 0;
	j = c + 1;
 
	
	while (i <= c && j <= b)
	{
		if (p[i] < p[j])
		{
			temp[k] = p[i];
			k++;
			i++;
		}
		else
		{
			temp[k] = p[j];
			k++;
			j++;
		}
	}
 
	
	while (i <= c)
	{
		temp[k] = p[i];
		k++;
		i++;
	}
 

	while (j <= b)
	{
		temp[k] = p[j];
		k++;
		j++;
	}
 
 
	
	for (i = a; i <= b; i++)
	{
		p[i] = temp[i-a];
	}
}
 
