
public class Multiples {
	
	private int num;

	public Multiples(){}	
	public Multiples(int num){	this.num = num;	}		
	public int getNum() {return num;}
	public void setNum(int num) {this.num = num;}
	
	
	public int FindNumbers()
	{
		int sum = 0;
		
		for(int i = 3 ; i < num ; i++)
			if((i % 3) == 0 || (i % 5) == 0)
				sum+=i;
		return sum;
	}
	
	
	
	

}
