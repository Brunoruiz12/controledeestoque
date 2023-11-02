
import java.util.Scanner;




public class ControledeEstoque {
	public static void main(String[] args) {
		int user;
		Scanner Info = new Scanner(System.in);
		
		System.out.println("======== Dev Boutique  ========");
		System.out.println(" Escolha um tipo de usuario ");
		System.out.println("1. ADMINISTRADOR ");
		System.out.println("2. FUNCIONARIO");
		System.out.println("================================");
		
		user = Info.nextInt();
		Produtos estoque  = new Produtos();
		
			switch(user) {
			case 1:
				Logins.loginComoAdm(Info, estoque);
				break;
				
			case 2:
				Logins.loginComoFun(Info, estoque);
				FuncoesFun.menuFuncionario(Info, estoque);
				break; 
				
				default:
					System.out.println(" Opcao Invalida, Tente novamente. ");
					break;
			
				
						
					}
		}	
	}
	
								
		
			
	
	

		
				
	
	
	
	
	


