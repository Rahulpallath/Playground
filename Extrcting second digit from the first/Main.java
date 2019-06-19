#include <stdio.h>
int main() {
	int n,count=0,k;
  scanf("%d",&n);
  while(n > 9 )
  {
    k = n % 10;
    count = count + 1;
    n = n / 10;
    
  }
   printf("%d",k);
	return 0;
}