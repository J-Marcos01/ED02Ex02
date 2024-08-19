package view;
import controller.Recursiva02;
public class Principal 
{

	public static void main(String[] args) 
	{
		Recursiva02 funcao =new Recursiva02();
		
		int dd =30;
		int dv = 4;
		int res =funcao.resto(dd, dv);
		System.out.println(res);
		
	}

}
