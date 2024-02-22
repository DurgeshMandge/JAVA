#include <bits/stdc++.h>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t--)
	{
	    int n ;
	    cin>>n;
	    string firstS;
	    string secondS;
	    for(int i = 0 ; i < n ;i++)
	    {
	        char char1;
	        cin>>char1;
	        firstS.push_back(char1);
	    }
	    for(int i = 0 ; i < n ;i++)
	    {
	        char char1;
	        cin>>char1;
	        secondS.push_back(char1);
	    }
	    
	    for(int i = 0 ; i < n ; i++)	
	    {
	        int a = firstS[i]-'0';
	        int b = secondS[i]-'0';
	        if((b-a) % 3 == 0 && b-a > 0)
	        {
	            int answer = (b-a)/3;
	            cout<<answer<<" ";
	            continue;
	        }
	        else
	        {
	            int p = b-a;
	            if(p < 0)
	            {
	                p += 26;
	            }
	            while(p %3 != 0)
	            {
	                p+=26;
	            }
	            int answer = p/3;
	            cout<<answer<<" ";
	            continue;
	        }
	    }
	    cout<<endl;
	}

}