n = parse(Int64, readline())

dict = Dict{String, Int64}() 

for i in 1:n
    A = split(readline(), " ")
    dict[A[1]] = parse(Int64, A[2])
end

for i in 1:n
    key = readline()
    val = get(dict,key,"-1")
    if val == "-1"
        println("Not found")
    else
        println(key,"=",val)
    end
end