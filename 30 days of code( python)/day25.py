# Enter your code here. Read input from STDIN. Print output to STDOUT
def is_prime(n):
    if n == 1:
        return False
    else:
        square_root = int(n**0.5)
        for i in range(2, square_root + 1):
            if ((n % i) == 0) and (i != n):
                return False
        return True

t = int(input())
for _ in range(t):
    n = int(input())
    if is_prime(n):
        print("Prime")
    else:
        print("Not prime")