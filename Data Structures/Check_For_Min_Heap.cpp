#include<bits/stdc++.h>
using namespace std;
bool isHeap(int ar[],int i, int n)
{
	if(i>(n/2)-1)
		return true;
	if(ar[i]<=ar[2*i+1] && ar[i] <= ar[2*i+2] )
		if( isHeap(ar,2*i+1,n) && isHeap(ar,2*i+2,n))
			return true;
	return false;
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
	if(isHeap(ar,0,size))
		cout<<endl<<endl<<"The entered array is a MIN HEAP"<<endl;
	else
		cout<<endl<<endl<<"The entered array is not a MIN HEAP"<<endl;
}
