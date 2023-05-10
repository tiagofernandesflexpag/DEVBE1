//Quando você constroi uma interface, os métodos que assinam o contrato são obrigados a implementar os métodos abstratos
//com isso, é possível fazer com que somente as classes que necessitem de determinado comportamento implementem as situações

public abstract interface Autenticavel {
	
	public abstract void setSenha(int senha) ;
	
	public abstract boolean autentica(int senha) ;
}
