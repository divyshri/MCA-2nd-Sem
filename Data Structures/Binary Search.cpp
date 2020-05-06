0#include<bits/stdc++.h>
using namespace std;
int main()
{
	int size,first=0,last,middle;
	bool flag = false;
	cout<<"Enter number of elements in the array"<<endl;
	cin>>size;
	int ar[size];
	cout<<"Enter elements of the array"<<endl;
	for(int i=0;i<size;i++)
		cin>>ar[i];
	int key;

	sort(ar,ar+size);
	
	cout<<"Enter element to search in the array using Binary search"<<endl;
	cin>>key;
	last = size-1;
	middle = (first + last) / 2;
	while(first<=last)
	{
		if(ar[middle]==key)
		{
			flag = true;
			break;
		}
		else if(ar[middle]<key)
			first = middle+1;
		else if(ar[middle]>key)
			last = middle-1;
		else if(first == last)
			break;
		middle = (first + last ) /2;
	}
	if(flag)
		cout<<"Element Found"<<endl;
	else
		cout<<"Element not found"<<endl;
}
