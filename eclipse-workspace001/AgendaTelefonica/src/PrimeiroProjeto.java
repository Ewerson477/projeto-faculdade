 
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrimeiroProjeto {
	public static void main(String[] args) {
		
		LocalDateTime agora = LocalDateTime.now();
		
		  //formatar a data
		  DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/mm/uuuu");
		  String DataFormatada = formatterData.format(agora);
		//formatar a hora
		DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
		String horaFormatada = formatterHora.format(agora);
		  
		System.out.println(LocalDateTime.now());
		
		String[] nome = new String[20];
        String[] email = new String[20];
        String[] telefone = new String[20];
        
        for(int i = 0; i < 20; i++) {
        	nome[i] = "";
        	telefone[i] = "";
        	email[i] = "";
        	
        }
        
        String opcao = "";
        String continuar = "";
        int posicao = 0;
        String nomeexcluir = "";
        
        Scanner entrada = new Scanner(System.in);
        
        do {
		  System.out.println("Escolha a opção: Adicionar contatos - Listar contatos - Excluir - Sair");
		  opcao = entrada.nextLine();
		  
		  switch (opcao) {
		  case "Adicionar contatos":
			  //codigo para adicionar contatos
			  do {
				  
			  System.out.print("Digite o nome: ");
			  nome[posicao] = entrada.nextLine();
			  
			  System.out.print("Digite o email: ");
			  email[posicao] = entrada.nextLine();
			  
			  System.out.print("Digite o telefone: ");
			  telefone[posicao] = entrada.nextLine();
			  
			  System.out.print("Deseja continuar o cadastramento? ");
			  continuar = entrada.nextLine();
			  
			  posicao++;
			  
			  }while (continuar.equals("Sim"));
			  
				  
		 break;
			  
		  case "Listar contatos":
			  // codigo para listar contatos
			  for (int i = 0; i < 20; i++) {
				  
				if(!nome[i].equals("")){
					
					
					System.out.println("Nome:" + nome[i] + 
				               " Telefone: " + telefone[i] + 
							   " Email: " + email[i]);
					
				}
				  
				  
			}
			  
			  break;
			  
		  case "Excluir":
			  //codigo para excluir
			  System.out.println("Quem deseja excluir? ");
			  nomeexcluir = entrada.nextLine();
			  
			  for(int i =0; i < 20; i++) {
				  if(nome[i].equals(nomeexcluir)) {
					  
					  nome[i] = "";
					  telefone[i] = "";	  
					  email[i] = "";
				}
			  
			  }
			  
			  break;
		  case "Sair":
			 // codigo para sair
			  System.out.println("Programa Finalizado.");
			  return;
			  
			 default:
				 //Opção Invalida!
				 System.out.println("Opção Invalida! Tente novamente.");
				  break;
		  
		  }
	  
	  
        
        }while (!opcao.equals("Sair"));
	
	

	
	
	
	}

}
