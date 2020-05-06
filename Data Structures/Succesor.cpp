#include<iostream>
using namespace std;
struct node{
	int data;
	node*right=NULL;
	node*left=NULL;
};
node*root=NULL;
node*creatnode(int x) 
{
	node*newnode=new node;
	newnode->data=x;
	return newnode;
}
void insert(int x)
{
	if(root==NULL)
	{
	root=creatnode(x);
	return;
	}
	node*temp=root;
	node*prev=NULL;
	while(temp!=NULL)
	{
	if(x<temp->data)
	{
		prev=temp;
		temp=temp->left;
	}
	else
	{
		prev=temp;
		temp=temp->right;
    }
    }
node*newnode=creatnode(x);
	if(x>prev->data)
	{
		prev->right=newnode;
	}
	else
	{
	prev->left=newnode;
	}
}
void display_inorder(node*root)
{
	if(root->left!=NULL)
	{
	display_inorder(root->left);
	}
	cout<<root->data<<" ";
	if(root->right!=NULL)
	{
		display_inorder(root->right);
	}
}

void display_preorder(node*root)
{ 
    cout<<root->data;
	if(root->left!=NULL)
	{
	display_inorder(root->left);
	}
	if(root->right!=NULL)
	{
		display_inorder(root->right);
	}
}
void display_postorder(node*root)
{
	if(root->left!=NULL)
	{
	display_inorder(root->left);
	}
	
	if(root->right!=NULL)
	{
		display_inorder(root->right);
	}
	cout<<root->data;
}
node*search(node*root,int data)
{
	if(root==NULL)
	{
		return NULL;
	}
	else if(data>root->data)
	{
	return search(root->right,data);
	}
	else if(data<root->data)
	{
	return search(root->left,data);
	}
	else if(data==root->data)
	{
	return root;
	}
	else
	return NULL;
}
int minimum(node*root)
{
	node*temp=root;
	if(temp==NULL)
	{
	cout<<"tree  is empty"<<endl;
	}
	else
	{
		while(temp->left!=NULL)
		{
			temp=temp->left;
		}
		return temp->data;
	}
}
int maximum(node* root)
{
	node*temp=root;
	if(temp==NULL)
	{
	cout<<"treen  is empty"<<endl;
	}
	else
	{
		while(temp->right!=NULL)
		{
			temp=temp->right;
		}
		return temp->data;
	}
}
void successor(int data)
{
node*result=search(root,data);
if(result!=NULL&&result->right!=NULL)
{
	cout<<"successr is"<<minimum(result->right)<<endl;
}
else if(result->right==NULL)
{
	node* succ=NULL;
	node* temproot=root;
	while(temproot!=NULL)
	{
	
	if(result->data<temproot->data)
	{
		succ=temproot;
		temproot=temproot->left;
	}
	else if(result->data>temproot->data)
	{
		temproot=temproot->right;
	}
	else
		break;
	}
	cout<<"successor is"<<succ->data<<endl;
}
else
	cout<<"not found"<<endl;
}
void predecor(int data)
{
node* result=search(root,data);
if(result!=NULL&&result->left!=NULL)
{
	cout<<"predecor is"<<maximum(result->left)<<endl;
}
else
if(result->left==NULL)
{
	node *pre=NULL;
	node *temp=root;
	while(temp!=NULL)
	{
		if(data>temp->data)
		{
			pre=temp;
			temp=temp->right;
		}
		else
		if(data<temp->data)
		{
			temp=temp->left;
		}
		else
		break;
	}
	cout<<"predeser is :"<<pre->data;
}
else
{
	cout<<"predecor not found"<<endl;
}
}

node* minimum_node(node*root)
{
	node*temp=root;
	if(temp==NULL)
	{
	cout<<"treen  is empty"<<endl;
	}
	else
	{
		while(temp->left!=NULL)
		{
			temp=temp->left;
		}
		return temp;
	}
}
node* delte (node* root, int val)
{
	if(root->data==val)
	{
		if(root->right==NULL&&root->left==NULL)
		{	delete root;
			return NULL;
		}
		else if(root->right!=NULL&&root->left!=NULL)
		{
			node* temp=minimum_node(root->right);
				root->data=temp->data;
				root->right=delte(root->right,temp->data);
		}	
		else if(root->right!=NULL)
			{	node* temp=root->right;
				delete root;
				return temp;
			}
		else if(root->left!=NULL)
			{
				node* temp=root->left;
				delete root;
				return temp;
			}
		
	}
   else{
		if(val<root->data)
			root->left=delte(root->left,val);
		else
			root->right=delte(root->right,val);
       }
	
}
int findDistance(node *root, int x) 
{ 
    // Base case 
    if (root == NULL) 
      return -1; 
  
    // Initialize distance 
    int dist = -1; 
  
    // Check if x is present at root or in left 
    // subtree or right subtree. 
    if ((root->data == x) || 
        (dist = findDistance(root->left, x)) >= 0 || 
        (dist = findDistance(root->right, x)) >= 0) 
        return dist + 1; 
  
    return dist; 
} 
int maxDepth(node* root)  
{  
    if (root == NULL)  
        return -1;  
    else
    {  
        /* compute the depth of each subtree */
        int lDepth = maxDepth(root->left);  
        int rDepth = maxDepth(root->right);  
      
        /* use the larger one */
        if (lDepth > rDepth)  
            return(lDepth + 1);  
        else return(rDepth + 1);  
    }  
} 
void Print_range(node *root, int k1, int k2)  
{  
    
    if ( root==NULL )  
        return;  
      
    
    if ( k1 < root->data )  
        Print_range(root->left, k1, k2);  
      
   if ( k1 <= root->data && k2 >= root->data )  
        cout<<root->data<<" ";  
      
    if ( k2 > root->data )  
        Print_range(root->right, k1, k2);  
}  
int Print_range_count(node *root, int k1, int k2)  
{  
    
    if ( root==NULL )  
        return 0;  
      
    
    if ( k1 < root->data )  
        Print_range_count(root->left, k1, k2);  
      int temp=0;
   if ( k1 <= root->data && k2 >= root->data )  
   
   {
   	if(temp<root->data)
   	temp=root->data;
       
  }  
    if ( k2 > root->data )  
        Print_range_count(root->right, k1, k2);  
        return temp;
}   
int main()
{
	int ch;
	while(1)
	{
		cout<<"eter your choice"<<endl;
		cout<<"1.for insertion"<<endl;
		cout<<"2.for inorder display"<<endl;
		cout<<"3.for postorder display"<<endl;
		cout<<"4.for preorder display"<<endl;
		cout<<"5.for search child"<<endl;
		cout<<"6.for maximum"<<endl;
		cout<<"7.for minimum"<<endl;
		cout<<"8.for successor"<<endl;
		cout<<"9.for predecor"<<endl;
		cout<<"10.delete"<<endl;
		cout<<"11.distance from root  node"<<endl;
		cout<<"12. height of tree"<<endl;
		cout<<"13.node within range "<<endl;
		cout<<"14.k largest element"<<endl;
		cout<<"15.max i given range"<<endl;
		cin>>ch;
		switch(ch)
		{
			case 1:{
				int  data;
				cout<<"enter data "<<endl;
				cin>>data;
				insert(data);
				break;
			}
			case 2:
				{
					cout<<"inorder traversal of tree is"<<endl;
					display_inorder(root);
					break;
				}
		    case 3:
				{
					cout<<"postrder traversal of tree is"<<endl;
					display_postorder(root);
					break;
				}
		    case 4:
				{
					cout<<"preorder traversal of tree is"<<endl;
					display_preorder(root);
					break;
				}
		    case 5:
		    	{
		    		int data;
		    		cout<<"enter element u want to search "<<endl;
		    		cin>>data;
		    		node*temp=search(root,data);
		    		if(temp!=NULL)
		    		cout<<"elemet found"<<endl;
		    		else
		    		cout<<"elemet ot foud"<<endl;
		    		break;
		    		
				}
			
			case 6:
				{
					cout<<"maximum element is"<<maximum(root)<<endl;
					
					break;
				}
			case 7:
				{
					cout<<"minimum element is"<<minimum(root)<<endl;
					
					break;
				}
			case 8:
			    {
				int data;
				cout<<"enter elemet u want to find successor"<<endl;
				cin>>data;
				successor(data);
				break;
			    }
			case 9:
			    {
				int data;
				cout<<"enter elemet u want to find predecor"<<endl;
				cin>>data;
				predecor(data);
				break;
			    }
			case 10:{
				int data;
				cout<<"Enter data"<<endl;
				cin>>data;
				node*temp =delte(root,data);
				
				break;
			}
			case 11:
		    	{
		    		int x;
		    		cout<<"enter element u want to search "<<endl;
		    		cin>>x;
		    		int temp=findDistance(root,x);
		    		
		    		cout<<"distance is"<<temp<<endl;
		    		break;
		    		
				}	
		  case 12: 
		  {
		  	  int temp=maxDepth(root);
		  	  cout<<"height of tree is"<<temp;
		  	  
		  }
		  case 13:
		  {
		  	int k1,k2;
		  	cout<<"given value of k1 ad k2"<<endl;
		  	cin>>k1>>k2;
		  	 Print_range(root, k1, k2)  ;
		  	 break;
		 }
		 case 14:
		 {
		 	int k;
		 	cout<<"enter which largets element u find"<<endl;
		 	cin>>k;
		 	
				 }
		case 15:{
		int k1,k2;
		  	cout<<"given value of k1 ad k2"<<endl;
		  	cin>>k1>>k2;
		int a=Print_range_count(root,  k1, k2);
		cout<<"max in given range is"<<a<<endl;
			break;
		}		
		}
	}	
}



