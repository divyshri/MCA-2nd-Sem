#include<bits/stdc++.h>
using namespace std;
int main()
{
	int top=-1;
	string str,stack[100];
	getline(cin,str);
	for(int i=str.length()-1;i>=0;i--)
	{
		stack[++top] = str[i];
		
	}
	for(int i=0;i<=top;i++)
		cout<<stack[i];
}
