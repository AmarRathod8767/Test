package Test;

public class ExamNew extends Exam{

	public void examPattern(String s)
	{
		System.out.println("Grade System "+s);
	}
	public static void main(String[]args)
	{
		//Exam obj=new Exam();
		//Exam obj=new ExamNew();
		ExamNew obj=new ExamNew();
		
		obj.boardInfo();
		obj.examPattern("A");
	}

}
