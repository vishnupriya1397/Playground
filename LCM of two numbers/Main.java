#include<stdio.h>
int main()
{
 int n1,n2,i,lcm,gcd;
  scanf("%d%d",&n1,&n2);
  i=n1>n2?n2:n1;
  for(;i>=1;i--)
  {
    if(n1%i==0 && n2%i==0)
    {
     
      gcd=i;
        break;
    }
  }
  lcm=n1*n2/gcd;
  printf("%d",lcm);
  return 0;
}