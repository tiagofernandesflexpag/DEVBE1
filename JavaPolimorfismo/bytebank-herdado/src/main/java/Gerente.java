public class Gerente extends Funcionario{

    private int senha;

    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        }else{
            return false;
        }
    }

    public double getBonificacao(){
        return super.getBonificacao() + super.getSalario(); //aproveitando os metódos da classe mãe com o super
    }

}