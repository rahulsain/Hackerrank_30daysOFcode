mutable struct Person
    age::Int64

    function Person(age::Int64)  
        this = new()
        if age < 0
            println("Age is not valid")
            this.age = 0
            return this
        else
            this.age = age
            return this 
        end
    end
end

function yearPasses(self::Person)
    self.age += 1
end

function amIOld(self::Person)
    if self.age < 13
        println("You are young.")
    elseif self.age < 18
        println("You are a teenager.")
    else
        println("You are old.")
    end
end

# a = Person(111)
# yearPasses(a)
# println(a.age)
# amIOld(a)
