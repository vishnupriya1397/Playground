#include<stdio.h>
int main()
{
  int n,i,ele1,ele2,ele1_index=-1,ele2_index=-1;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d%d",&ele1,&ele2);
  for(i=0;i<n;i++)
  {
    if(ele1==a[i] && ele1_index==-1)
    {
      ele1_index=i;
    }
    if(ele2==a[i] && ele2_index==-1)
    {
      ele2_index=i;
    }
  }
  printf("Element 1 index = %d\nElement 2 index = %d",ele1_index,ele2_index);
}