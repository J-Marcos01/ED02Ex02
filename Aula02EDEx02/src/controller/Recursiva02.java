package controller;
//2. Criar uma função recursiva que receba o dividendo e o divisor de uma operação de divisão e, por 
//subtrações, exiba o resto da divisão
public class Recursiva02
{
	public Recursiva02() 
	{
		super();
	}
	public int resto (int dd,int dv )
	{
		if(dd<dv)
		{
			return dd;
		}
		else
		{
		return resto(dd-dv,dv); 	
		}
	}
	
	
}
