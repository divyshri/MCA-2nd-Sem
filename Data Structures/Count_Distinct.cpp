#include<bits/stdc++.h>
using namespace std;
int main()
{
	int size;
	cin>>size;
	vector<int> ar;
	for(int i=0;i<size;i++)
	{
		int temp;
		cin>>temp;
		ar.push_back(temp);
	}
	ar.erase(unique(ar.begin(),ar.end()),ar.end());
	cout<<endl<<ar.size()<<endl;
	
}
