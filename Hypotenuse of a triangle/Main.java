#include<stdio.h>
#include<math.h>
 int main()
{
    double p, b;
    double hypotenuse;
    scanf("%lf",&p);
   scanf("%lf",&b);
    hypotenuse = hypot(p, b);
    printf("%.2lf", hypotenuse);
    return 0;
}
  