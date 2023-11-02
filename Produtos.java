
	public class Produtos {
	
	public int camisas;
	public int calcas;
	public int saias;
	public int vestidos;
	public int calcados;
	
	public Produtos() {
		camisas = 20;
		calcas = 20;
		saias = 20;
		vestidos = 20;
		calcados = 20;
	} 
	
	public void retirarCamisas(int quantidade) {
		
		if(camisas >= quantidade) {
			camisas-= quantidade;
			System.out.println( quantidade + " camisas foram retiradas do estoque  ");
		}
		else {
			System.out.println( " quantidade insuficiente de camisas ");
		}
	}
	
	public void adicionarCamisas(int quantidade) {
		  
			camisas += quantidade;
			System.out.println(quantidade + " Camisas foram adicionadas ao estoque ");
	}
		
	
	public void retirarCalcas(int quantidade) {
		
		if(calcas >= quantidade) {
			calcas-= quantidade;
			System.out.println( quantidade + " calcas foram retiradas do estoque  ");
		}
		else {
			System.out.println( " quantidade insuficiente de calcas ");
		}
	}
	
	public void adicionarCalcas(int quantidade) {
		  
			calcas += quantidade;
			System.out.println(quantidade + " calcas foram adicionadas ao estoque ");
	}
	
	
  
	  		
	  
	  
	  public void retirarSaias(int quantidade) {
			
			if(saias >= quantidade) {
				saias -= quantidade;
				System.out.println( quantidade + " Saias foram retiradas do estoque  ");
			}
			else {
				System.out.println( " quantidade insuficiente de saias ");
			}
		}
		
		  public void adicionarSaias(int quantidade) {
			  
			  saias += quantidade;
				System.out.println(quantidade + " saias foram adicionadas ao estoque ");
		}
	
		  
		  
		  
		  public void retirarVestidos(int quantidade) {
				
				if( vestidos >= quantidade) {
					vestidos -= quantidade;
					System.out.println( quantidade + " vestidos foram retiradas do estoque  ");
				}
				else {
					System.out.println( " quantidade insuficiente de vestidos ");
				}
			}
			
			  public void adicionarVestidos(int quantidade) {
				  
				  vestidos += quantidade;
					System.out.println(quantidade + " Vestidos foram adicionadas ao estoque ");
			}
		  
		  
			  
			  
			  
			  public void retirarCalcados(int quantidade) {
					
					if( calcados  >= quantidade) {
						calcados-= quantidade;
						System.out.println( quantidade + " Calcados foram retiradas do estoque  ");
					}
					else {
						System.out.println( " quantidade insuficiente de Calcados");
					}
				}
				
				  public void adicionarCalcados(int quantidade) {
					  
					  calcados += quantidade;
						System.out.println(quantidade + " Calcados foram adicionadas ao estoque ");
				}
			  
				  
				  
				  
				  
				  
				 public void mostraEstoqueTotal() {
					 System.out.println(" Esotoque Total ");
					 System.out.println(" Camisas " + camisas);
					 System.out.println(" Calcas " + calcas);
					 System.out.println(" Saias " + saias );
					 System.out.println(" Vestidos "  + vestidos );
					 System.out.println(" Calcados " + calcados );
					 
				 }
				 
				 public void gerarRelatorio() {
					System.out.println(" Relatorio de Estoque "); 
					System.out.println(" Camisas " + camisas + " unidades " );
					System.out.println(" Calcas " + calcas+ " unidade ");
					System.out.println( " Saias " + saias + " unidade ");
					System.out.println( " Vestidos " + vestidos + " unidade ");
					System.out.println( " Calcados " + calcados + " unidade ");
					int totalEstoque = camisas + calcas + saias + vestidos + calcados;
					System.out.println(" Total no estoque : " + totalEstoque + " unidade") ;
					 
					 
				 }
				 
				 
			  
	}
