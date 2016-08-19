class Cow{
	public void moo(){
		System.out.println("Cow says moo.");
	}
}

class Pig{
	public void oink(){
		System.out.println("Pig says oink.");
	}
}



public class OldMacDonald{
	public static void main(String[] args){
	
		Cow maudine = new Cow();
		Cow pauline = new Cow();
		maudine.moo();
		pauline.moo();
		
		Pig snowball = new Pig();
		snowball.oink();
		snowball.oink();
		
		Duck ferdinand = new Duck();
		ferdinand.quack();
		
		Duck scruz = new Duck();
		scruz.quack();
	}
}

class Duck{
	public void quack(){
		System.out.println("Duck says quack.");
	}
}

//In Java, each file may only have one public class in it, and the name of that public class has to match the name of the file.
/*
Study Drills:
1. Try moving the entire definition of the Duck class below the OldMacDonald class. Does the code still compile and work? Answer in a comment.
Answer: Yes, it works

2. Inside the main() method, instantiate another object and call its method. (It doesn’t matter which of the three objects; just pick one.)
Answer: did
*/
