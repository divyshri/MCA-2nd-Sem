#include<bits/stdc++.h>
using namespace std;
void heapify(int ar[],int n,int i)
{
	int largest = i;
	int l = 2*i+1;
	int r = 2*i+2;
	if(l<n && ar[l] > ar[largest])
		largest = l;
	if(r<n && ar[r] > ar[largest])
		largest = r;
	if(largest!= i)
	{
		swap(ar[i],ar[largest]);
		heapify(ar,n,largest);
	}
}
void heap_sort(int ar[],int n)
{
	for(int i=n/2-1;i>=0;i--)
		heapify(ar,n,i);
	for(int i=n-1;i>=0;i--)
	{
		swap(ar[0],ar[i]);
		heapify(ar,i,0);
	}
}
int main()
{
	int size;
	cout<<"Enter no. of elements in the heap"<<endl;
	cin>>size;
	int ar[500];
	cout<<"Enter elements of the heap"<<endl;
	for(int i=0;i<size;i++)
		cin>>ar[i];
	heap_sort(ar,size);
	for(int i=0;i<size;i++)
		cout<<ar[i]<<"  ";
	
	

}
