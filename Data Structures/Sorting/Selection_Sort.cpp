#include<bits/stdc++.h>
using namespace std;

void selection_sort(int ar[],int n)
{
	bool flag = false;
	int pos;
	for(int i=0;i<n;i++)
	{
		flag = false;
		for(int j=i+1;j<n;j++)
		{
			if(ar[i]>ar[j])
			{
				pos = j;
				flag = true;
			}
		}
		if(flag)
		{
			int temp = ar[pos];
			ar[pos] = ar[i];
			ar[i]  = temp;
		}
	}
}
int main()
{
	int size;
	cout<<"Enter no. of elements in the array"<<endl;
	cin>>size;
	int ar[500];
	cout<<"Enter elements of the array"<<endl;
	for(int i=0;i<size;i++)
		cin>>ar[i];
	selection_sort(ar,size);
	cout<<endl<<endl<<"Sorted elements of the array are - "<<endl;
	for(int i=0;i<size;i++)
		cout<<ar[i]<<"  ";
}
