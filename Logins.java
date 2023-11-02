import java.util.Scanner;

public class Logins {
  
	
	public static void loginComoAdm(Scanner Info,Produtos estoque) {
		
		System.out.println(" Voce escolheu Administrador ");
		System.out.println(" Digite a senha ");
	
		String passwordadm = Info.next();
	
		if (passwordadm.equals("adm5615")) {
		System.out.println( " Bem Vindo, Administrador. ");
		menuAdm(Info, estoque);
		
		}else {
			System.out.println( " Senha Incorreta ");
		}
	
	
}
	
		public static void loginComoFun(Scanner Info, Produtos estoque) {
			
			System.out.println( " Voce escolheu Funcionario ");
			System.out.println( "   Digite a senha ");
			
			String passwordfun = Info.next();
			
				if (passwordfun.equals("fun5615")) {
					System.out.println(" Bem Vindo, Funcionario ");
					
				}else {
					System.out.println( "Senha Incorreta ");
				}
			
		}
		
		
		public static void menuAdm(Scanner Info, Produtos estoque) {
			
			while (true) {
				System.out.println(" ======== Menu do Administrador ======== ");
				System.out.println(" 1 - Verificar Estoque  ");
				System.out.println(" 2 - Adicionar Produto ");
				System.out.println(" 3 - Remover Produtor  ");
				System.out.println(" 4 - Sair como Administrador ");
				System.out.println("===========================================");
				
				int opcaoadm = Info.nextInt();
				
				switch (opcaoadm) {
				case 1:
					estoque.mostraEstoqueTotal();
				break;	
				
				case 2:
					System.out.println( " Informe o tipo de produto para adicionar (1 - Camisas, 2 - Calcas, 3 - Vestidos , 4 - Saias, 5 - Calcados) : ");
					int tipodeProduto = Info.nextInt();
					System.out.println(" Digite a quantidade para adicionar : ");
					int quantidadeAdicionar = Info.nextInt();
					if (tipodeProduto == 1) {
						estoque.adicionarCamisas(quantidadeAdicionar);
						
					}else if (tipodeProduto == 2) {
						estoque.adicionarCalcas(quantidadeAdicionar);
					}else if (tipodeProduto == 3) {
						estoque.adicionarVestidos(quantidadeAdicionar);
						
					}else if (tipodeProduto == 4){
						estoque.adicionarSaias(quantidadeAdicionar);
					}else if (tipodeProduto == 5 ) {
						estoque.adicionarCalcados(quantidadeAdicionar);
					}else {
						System.out.println((" Opção Invalida "));
					}
	
					break;
					
					
				case 3:
					System.out.println( " Informe o tipo de produto para  Remover  (1 - Camisas, 2 - Calcas, 3 - Vestidos , 4 - Saias, 5 - Calcados) : ");
					int tipodeProdutoRemover = Info.nextInt();
					System.out.println(" Digite a quantidade para remover  : ");
					int quantidadeRemover = Info.nextInt();
					if (tipodeProdutoRemover == 1) {
						estoque.retirarCamisas(quantidadeRemover);
						
					}else if (tipodeProdutoRemover == 2) {
						estoque.retirarCalcas(quantidadeRemover);
					}else if (tipodeProdutoRemover == 3) {
						estoque.retirarVestidos(quantidadeRemover);
						
					}else if (tipodeProdutoRemover == 4){
						estoque.retirarSaias(quantidadeRemover);
					}else if (tipodeProdutoRemover == 5 ) {
						estoque.retirarCalcados(quantidadeRemover);
					}else {
						System.out.println((" Opção Invalida "));
					}
	
					break;
					
					
				case 4:
					System.out.println(" Saindo como Administrador ");
					return;
					
					default:
						System.out.println(" Opcao invalida tente novamente ");
						break;
				}
			}
		}
	
}
