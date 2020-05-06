#include<bits/stdc++.h>
using namespace std;
class PostFix
{	
	protected:
		int top,stack[100],post_indx,size;
		char postfix[100],infix[100];
	public:
		PostFix()
		{
			top = -1;
			post_indx=0;
			cout<<"Enter the size of infix expression "<<endl;
			cin>>size;
		}
		void get_infix()
		{
			cout<<"Enter the infix expression "<<endl;
			for(int i=0;i<size;i++)
				cin>>infix[i];
		}
		void Infix_to_Postfix()
		{
			char symbol,next;
			for(int i=0;i<size;i++)
			{
				symbol = infix[i];
				if(white_space(symbol))
				{
					switch(symbol)
					{
						case '(':
							push(symbol);
							break;
						case ')':
							while((next = pop())!='(')
								postfix[post_indx++] = next;
								break;
						case '+':
						case '-':
						case '*':
						case '/':
						case '%':
						case '^':
							while(!is_Empty() && priority(stack[top]>=priority(symbol)))
								postfix[post_indx++] = pop();
							push(symbol);
							break;
						default:
							postfix[post_indx++] = symbol;					
					}
				}
			}
			while(!is_Empty())
			{
				postfix[post_indx++] = pop();
			}		
		}
		int white_space(char t)
		{
			if(t == ' ')
				return 0;
			else
				return 1;
		}
		void push(char t)
		{
			stack[++top] = t;
		}
		int pop()
		{
			return stack[top--];
		}
		int is_Empty()
		{
			if(top==-1)
				return 1;
			else
				return 0;
		}
		int priority(char t)
		{
			switch(t)
			{
				case '(':
					return 0;
				case '+':
				case '-':
					return 1;
				case '*':
				case '/':
				case '%':
					return 2;
				case '^':
					return 3;
				default:
					return 0;
			}
		}
		void display_postfix()
		{
			cout<<endl<<endl<<"The converted postfix expression is"<<endl<<endl;
			for(int i=0;i<post_indx;i++)
				cout<<postfix[i]<<" ";
			cout<<endl;
		}
};
int main()
{
	PostFix P;
	P.get_infix();
	P.Infix_to_Postfix();
	P.display_postfix();
}
