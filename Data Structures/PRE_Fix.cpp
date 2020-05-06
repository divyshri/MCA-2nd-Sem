#include<bits/stdc++.h>
using namespace std;
class PreFix
{	
	protected:
		int top,stack[100],post_indx,size;
		char prefix[100],infix[100];
	public:
		PreFix()
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
			reverse(infix,infix+size);
		}
		void Infix_to_prefix()
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
								prefix[post_indx++] = next;
								break;
						case '+':
						case '-':
						case '*':
						case '/':
						case '%':
						case '^':
							while(!is_Empty() && priority(stack[top]>=priority(symbol)))
								prefix[post_indx++] = pop();
							push(symbol);
							break;
						default:
							prefix[post_indx++] = symbol;					
					}
				}
			}
			while(!is_Empty())
			{
				prefix[post_indx++] = pop();
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
		void display_prefix()
		{
			reverse(prefix,prefix+post_indx);
			cout<<endl<<endl<<"The converted PREFIX expression is"<<endl<<endl;
			for(int i=0;i<post_indx;i++)
				cout<<prefix[i]<<" ";
			cout<<endl;
		}
};
int main()
{
	PreFix P;
	P.get_infix();
	P.Infix_to_prefix();
	P.display_prefix();
}
