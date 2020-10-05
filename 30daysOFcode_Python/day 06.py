'''
# Enter your code here. Read input from STDIN. Print output to STDOUT
t = int(input().strip())
for _ in range(t):
    s = input().strip()
    n = len(s)

    even = [s[i] for i in range(0, n, 2)] # list of even chars
    odd = [s[i] for i in range(1, n, 2)] # list of odd chars

    print(''.join(even), ''.join(odd))
'''

(lambda n, apply: [print(''.join(apply(input()))) for _ in range(n)    ]   )(   int(input()), lambda x : [x[i] for i in range(0, len(x), 2)] + [' '] + [x[i] for i in range(1, len(x), 2)]   )

