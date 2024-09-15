package view;

import javax.swing.JOptionPane;

import controller.Controller3;

public class Main3 
{

	public static void main(String[] args) 
	{
		Controller3 c = new Controller3();		
		int valor = -1;
		
		while (0 > valor || valor > 10)
		{
			valor = Integer.parseInt(JOptionPane.showInputDialog("digite um valor de 0 a 10"));
		}
		
		int resultado = c.Fatorial(valor);
		
		System.out.println(resultado);
		
	}
	
}
