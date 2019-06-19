#include <stdio.h>
int main() {
	int n,k,sum=0;
  scanf("%d",&n);
  while(n>0)
  {
    k = n % 10;
    n = n / 10;
    sum = sum + k;
  }
  printf("%d",sum);
	return 0;
}