public class Essay extends GradedActivity{
	
	int grammar;
	int spelling;
	int content;
	int score;
	
	public Essay(int grammar, int spelling, int content, int score) {
		super(score);
		this.grammar = grammar;
		this.spelling = spelling;
		this.content = content;
		this.score = score;
	}
	
	public Essay(){
		this.grammar = 0;
		this.spelling = 0;
		this.content = 0;
	}

	public int getGrammar() {
		return grammar;
	}

	public void setGrammar(int grammar) {
		this.grammar = grammar;
	}

	public int getSpelling() {
		return spelling;
	}

	public void setSpelling(int spelling) {
		this.spelling = spelling;
	}

	public int getContent() {
		return content;
	}

	public void setContent(int content) {
		this.content = content;
	}
	
	public double getScore() {
		return score;
	}

	public void setScore(int totalpoints) {
		this.score = totalpoints;
	}

	
	public String toString(){
		return "Grammar: " + this.grammar + " Spelling: " + this.spelling + " Content: " + this.content + " Total Points: " + this.score + " Grade: " + getGrade();
	}
}
