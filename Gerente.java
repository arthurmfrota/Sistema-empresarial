public class Gerente extends Empregado{

    private String nomeGerencia;

    public String getNomeGerencia(){
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia){
       this.nomeGerencia = nomeGerencia;
    }

    @Override
    public String toString(){
        return "Nome: " + getNome() 
        + "\nIdade: " + getIdade() 
        + "\nMatrícula: " + getMatricula()
        + "\nNome da gerência: " + nomeGerencia
        + "\nValor do INSS: " + valorInss();
    }
}