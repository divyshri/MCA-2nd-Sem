#include<bits/stdc++.h>
using namespace std;
int main()
{
	int front=-1,rear=-1,size;
	cout<<"Enter the no. of elements in the Queue"<<endl;
	cin>>size;
	int ar[size];
	while(1)
	{
		int choice;
		cout<<endl<<endl<<"---------------------"<<endl;
		cout<<"1. Insert element in the Queue"<<endl;
		cout<<"2. Delete element from the Queue"<<endl;
		cout<<"3. Display all elements in the Queue"<<endl;
		cout<<"4. Exit Program"<<endl<<endl;
		cin>>choice;
		switch(choice)
		{
			case 1:
				{
					if(front ==size-1 && rear ==size-1)
						cout<<endl<<"Element cannot be inserted 'Queue is full'"<<endl<<endl;
					else
					{
						int temp;
						cout<<"Enter element to be inserted"<<endl;					
						if(front ==-1 && rear == -1)
						{
							front++;
							rear++;
							cin>>ar[rear];
						}
						else
						{
							cin>>ar[++rear];
						}
					}
					break;		
				}
			case 2:
				{
					if(front ==-1 && rear ==-1)
						cout<<endl<<"No element to delete 'Queue is empty'"<<endl<<endl;
					else
					{
						cout<<"Deleted element is"<<ar[front++]<<endl<<endl;					
						if(rear == -1 || (front==rear+1))
						{
							front=-1;
							rear=-1;
						}
					}
					break;		
				}
			case 3:
				{
					if(front==-1 && rear==-1)
						cout<<endl<<endl<<"No elements to Display 'Queue is empty'"<<endl<<endl;
					else
					{
						int temp1=front, temp2=rear;
						cout<<endl<<endl<<"Elements in the Queue are "<<endl<<endl;
						while(temp1<=temp2)
						{
							cout<<ar[temp1++]<<"  ";
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
