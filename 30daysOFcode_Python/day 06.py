# Enter your code here. Read input from STDIN. Print output to STDOUT
t = int(input().strip())
for _ in range(t):
    s = input().strip()
    n = len(s)

    even = [s[i] for i in range(0, n, 2)] # list of even chars
    odd = [s[i] for i in range(1, n, 2)] # list of odd chars

    print(''.join(even), ''.join(odd))
