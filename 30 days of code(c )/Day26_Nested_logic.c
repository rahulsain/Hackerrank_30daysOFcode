#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    int eday, emon, eyear;
int aday, amon, ayear;

scanf("%d%d%d",&aday,&amon,&ayear);
scanf("%d%d%d",&eday,&emon,&eyear);


int fine = 0;

int dyear = ayear - eyear;
int dmon = amon - emon;
int dday = aday - eday;

if (dyear > 0) {
    fine = 10000;
}
else if (dmon > 0 && dyear == 0) {
    fine = 500 * dmon;
}
else if (dday > 0 && dmon == 0) {
    fine = 15 * dday;
}

printf("%d\n",fine);
  
    return 0;
}
