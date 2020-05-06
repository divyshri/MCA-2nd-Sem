#include<bits/stdc++.h>
using namespace std;
#define MAX 100
int partition(int ar[],int low,int high)
{
	int pivot = ar[low];
	int i=low, j=high;
	while(i<j)
	{
		do
		{
			i++;
		}while(ar[i]<=pivot);
		do
		{
			j--;
		}while(ar[j]>pivot);
		if(i<j)
			swap(ar[i],ar[j]);
	}
	swap(ar[low],ar[high]);
	return j;
}
void quick_sort(int ar[],int low,int up)
{
	if(low<up)
	{
		int pi = partition(ar,low,up);
		quick_sort(ar,low,pi-1);
		quick_sort(ar,pi+1,up);	
	}
}
int main()
{
	int size;
	cout<<"Enter no. of elements in the array"<<endl;
	cin>>size;
	int ar[MAX];
	cout<<"Enter elements of the array"<<endl;
	for(int i=0;i<size;i++)
		cin>>ar[i];
	quick_sort(ar,0,size-1);
	cout<<endl<<endl<<"Sorted elements of the array are - "<<endl;
	for(int i=0;i<size;i++)
		cout<<ar[i]<<"  ";
}
