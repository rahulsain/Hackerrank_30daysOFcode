
name =""
phn = 0
contact = {}
for _ in range(n):
    name,no = input().split()
    phn = int(no)
    contact[name] = phn


query = []
inp = True
while(inp):
    
    try:
        q = input()
        query.append(q)
    except EOFError as e:
        inp = False

for qw in query:
    if(contact.get(qw)!= None):
        print(f"{qw}={contact[qw]}")
    else:
        print("Not found")
