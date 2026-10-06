public class Vendedor extends Empregado{
    
    private double valorVendas;
    private int qntVendas;

    public double getValorVendas(){
        return valorVendas;
    }

    public int getQntVendas(){
        return qntVendas;
    }

    public void setValorVendas(double valorVendas){
        this.valorVendas = valorVendas;
    }

    public void setQntVendas(int qntVendas){
        this.qntVendas = qntVendas;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome()
                + "\nSalário: R$ " + getSalario()
                + "\nValor das vendas: R$ " + valorVendas
                + "\nQuantidade de vendas: " + qntVendas;
    }

}