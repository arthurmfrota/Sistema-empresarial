public class Cliente extends Pessoa{

    private double valorDivida;
    private int anoNasc;

    public double getValorDivida(){
        return valorDivida;
    }

    public int getAnoNasc(){
        return anoNasc;
    }

    public void setValorDivida(double valorDivida){
        this.valorDivida = valorDivida;
    }

    public void setAnoNasc(int anoNasc){
        this.anoNasc = anoNasc;
    }

    @Override
    public String toString(){
        return "Nome: " + getNome()
        + "\nIdade: " + getIdade()
        + "\nSexo: " + getSexo()
        + "\nValor da dívida: " + valorDivida
        + "\nAno de nascimento: " + anoNasc;
    }
}