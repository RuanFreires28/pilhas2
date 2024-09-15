package controller;

import br.edu.fateczl.pilhaint.Pilha;

public class Controller4 
{
		
	public Controller4()
	{
		super();
	}
	
	
	public int Fatorial(int valor)
	{
		if (valor == 0)
		{
			return 0;
		}
		else
		{
			Pilha p = new Pilha();
			int resultado = 1;
			
			while (valor > 0)
			{
				p.push(valor);
				valor--;
			}
			
			while (!p.isEmpty())
			{
				try {
					resultado *= p.pop() ;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return resultado;
		}
	}
	
	
	
}
