package es.studium.Cuadradospares;

public class Cuadradospares 
{

	public static void main(String[] args) 
	{
		int i, resultado;
		for (i=1;i<=100;i++)
		{
			if(i%2==0)
				//solo dos == cuando es if
			{
				resultado = funcuadrados2(i);
				System.out.println(resultado);
			}
		}
	}
	public static int funcuadrados2(int x)
	{
		return (x*x);
	}

}
