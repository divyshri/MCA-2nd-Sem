#include<bits/stdc++.h>
using namespace std;
class Stack{
	public:
		queue<int> q1,q2;
	public:
	void push(int x)
	{
		if(q2.empty())
			q1.push(x);
		else
			q2.push(x);
	}
	void element_q1()
	{
		if(q1.empty())
			cout<<endl<<"****Nothing to show \"FIRST\" Queue is empty"<<endl<<endl;
		else
		{
			queue<int> temp;
			temp = q1;
			for(int x=0;x<q1.size();x++)
			{
				cout<<temp.front()<<"  ";
				temp.pop();
			}
			cout<<endl;
		}
	}
	void element_q2()
	{
		if(q2.empty())
			cout<<endl<<"****Nothing to show \"SECOND\" Queue is empty"<<endl<<endl;
		else
		{
			queue<int> temp;
			temp = q2;
			for(int x=0;x<q2.size();x++)
			{
				cout<<temp.front()<<"  ";
				temp.pop();
			}
			cout<<endl;
		}
	}
	int pop()
	{
		int count,size,item;
		if (q1.empty() && q2.empty())
		{
			cout<<endl<<"****Nothing to pop both queues are empty"<<endl<<endl;
			return 0;
		}
		else if(q2.empty())
		{
			size = q1.size();
			count=0;
			while(count<size-1)
			{
				q2.push(q1.front());
				q1.pop();
				count++;
			}
			item = q1.front();
			q1.pop();
			return item;
		}
		else
		{
			size = q2.size();
			count=0;
			while(count<size-1)
			{
				q1.push(q2.front());
				q2.pop();
				count++;
			}
			item = q2.front();
			q2.pop();
			return item;
		}
		
	}
};
int main()
{
	Stack S;
	bool flag = true;
	while(flag)
	{
		int ch,data;
		cout<<"Enter choice"<<endl;
		cout<<"1. Enter element in the queue"<<endl;
		cout<<"2. Elements in the first queue"<<endl;
		cout<<"3. Elements in the second queue"<<endl;
		cout<<"4. Pop the element from the stack"<<endl;
		cout<<"5. Exit Program"<<endl;
		cin>>ch;
		switch(ch)
		{
			case 1:
				{
					cout<<"Enter element to push in the stack"<<endl;
					cin>>data;
					S.push(data);
					break;
				}
			case 2:
				{
					S.element_q1();
					break;
					
				}
			case 3:
				{

					S.element_q2();
					break;
					
				}
			case 4:
				{
					int ele = S.pop();
					if(ele)
						cout<<"popped Element is "<<ele<<endl<<endl;
					break;
				}
			case 5:
				{
					flag = false;
					break;
				}
			default:
				{
					cout<<"Invalid Input Please try again"<<endl<<endl;
				}
		}
	}	
}
