// Prblem link: https://www.naukri.com/code360/problems/find-character-case_58513 
 
#include<iostream>
using namespace std;

int main() {
	// Write your code here
	char a;
	cin>>a;
	if(a>=65 & a<=90)
	{
		cout<<1;
	}
	else if(a>=97 & a<=122)
	{cout<<0;
        } else {
                cout<<-1;
        }
}
