
public class Fibonnaci {
	
	private int num;
	
	public Fibonnaci(){}	
	public Fibonnaci(int num){	this.num = num;	}		
	public int getNum() {return num;}
	public void setNum(int num) {this.num = num;}
	
	public void SumFib()
	{
		int a = 1;
		int b = 1;
		int w = 0;
		
		for(int i = 3 ; i < num ; i++)
		{			
			w = a+b;
			a = b;
			b = w;
			System.out.println(w);
		}
	}

}
