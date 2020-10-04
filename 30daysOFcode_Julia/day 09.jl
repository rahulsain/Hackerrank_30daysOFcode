function factorial(n::Int64)
    if n == 0 || n == 1
        return 1
    else
        return n * factorial(n-1)
    end
end
n = parse(Int64, readline())
println(factorial(n))