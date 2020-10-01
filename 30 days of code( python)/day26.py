# Day 26
# https://www.hackerrank.com/challenges/30-nested-logic/problem

actual_day, actual_month, actual_year = list(map(int, input().split()))
expected_day, expected_month, expected_year = list(map(int, input().split()))

if actual_day <= 31 and actual_day >= 1 and \
   actual_month >= 1 and actual_month <= 12 and\
   actual_year >=1 and actual_year <= 3000 and\
   expected_day >=1 and expected_day <=31 and\
   expected_month >=1 and expected_month <=12 and\
   expected_year >=1 and expected_year <=3000:

    if actual_year > expected_year:
        print(10000)
    elif actual_year == expected_year:
        if actual_month == expected_month and actual_day > expected_day:
            print((actual_day - expected_day) * 15)
        elif (actual_month > expected_month):
            print((actual_month - expected_month) * 500)
        else:
            print(0)
    else:
            print(0)
else:
    print(0)
