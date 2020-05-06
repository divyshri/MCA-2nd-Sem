#include "fun1.h"
#include "fun2.h"
void Fun2(int *a, int i, int j)
{
	int k;
	if (i < j)
	{
		k=(i+j)/2;
		
		Fun2(a, i, k);
		Fun2(a, k+1, j);
 
		
		Fun1(a, i, j, k);
	}
}
