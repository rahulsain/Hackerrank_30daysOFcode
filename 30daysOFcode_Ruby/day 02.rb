# Enter your code here. Read input from STDIN. Print output to STDOUT

meal = gets.to_f
tip = (gets.to_f / 100) * meal
tax = (gets.to_f / 100) * meal

total = (meal + tip + tax).round

puts "The total meal cost is #{ total } dollars."
