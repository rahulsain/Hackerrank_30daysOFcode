function max_ones(bitstream ::String)
    max_count = 0
    current = 0
    for i = 1:length(bitstream)
        if bitstream[i] == '1'
            current += 1
        else
            if current > max_count
                max_count = current
            end
            current = 0
        end
    end
    return max(max_count,current)
end

n = parse(Int64, readline())
# Get binary interpretation of n
binary_n = bitstring(n)
# println(binary_n)
println(max_ones(binary_n))