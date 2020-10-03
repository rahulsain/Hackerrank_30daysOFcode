# Day 1: Data Types

# Declared variables
i = 1
d = 2.0
s = "Hello "
# Declare second integer, double, and String variables.
# Read and save an integer, double, and String to your variables.
newI = parse(UInt64, readline())
newD = parse(Float64, readline())
newS = readline()

# Print the sum of both integer variables on a new line.
println(i + newI)
# Print the sum of the double variables on a new line.
println(d + newD)
# Concatenate and print the String variables on a new line
# The 's' variable above should be printed first.
println(string(s , newS))
