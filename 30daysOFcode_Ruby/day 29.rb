#!/bin/ruby

t = gets.strip.to_i #test cases
for a0 in (0..t-1)
    n,k = gets.strip.split(' ')
    n = n.to_i #biggest number
    k = k.to_i #sup bitwise and (not to be reached) of two numbers <= n
    biggest_and = k - 1 
    man = biggest_and.to_s(2).split("").map { |x| x.to_i }.reverse
    change = man.find_index { |e| e.zero? }
    if change
        man[change] = 1 
    else
        man << 1
    end 
    biggest_and -=1 if man.reverse.join.to_i(2) > n   
    puts biggest_and
end
