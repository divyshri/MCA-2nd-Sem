/*
	Program to Demonstrate the functioning of the Delete_List function in Linked List
*/
#include<bits/stdc++.h>
using namespace std;
/*
	Structur of the node
*/
struct node
{
	int data;
	node *next;
}*head=NULL;
/*
	Function to Delete a list
*/
void delete_list()
{
	node *temp=head,*p;
	while(temp!=NULL)
	{
		p = temp;
		temp=temp->next;
		cout<<"Deleted element is "<<p->data<<endl;
		delete p;
	}
	head=NULL;
	cout<<endl<<endl<<"All the elements are linked list are deleted succesfully"<<endl<<endl;

}

/*
	Function to insert a node at begining
*/
void insert_begining(int data)
{
	node *temp=new node;
	temp->data=data;
	temp->next=NULL;	
	if(head == NULL)
		head=temp;
	else
	{
		temp->next=head;
		head=temp;
	}
}
/*
	Function to insert a node at a particular position
*/
void insert_position(int pos,int d)
{
	node *temp=new node,*t;
	int z=1;
	temp->data=d;
	temp->next=NULL;	
	if(head == NULL)
		head=temp;
	else
	{
		node *p = head;
		while(p->next!=NULL && z<pos)
		{
			p=p->next;
			z++;
		}
		t = p->next;
		p->next=temp;
		temp->next=t;
		
	}
}
/*
	Function to insert a node at the end
*/
void insert_end(int d)
{
	node *temp=new node;
	temp->data=d;
	temp->next=NULL;	
	if(head == NULL)
		head=temp;
	else
	{
		node *p = head;
		while(p->next!=NULL)
		{
			p=p->next;
		}
		p->next=temp;
		
	}
}
/*
	Function to delete a node frmo begining
*/
void delete_begining()
{
	if(head==NULL)
		cout<<endl<<"No element to delete 'Linked List is empty'"<<endl<<endl;
	else
	{
		node *t = new node;
		t = head;
		cout<<"Deleted element is "<<t->data<<endl<<endl;					
		head = head->next;
		delete t;
	}
}
/*
	Function to Delete a node from a particular position
*/
void delete_position(int pos)
{
	int z=1;
	if(head==NULL)
		cout<<endl<<"No element to delete 'Linked List is empty'"<<endl<<endl;
	else
	{
		node *p = head,*p1,*t;
		while(p->next!=NULL && z<pos)
		{
			p1=p;
			p=p->next;
			z++;
			
		}
		t = p;
		p1->next=p->next;
		cout<<"Deleted element is "<<t->data<<endl<<endl;
		delete t;
	}
}
/*
	Function to Delete a node from end
*/
void delete_end()
{
	if(head==NULL)
		cout<<endl<<"No element to delete 'Linked List is empty'"<<endl<<endl;
	else
	{
		node *p = head,*p1,*t;
		while(p->next!=NULL)
		{
			p1=p;
			p=p->next;
			
		}
		t = p;
		p1->next=NULL;
		cout<<"Deleted element is "<<t->data<<endl<<endl;
		delete t;
	}
}
/*
	Main Method
*/
int main()
{
	while(1)
	{
		int choice;
		cout<<endl<<endl<<"-----------------------"<<endl;
		cout<<"1. Insert element in the Linked List"<<endl;
		cout<<"2. Delete element from the Linked List"<<endl;
		cout<<"3. Display all elements in the Linked List"<<endl;
		cout<<"4. ******* Delete the linked List"<<endl;
		cout<<"5. Exit Program"<<endl<<endl;
		cin>>choice;
		switch(choice)
		{
			case 1:
				{
					int data,ch;
					cout<<endl<<endl<<"-----------------------"<<endl;
					cout<<"1. Insert element at the begining of the Linked List"<<endl;
					cout<<"2. Insert element at the end of the Linked List"<<endl;
					cout<<"3. Insert element at the position of the Linked List"<<endl;
					cin>>ch;
					
					switch(ch)
					{
						case 1:
							cout<<"Enter element to be inserted"<<endl;
							cin>>data;
							insert_begining(data);
							break;
						case 2:
							cout<<"Enter element to be inserted"<<endl;
							cin>>data;
							insert_end(data);
							break;
						case 3:
							int pos;
							cout<<"Enter position of element "<<endl;
							cin>>pos;
							cout<<"Enter element to be inserted"<<endl;
							cin>>data;
							insert_position(pos,data);
							break;
						default:
							cout<<"Incorrect choice please try again"<<endl<<endl;
					}
					
					break;		
				}
			case 2:
				{
					int ch;
					cout<<endl<<endl<<"-----------------------"<<endl;
					cout<<"1. Delete element from the begining of the Linked List"<<endl;
					cout<<"2. Delete element from the end of the Linked List"<<endl;
					cout<<"3. Delete element from the particular position of the Linked List"<<endl;
					cin>>ch;
					switch(ch)
					{
						case 1:
							delete_begining();
							break;
						case 2:
							delete_end();
							break;
						case 3:
							int pos;
							cout<<"Enter position from where element is to be delete"<<endl;
							cin>>pos;
							delete_position(pos);
							break;
						default:
							cout<<"Incorrect choice please try again"<<endl<<endl;
					}
					
					break;		
					break;		
				}
			case 3:
				{
					if(head==NULL)
						cout<<endl<<endl<<"No elements to Display 'Linked List is empty'"<<endl<<endl;
					else
					{
						node *temp =head;
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
					delete_list();
					break;
				}
			case 5:
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
