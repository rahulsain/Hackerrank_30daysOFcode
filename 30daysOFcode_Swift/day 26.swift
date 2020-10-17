// Enter your code here 
class BookReturn {
    var day:Int
    var month:Int
    var year:Int
    
    //
    init(day:Int, month:Int, year:Int) {
        self.day = day
        self.month = month
        self.year = year
    }
}

func calculateBookFine(expetedBookReturn:BookReturn, actualBookReturn:BookReturn) -> Int {
    
    var fine:Int
    
    //
    if actualBookReturn.year > expetedBookReturn.year {
        fine = 10000
    } else {
        
        //
        if actualBookReturn.month > expetedBookReturn.month {
            fine = 500*(actualBookReturn.month - expetedBookReturn.month)
        } else if actualBookReturn.day > expetedBookReturn.day {
            fine = 15*(actualBookReturn.day - expetedBookReturn.day)
        } else {
            fine = 0
        }
    }
    return fine
}
var actualArray  = readLine()!.characters.split(" ").map(String.init).map{Int($0)!}
var expededArray = readLine()!.characters.split(" ").map(String.init).map{Int($0)!}

var expetedBookReturn:BookReturn = BookReturn.init(day: expededArray[0], month: expededArray[1], year: expededArray[2])
var actualBookReturn:BookReturn = BookReturn.init(day: actualArray[0], month: actualArray[1], year: actualArray[2])

print(calculateBoo
