#include<bits/stdc++.h>
using namespace std;
struct Node{
	int data;
	Node* left;
	Node* right;
};
bool isComplete(Node *root)
{
	if(root==NULL)
		return true;
	if(root->left!=NULL && root->right!=NULL)
	{
		if( isComplete(root->left) && isComplete(root->right) )
				return true;		
		else if((root->left!=NULL && root->right == NULL) &&  isComplete(root->left))
				return true;
	}	
	if(root->left==NULL && root->right==NULL)
			return true;
	return false;
}
int main()
{
	Node *root = new Node();
	root->data = 30;
	root->left = new Node();
	root->right = new Node();
	root->left->data = 50;
	root->right->data = 60;
	root->left->left = new Node();
	root->left->right = new Node();
	root->left->left->data = 80;
	root->left->right->data = 60;
	if(isComplete(root))
		cout<<endl<<"Given tree is a Complete Binary Tree"<<endl;
	else
		cout<<endl<<"Given tree is not a Complete Binary Tree"<<endl;
}
