
public class GradedActivity{
	
   public int score;
   
   
   public GradedActivity(int score) {
	super();
	this.score = score;
}
   
   public GradedActivity(){
	   this.score = 0;
   }

public void setScore(int s)
   {
      score = s;
   }

   public double getScore()
   {
      return score;
   }

   public char getGrade()
   {
      char letterGrade;

      if (this.score >= 90)
         letterGrade = 'A';
      else if (this.score >= 80)
         letterGrade = 'B';
      else if (this.score >= 70)
         letterGrade = 'C';
      else if (this.score >= 60)
         letterGrade = 'D';
      else
         letterGrade = 'F';

      return letterGrade;
   }
}