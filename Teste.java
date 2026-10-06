public class Teste {

    public static void main(String[] args) {

        Gerente gerente = new Gerente();

        gerente.setNome("Carlos");
        gerente.setIdade(35);
        gerente.setSexo("Masculino");
        gerente.setSalario(5000);
        gerente.setMatricula("G001");
        gerente.setNomeGerencia("Tecnologia");


        Cliente cliente = new Cliente();

        cliente.setNome("Mariana");
        cliente.setIdade(28);
        cliente.setSexo("Feminino");
        cliente.setValorDivida(1500);
        cliente.setAnoNasc(1998);


        Vendedor vendedor = new Vendedor();

        vendedor.setNome("João");
        vendedor.setIdade(30);
        vendedor.setSexo("Masculino");
        vendedor.setSalario(2500);
        vendedor.setMatricula("V001");
        vendedor.setValorVendas(12000);
        vendedor.setQntVendas(20);


        System.out.println("--- GERENTE ---");
        System.out.println(gerente);

        System.out.println("\n--- CLIENTE ---");
        System.out.println(cliente);

        System.out.println("\n--- VENDEDOR ---");
        System.out.println(vendedor);
    }
}