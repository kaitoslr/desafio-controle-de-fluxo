import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
        int parametroUm = 0;
        int parametroDois = 0;
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro");
            parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            parametroDois = terminal.nextInt();
<<<<<<< HEAD
        } catch(Exception e){
            System.out.println("Digite um número inteiro");
    }	
	    try {
		    contar(parametroUm, parametroDois);
		
    	}catch (ParametrosInvalidosException exception) {
		    System.out.println(exception.getMessage());
	}
		
}
    static void contar (int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
	    int contagem = parametroDois - parametroUm;
        
	    if(parametroUm>parametroDois){
=======
        }
    } catch(Exception e){
        System.out.println("Digite um número inteiro");
    }	
	try {
		contar(parametroUm, parametroDois);
		
	}catch (ParametrosInvalidosException exception) {
		System.out.println(exception.getMessage());
	}
		
}
static void contar (int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
	int contagem = parametroDois - parametroUm;
        
	if(parametroUm>parametroDois){
>>>>>>> 8be9d302a51b50227b39a7874706276cba5ed006
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        } else{
            for(int i=1; i<=contagem; i++){
                System.out.println(i);
            }
        }
	}
}
