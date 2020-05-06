#include<bits/stdc++.h>
using namespace std;

void bubble_sort(int ar[],int n)
{
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(ar[i]>ar[j])
			{
				int temp = ar[i];
				ar[i] = ar[j];
				ar[j] = temp;
			}
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
	bubble_sort(ar,size);
	cout<<endl<<endl<<"Sorted elements of the array are - "<<endl;
	for(int i=0;i<size;i++)
		cout<<ar[i]<<"  ";
}
