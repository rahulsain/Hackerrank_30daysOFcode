n = parse(Int64, readline())
A = map((x) -> parse(Int64,x) , split(readline(), " "))

for i in n:-1:1
    print(A[i]," ")
end
println()