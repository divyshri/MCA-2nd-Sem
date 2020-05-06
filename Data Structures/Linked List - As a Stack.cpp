#include<bits/stdc++.h>
using namespace std;
struct node
{
	int data;
	node *next;
}*start=NULL;
void insert_begining(int data)
{
	node *temp=new node;
	temp->data=data;
	temp->next=NULL;	
	if(start == NULL)
		start=temp;
	else
	{
		temp->next=start;
		start=temp;
	}
}
void delete_begining()
{
	if(start==NULL)
		cout<<endl<<"No element to delete 'Linked List is empty'"<<endl<<endl;
	else
	{
		node *t = new node;
		t = start;
		cout<<"Deleted element is "<<t->data<<endl<<endl;					
		start = start->next;
		delete t;
	}
}

int main()
{
	while(1)
	{
		int choice;
		cout<<endl<<endl<<"-----------------------"<<endl;
		cout<<"1. Push element in the Linked List"<<endl;
		cout<<"2. Pop element from the Linked List"<<endl;
		cout<<"3. Display all elements in the Linked List"<<endl;
		cout<<"4. Exit Program"<<endl<<endl;
		cin>>choice;
		switch(choice)
		{
			case 1:
				{
					int data;
					cout<<"Enter element to be inserted"<<endl;
					cin>>data;
					insert_begining(data);
					break;		
				}
			case 2:
				{
					delete_begining();
					break;	
				}
			case 3:
				{
					if(start==NULL)
						cout<<endl<<endl<<"No elements to Display 'Linked List is empty'"<<endl<<endl;
					else
					{
						node *temp =start;
						cout<<endl<<endl<<"Elements in the Linked List are "<<endl<<endl;
						while(temp!=NULL)
						{
							cout<<temp->data<<"  ";
							temp  = temp->next;
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
