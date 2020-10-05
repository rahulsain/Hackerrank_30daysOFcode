function maximum_hourglass()
    # Defined 2d Matrix
    B = Matrix{Int64}(undef,6,6)
    
    for i in 1:1:6
        A = map((x) -> parse(Int64,x) , split(readline(), " "))
        for j in 1:1:6
            B[i,j] = A[j]
        end
    end
    max_val = -100

    for i in 2:5
        for j in 3:5
            max_val = max(max_val, B[i,j] + B[i-1,j] + B[i-1,j-1] + B[i-1,j+1] + B[i+1, j] + B[i+1, j-1] + B[i+1,j+1])
        end
    end
    println(max_val)

end

maximum_hourglass()