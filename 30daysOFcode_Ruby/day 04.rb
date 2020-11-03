class Person
    attr_accessor :age
    def initialize(initialAge)
        if initialAge>0
            @age=initialAge
        else
            @age=0
            puts "Age is not valid, setting age to 0."
        end
    end
    def amIOld()
      # Do some computations in here and print out the correct statement to the console
      if @age<13
            puts "You are young."
      elsif 13<=@age && @age<18
            puts "You are a teenager."
      else
            puts "You are old."
      end
    end
    def yearPasses()
      # Increment the age of the person in here
      @age+=1
    end
end