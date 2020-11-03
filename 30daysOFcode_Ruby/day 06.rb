t = gets.to_i
loop do
    s = gets
    s.delete!("\n")
    for i in (0..s.length).step(2) do
        print s[i]
        STDOUT.flush
    end
    print " "
    STDOUT.flush
    for i in (1..s.length).step(2) do
        print s[i]
        STDOUT.flush
    end
    puts
    t -= 1
    if t == 0
        break
    end
end