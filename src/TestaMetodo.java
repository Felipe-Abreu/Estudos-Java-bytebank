
public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoFelipe = new Conta();
		contaDoFelipe.saldo = 100;
		contaDoFelipe.deposita(50);
		System.out.println(contaDoFelipe.saldo);
		
		boolean conseguiuRetirar = contaDoFelipe.saca(20);
        System.out.println(contaDoFelipe.saldo);
        System.out.println(conseguiuRetirar);
        
        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);
        
        boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoFelipe); 
        if(sucessoTransferencia) {
        	System.out.println("Transferencia feita com sucesso");
        } else {
        	System.out.println("Falta dinheiro");
        }
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoFelipe.saldo);
        
        contaDoFelipe.titular = "Felipe Abreu";
        System.out.println(contaDoFelipe.titular);
	}

}
