# Enter your code here. Read input from STDIN. Print output to STDOUT

returned_date = raw_input().split(' ')
due_date = raw_input().split(' ')

def fine_calc(returned_date, due_date):
    if (str(''.join(returned_date)) == str(''.join(due_date))):
        return 0
    
    
    
    returned_date = [int(t) for t in returned_date]
    due_date = [int(t) for t in due_date]

    
    if ((returned_date[2] == due_date[2]) and (returned_date[1] == due_date[1]) and (returned_date[0] > due_date[0])):
        # Case 2
        return (15 * (returned_date[0] - due_date[0]))
    
    if ((returned_date[1] > due_date[1]) and (returned_date[2] == due_date[2])):
        # Case 3
        return (500 * (returned_date[1] - due_date[1]))
        
        
    if (returned_date[2] > due_date[2]):
        # Case 4
        return 10000
    
    if(returned_date[2] < due_date[2]):
        # Early (different year)
        return 0
    
    if (returned_date[2] == due_date[2]) and (returned_date[1] < due_date[1]):
        # Early (same year, different month)
        return 0
    
    return 0
        
ans = fine_calc(returned_date, due_date)    
print ans
