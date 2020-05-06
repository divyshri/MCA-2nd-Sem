#include<bits/stdc++.h>
using namespace std;

void insertion_sort(int ar[],int n)
{
	bool flag = false;
	int pos;
	for(int i=0;i<n;i++)
	{
		int k = i-1;
		int key = ar[i];
		
		while(k>=0 && key<ar[k])
		{
			ar[k+1] = ar[k]; 
			k--;
		}
		ar[k+1] = key;
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
	insertion_sort(ar,size);
	cout<<endl<<endl<<"Sorted elements of the array are - "<<endl;
	for(int i=0;i<size;i++)
		cout<<ar[i]<<"  ";
}
