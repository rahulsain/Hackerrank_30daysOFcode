mealCost = parse(Float64, readline())
tipPercentage = parse(Float64, readline())
taxPercentage = parse(Float64, readline())

totalCost = 0.0
totalCost += mealCost
totalCost += tipPercentage * 0.01 * mealCost
totalCost += taxPercentage * 0.01 * mealCost

println(convert(Int64, round(totalCost) ) )