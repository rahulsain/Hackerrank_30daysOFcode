using System;

class Person{
	protected string firstName;
	protected string lastName;
	protected int id;

	public Person(){}
	public Person(string firstName, string lastName, int identification){
			this.firstName = firstName;
			this.lastName = lastName;
			this.id = identification;
	}
	public void printPerson(){
		Console.WriteLine("Name: " + lastName + ", " + firstName + "\nID: " + id);
	}
}

class Student : Person{
    private int[] scores;

    public Student(String firstName, String lastName, int id, int[] scores) : base(firstName, lastName, id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.scores = scores;
    }
    public Student(){}

    public String calculate(){
        int[] scores = this.scores;
        int s = 0;
        double a = 0;

        for(int i=0;i < scores.Length;i++){
            s += scores[i];
        }

        a = s / scores.Length;

        if (a >= 90 && a <= 100){
            return "O";
        }else if(a >= 80 && a < 90){
            return "E";
        }else if(a >= 70 && a < 80){
            return "A";
        }else if(a >= 55 && a < 70){
            return "P";
        }else if(a >= 40 && a < 55){
            return "D";
        }else{
            return "T";
        }
    }

}

class Solution {
	static void Main() {
		string[] inputs = Console.ReadLine().Split();
		string firstName = inputs[0];
	  	string lastName = inputs[1];
		int id = Convert.ToInt32(inputs[2]);
		int numScores = Convert.ToInt32(Console.ReadLine());
		inputs = Console.ReadLine().Split();
	  	int[] scores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			scores[i]= Convert.ToInt32(inputs[i]);
		}

		Student s = new Student(firstName, lastName, id, scores);
		s.printPerson();
		Console.WriteLine("Grade: " + s.calculate() + "\n");
	}
}