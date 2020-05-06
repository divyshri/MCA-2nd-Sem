#include<bits/stdc++.h>
using namespace std;
int MIN=999999,MAX = -1;
/*
	Structure of the node
*/
struct node{
	int data;
	node* left;
	node* right;
}*root=NULL;
/*
	Function to insert the node
*/
node* insert(node* root,int d)
{
	node *ptr = root,*pre;
	while(ptr!=NULL)
	{
		pre = ptr;
		if(d<ptr->data)
			ptr = ptr->left;
		else if(d>ptr->data)
			ptr = ptr->right;
		else
		{
			cout<<"Duplicate node cannot be inserted"<<endl;
			return root;
		}
	}
	node *temp = new node;
	temp->data = d;
	temp->left = NULL;
	temp->right=NULL;
	if(root==NULL)
		root = temp;
	else if(d<pre->data)
		pre->left = temp;
	else if(d>pre->data)
		pre->right = temp;
	return root;		
}
/*
	Function to display node in INORDER TRAVERSAL
*/
void display_inorder(node *root)
{
	if(root==NULL)
		return;
	display_inorder(root->left);
	cout<<root->data<<"  ";
	display_inorder(root->right);
}
/*
	Function to display node in PREORDER TRAVERSAL
*/
void display_preorder(node *root)
{
	if(root==NULL)
		return;
	cout<<root->data<<"  ";
	display_preorder(root->left);
	display_preorder(root->right);
}
/*
	Function to display node in POSTORDER TRAVERSAL
*/
void display_postorder(node *root)
{
	if(root==NULL)
		return;
	display_postorder(root->left);
	display_postorder(root->right);
	cout<<root->data<<"  ";
}
/*
	Function to find MINIMUM element in the tree
*/
void minimum(node *root)
{
	if(root==NULL)
	
		return;
	minimum(root->left);
	if(root->data<MIN)
		MIN = root->data;
	minimum(root->right);
}
/*
	Function to find MAXIMUM element in the tree
*/
void maximum(node *root)
{
	if(root==NULL)
		return;
	maximum(root->left);
	if(root->data>MAX)
		MAX = root->data;
	maximum(root->right);
}
/*
	Function to search element in the tree
*/
bool search(int key)
{
	node *ptr = root;
	bool flag = false;
	while(ptr!=NULL)
	{
		if(key==ptr->data)
		{
			flag = true;
			return flag;
		}
		else if(key < ptr->data)
			ptr = ptr->left;
		else if(key > ptr->data)
			ptr = ptr->right;
	}
	return flag;
}
/*
	Main Function
*/
int main()
{
	while(1)
	{
		int choice;
		cout<<endl<<endl<<"-----------------------"<<endl;
		cout<<"1. Insert element in the Binary Search Tree"<<endl;
		cout<<"2. Display all elements in INORDER of the Binary Search Tree"<<endl;
		cout<<"3. Display all elements in PREORDER of the Binary Search Tree"<<endl;
		cout<<"4. Display all elements in POSTORDER of the Binary Search Tree"<<endl;
		cout<<"5. Find the MINIMUM element in the Binary Search Tree"<<endl;
		cout<<"6. Find the MAXIMUM element in the Binary Search Tree"<<endl;
		cout<<"7. Search for a element in the Binary Search Tree"<<endl;
		cout<<"8. Exit Program"<<endl<<endl;
		cin>>choice;
		switch(choice)
		{
			case 1:
				{
					int data;
					cout<<"Enter data that to be inserted in binary search tree"<<endl;
					cin>>data;
					root = insert(root,data);
					break;		
				}
			case 2:
				{
					if(root == NULL)
						cout<<"No data to display tree is empty"<<endl;
					else
						display_inorder(root);
					break;
				}
			case 3:
				{
					if(root == NULL)
						cout<<"No data to display tree is empty"<<endl;
					else
						display_preorder(root);
					break;
				}
			case 4:
				{
					if(root == NULL)
						cout<<"No data to display tree is empty"<<endl;
					else
						display_postorder(root);
					break;
				}
			case 5:
				{
					if(root == NULL)
						cout<<"No data to check tree is empty"<<endl;
					else
						minimum(root);
						cout<<"Minimum element in the tree is "<<MIN<<endl;
					break;
				}
			case 6:
				{
					if(root == NULL)
						cout<<"No data to check tree is empty"<<endl;
					else
						maximum(root);
						cout<<"Maximum element in the tree is : "<<MAX<<endl;					
					break;
				}
			case 7:
				{
					if(root == NULL)
						cout<<"No data to check tree is empty"<<endl;
					else
					{
						int key;
						cout<<"Enter element that to be searched in the binary search tree"<<endl;
						cin>>key;
						if(search(key))
							cout<<"Element Found"<<endl;
						else
							cout<<"Element not found"<<endl;
					}
					break;
				}
			case 8:
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
