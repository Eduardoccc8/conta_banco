package guanabara2;

public class ContaBanco {
	
	public  int numConta;
	protected String Tipo;
	private  String dono ;
	private float saldo;	
	private boolean status;
	
	
	 public void abrirConta(String t) {
		 this.setTipo(t);
		 
		 this.setStatus(true);		 
	 	 if (t== "CC"){ 	 		
	 	 this.setSaldo(50);
	 		  		
		 }else if(t== "CP") {
		  this.setSaldo(150);	 		 
	 	 }
	 	 System.out.println("conta aberta com sucesso!!!");
		
		 
		 
		
	}
     public void fecharConta() {
    	 if(this.getSaldo() >0) {
    		 System.out.println("Conta nao pode ser fechA pois tem saldo!!!");
    	 }else if(this.getSaldo() < 0) {
    		 System.out.println("Conta nao pode ser fechada pois esta com debido!!!");
    	 } else {
    		 this.setStatus(false);
    		 System.out.println("Conta fechada com sucesso!!!");
    	 }
    	 
    	 
    	 
    	 
    	 
		
	}
     public void depositar(float v) {
    	 if (this.getStatus()) {
    		// this.saldo = this.saldo + v;
    		 this.setSaldo(getSaldo() + v);
    		System.out.println("Deposito realizado com sucesso: " + this.getDono()); 
    	 }else {
    		 System.out.println("Impossivel depositar");
    	 }
    	 
    	 
    	 
    	 
    	 
    	 
		
	}
     
     
     
     
     
     
     public void sacar(float v) {
    	 if (this.getStatus()) {
    		 if(this.getSaldo() >= v){
    		 this.setSaldo(this.getSaldo() - v);
    		 System.out.println("Saquele realizado da conta de : " + this.getDono());
    	 }else {
    		 System.out.println("Saldo insuficiente para saque!!!");
    	 
    	 }
    	 }else {
    		 System.out.println("Iimpossivel sacar de uma conta fechada!!!");
    		 
    	 }
    		         	 
    	  	 
  	}
     public void pagarMensal() {
    	 
    	 int v = 0;
    	 if(this.getTipo()== "CC") {
    		 v = 12;
    	 }else if (this.getTipo()== "CP") {
    		 v = 20;   		 
    	 }
 		
     
     if (this.getStatus()) {
    	 this.setSaldo(this.getSaldo() - v);
    	 System.out.println("mensalidade paga com sucesso por:" + this.getDono());
     }else {
    	 System.out.println("impossivel pagar uma conta!!!!");
     }
    	 
     }
     
     
     
     
     
     public void ContaBanco() {
    	 this.setSaldo(0); 
    	 this.setStatus(false);
		
	}
     
     
       
    	
	
	
	
	

	
	
	
	
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float f) {
		this.saldo = f;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public void estadoAtual(){
	//System.out.println("numero da conta: " this.numConta);
	System.out.println("-----------------");
	System.out.println("Conta : " + this.getNumConta());
	System.out.println("Tipo: " + this.getTipo());
	System.out.println("Dono: " + this.getDono());
	System.out.println("Saldo: " + this.getSaldo());
	System.out.println("Status: " + this.getStatus());
		
	System.out.println("-----------------");
	}
		
		
	}


