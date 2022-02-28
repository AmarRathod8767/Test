package Test;
import java.util.Scanner;
public class Bank {
  int bal=5000;
  Scanner s=new Scanner(System.in);
  private void credit(int amt)
  {
	  bal+=amt;
  }
  private void debit(int amt)
  {
	  bal-=amt;
  }
  private void checkBalance()
  {
	  System.out.println("Available Balance is "+bal);
  }
  private int  accept()
  {
	  System.out.println("Enter amount ");
	  int amt=s.nextInt();
	  return amt;
  }
  void logic(int pin)
  { 
	  
	  if(pin==123456)
	  {
		  while(true)
		  {
			  System.out.println("Enter c to credit\n Enter d to debit\n enter b to balance\n Enter e to Exit");
			  char ch=s.next().charAt(0);
			  switch(ch)
			  {
				  case'c':
					  credit(accept());
					  break;
				  case'd':
					  debit(accept());
					  break;
				  case'b':
					  checkBalance();
					  break;
				  case'e':
					  System.exit(0);
					  break;
					  default:
						  System.out.println("Wrong choice");
						  break;
			  }	  
					  
		  }
	  }
	  else
		  System.out.println("Enter correct pin");
  }
}
