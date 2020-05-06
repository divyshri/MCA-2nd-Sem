#include<bits/stdc++.h>
using namespace std;
struct node{
	int data;
	node* left;
	node* right;
}*root1=NULL,*root2=NULL;
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
void display(node *root)
{
	if(root==NULL)
		return;
	display(root->left);
	cout<<root->data<<"  ";
	display(root->right);
}
bool identical(node* x, node* y)
{
	if(x == NULL && y == NULL)
		return true;
	if( x!= NULL && y != NULL)
	{
		if(x->data == y->data)
		{
			if (identical(x->left,y->left) && identical(x->right,y->right))
				return true;
		}
		else
			return false;
	}
	return false;
}
int main()
{
	root1 = insert(root1, 12);
	root1 = insert(root1, 7);
	root1 = insert(root1, 17);
	root1 = insert(root1, 5);
	root1 = insert(root1, 9);
	root1 = insert(root1, 15);
	root1 = insert(root1, 19);
	cout<<endl<<endl<<"Elements of the first tree"<<endl;
	display(root1);
	
	root2 = insert(root2, 12);
	root2 = insert(root2, 7);
	root2 = insert(root2, 17);
	root2 = insert(root2, 5);
	root2 = insert(root2, 9);
	root2 = insert(root2, 15);
	root2 = insert(root2, 19);

	cout<<endl<<endl<<"Elements of the Second tree"<<endl;
	display(root2);

	if(identical(root1,root2))
		cout<<endl<<"Given trees are identical"<<endl;
	else
		cout<<endl<<"Given trees are not identical"<<endl;
	
}
