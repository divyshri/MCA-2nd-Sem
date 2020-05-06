#include<bits/stdc++.h>
using namespace std;
#define MAX 100
void Merge(int ar[],int temp[],int low1,int up1,int low2, int up2)
{
	int i = low1;
	int j = low2;
	int k = low1;
	while((i<=up1) && (j<=up2))
	{
		if(ar[i]<=ar[j])
			temp[k++] = ar[i++];
		else
			temp[k++] = ar[j++];
	}
	while(i<=up1)
		temp[k++] = ar[i++];
	while(j<=up2)
		temp[k++] = ar[j++];
}
void copy(int ar[],int temp[], int low, int up)
{
	for(int i=low;i<=up;i++)
		ar[i] = temp[i];
}
void MergeSort(int ar[],int low,int up)
{
	int mid;
	int temp[MAX];
	if(low<up)
	{
		mid = (low + up) / 2;
		MergeSort(ar,low,mid);
		MergeSort(ar,mid+1,up);
		Merge(ar,temp,low,mid,mid+1,up);
		copy(ar,temp,low,up);
	}
}
int main()
{
	int size;
	cout<<"Enter no of element"<<endl;
	cin>>size;
	int ar[MAX];
	cout<<"Enter elements"<<endl;
	for(int i=0;i<size;i++)
		cin>>ar[i];
	MergeSort(ar,0,size-1);
	cout<<endl<<endl<<"Sorted elements are "<<endl;
	for(int i=0;i<size;i++)
		cout<<ar[i]<<"  ";
}
