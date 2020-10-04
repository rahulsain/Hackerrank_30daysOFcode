n = parse(Int64, readline())

if n % 2 == 1
    println("Weird")
elseif n % 2 == 0
    if n >= 2 && n <= 5
        println("Not Weird")
    elseif n >= 6 && n <= 20
        println("Weird")
    else
        println("Not Weird")
    end
end