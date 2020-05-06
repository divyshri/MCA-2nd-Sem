#include<bits/stdc++.h>
using namespace std;
struct Node{
	int data;
	Node* left;
	Node* right;
};
int max_sum(Node *root,int sum)
{
	if(root==NULL)
		return sum;
	int n = max_sum(root->left,sum+root->data);
	int m = max_sum(root->right,sum+root->data);
	return max(n,m);
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
	root->right->left = new Node();
	root->right->left->right = new Node();
	root->right->left->data = 100;
	root->right->left->right->data = 10;
	int max = max_sum(root,0);
	cout<<endl<<"Maximum sum of leaf node of given tree is : "<<max<<endl;

}
