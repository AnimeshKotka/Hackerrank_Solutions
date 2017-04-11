#include<bits/stdc++.h>
using namespace std;
int  main()
{
	int n;
	cin>>n;
	int a[n];
	for(int i=0;i<n;i++)
	{
		cin>>a[i];
	}
	int t=0;int flag=0;int i,j;
	for(i=0;i<n;)
	{
		t++;
		for(j=i;j<i+a[i];j++)
		{
			if(n<(i+a[i]))
			{
				flag=1;
				break;
			}
			if(a[i]!=a[j])
			{
				flag=1;
				break;
			}
	}
		
		i=j;
		if(i>=n)
		break;
		if(flag==1)
		break;
		
	}
	if(flag==0)
	cout<<t;
	else
	cout<<"-1";
}