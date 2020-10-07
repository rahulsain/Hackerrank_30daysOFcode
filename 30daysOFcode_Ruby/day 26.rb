line = $stdin.readline()
date = line.split(" ")

aday = date[0].to_i
amonth = date[1].to_i
ayear = date[2].to_i

line2 = $stdin.readline()
date2 = line2.split(" ")

bday = date2[0].to_i
bmonth = date2[1].to_i
byear = date2[2].to_i

result = 0

cday = aday - bday
cmonth = amonth - bmonth
cyear = ayear - byear

if cyear > 0
result = 10000
elsif  cmonth > 0 and cyear == 0
result = 500 * cmonth
elsif  cday > 0 and cmonth == 0
result = 15 * cday
end
puts result
