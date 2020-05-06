#include<bits/stdc++.h>
using namespace std;

void bucket_sort(float ar[], int n)
{
	vector<float> b[n];
	for(int i=0;i<n;i++)
	{
		int bi = ar[i]*n;
		b[bi].push_back(ar[i]);
	}

	for(int i=0;i<n;i++)
		sort(b[i].begin(),b[i].end());
	
	int index = 0;
	for(int i=0;i<n;i++)
		for(int j=0;j<b[i].size();j++)
		{
			ar[index++] = b[i][j];
		}
}
int main()
{
	int size;
	cout<<"Enter no. of elements in the array"<<endl;
	cin>>size;
	float ar[500];
	cout<<"Enter elements of the array"<<endl;
	for(int i=0;i<size;i++)
		cin>>ar[i];
	bucket_sort(ar,size);
	cout<<endl<<endl<<"Sorted elements of the array are - "<<endl;
	for(int i=0;i<size;i++)
		cout<<ar[i]<<"  ";
}
