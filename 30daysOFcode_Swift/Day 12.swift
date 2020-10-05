// Class Student
class Student: Person {
	var testScores: [Int]
	
	// Write the Student class initializer
	init(firstName: String, lastName: String, identification: Int, scores: [Int]) {
		self.testScores = scores;
		super.init(firstName: firstName, lastName: lastName, identification: identification);
	}
	
	// Write the calculate method
	func calculate() -> String {
		var average = 0;
		for i in testScores {
			average += i;
		}
		average = average / testScores.count;

		if(average >= 90) {
			return "O"; // Outstanding
		}
		else if(average >= 80) {
			return "E"; // Exceeds Expectations
		}
		else if(average >= 70) {
			return "A"; // Acceptable
		}
		else if(average >= 55) {
			return "P"; // Poor
		}
		else if(average >= 40) {
			return "D"; // Dreadful
		}
		else {
			return "T"; // Troll
		}
	}
	
} // End of class Student
