n = parse(Int64, readline())

for i in 1:n
    S = readline()

    len = length(S)

    odd = ""
    even = ""

    for j in 1:2:len
        odd = odd*S[j]
    end
    for j in 2:2:len
        even = even*S[j]
    end
    println(odd," ",even)
    # println(even)
end