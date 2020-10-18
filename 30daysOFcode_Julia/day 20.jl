# Enter your code here 
n = parse(Int, readline())
arr = parse.(Int,split(readline()))
numswaps = 0
for i = 1:n
    for j = 1:n-1
        if arr[j]>arr[j+1]
            dummy = arr[j]
            arr[j] = arr[j+1]
            arr[j+1] = dummy
            numswaps += 1
        end
    end
end
print("Array is sorted in $(numswaps) swaps.",'\n')
print("First Element: $(arr[1])",'\n')
print("Last Element: $(arr[end])",'\n')
