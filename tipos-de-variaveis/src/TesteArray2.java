public class TesteArray2 {
    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[10];

        for (int i = 0; i < clientes.length; i++) {
            clientes[i] = new Cliente();
            clientes[i].nome = "Mario";
        }

        for (Cliente c : clientes) {
            System.out.println(c.nome);
        }

    }
}

class Cliente {
    String nome;
}
