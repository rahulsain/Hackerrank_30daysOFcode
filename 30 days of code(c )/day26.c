#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int ac_day, ac_month, ac_year;
    int exp_day, exp_month, exp_year;
    scanf("%d %d %d", &ac_day, &ac_month, &ac_year);
    scanf("%d %d %d", &exp_day, &exp_month, &exp_year);
    int fine;
    if (ac_year < exp_year) {
        fine = 0;
    } else if (ac_year > exp_year) {
        fine = 10000;
    } else if (ac_month < exp_month) {
        fine = 0;
    } else if (ac_month > exp_month) {
        fine = 500 * (ac_month-exp_month);
    } else if (ac_day < exp_day) {
        fine = 0;
    } else {
        fine = 15 * (ac_day - exp_day);
    }
    printf ("%d", fine);
    return 0;
}
