#include<bits/stdc++.h>
using namespace std;
int main()
{
	int top=-1,size;
	cout<<"Enter the no. of elements in the stack"<<endl;
	cin>>size;
	int ar[size];
	while(1)
	{
		int choice;
		cout<<endl<<endl<<"---------------------"<<endl;
		cout<<"1. Push element in the stack"<<endl;
		cout<<"2. Pop element in the stack"<<endl;
		cout<<"3. Display all elements in the stack"<<endl;
		cout<<"4. Exit Program"<<endl<<endl;
		cin>>choice;
		switch(choice)
		{
			case 1:
				{
					if(top==size-1)
						cout<<endl<<"Element cannot be Pushed 'Stack is full'"<<endl<<endl;
					else
					{
						cout<<"Enter element to be inserted"<<endl;					
						cin>>ar[++top];
					}
					break;		
				}
			case 2:
				{
					if(top==-1)
						cout<<endl<<"No elements to Pop 'Stack is empty'"<<endl<<endl;
					else
					{
						cout<<endl<<"Poped element is "<<ar[top--]<<endl;
					}
					break;
				}
			case 3:
				{
					if(top==-1)
						cout<<endl<<endl<<"No elements to Display 'Stack is empty'"<<endl<<endl;
					else
					{
						int temp=top;
						cout<<endl<<endl<<"Elements in the stack are "<<endl<<endl;
						while(temp>=0)
						{
							cout<<ar[temp--]<<"  ";
						}
						cout<<endl<<endl;	
					}
					break;
				}
			case 4:
				{
					exit(0);
				}
			default:
			{
				cout<<endl<<endl<<"Incorrect option please try again "<<endl<<endl;
			}	
		}
	}
}
