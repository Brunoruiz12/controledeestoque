import java.util.Scanner;

public class FuncoesFun {
	public static void menuFuncionario(Scanner Info, Produtos estoque) {
		
		while (true) {
			System.out.println("====== Menu do Funcionario ");
			System.out.println(" 1 - Visualizar estoque completo ");
			System.out.println(" 2 - Visualizar produto especifico ");
			System.out.println(" 3 - Sair como Funcionario ");
			System.out.println("====================================");
			
			
			int opcaoFun = Info.nextInt();
			
			switch(opcaoFun) {
			case 1:
				estoque.mostraEstoqueTotal();
				break;
				
			case 2: 
				System.out.println(" Qual produto deseja visualizar ");
				System.out.println(" 1 - camisas ");
				System.out.println(" 2 - Calcas ");
				System.out.println(" 3 - Saias  ");
				System.out.println(" 4 - Vestidos");
				System.out.println(" 5 - Calcados ");
				
				int opcaoProduto = Info.nextInt();
				visualizarProduto(estoque, opcaoProduto);
				break;
				
			case 3: 
				System.out.println(" Saindo como Funcionario ");
				return;
				
				default : 
					System.out.println(" Opcao invalida. Tente Novamente ");
				
			}
		}
	}
					public static void visualizarProduto(Produtos estoque, int opcaoProduto) {
						switch(opcaoProduto) {
						case 1 :
							System.out.println("Camisas :" + estoque.camisas);
							break;
								
						case 2 :
							System.out.println(" Calcas " + estoque.calcas);
							break;
							case 3:
								System.out.println(" Saias " + estoque.saias);
								break;
								
							case 4 :
								System.out.println(" Vestidos " + estoque.vestidos);
								
							case 5: System.out.println(" Calcados " + estoque.calcados);
							break;
						}
					}

}