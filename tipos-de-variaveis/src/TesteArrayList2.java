import java.util.ArrayList;
import java.util.Iterator;

public class TesteArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("java");
        nomes.add("ruby");
        nomes.add("scala");

        Iterator<String> it = nomes.iterator();

        while (it.hasNext()) {
            String atual = it.next();
            System.out.println(atual);
            //it.remove();
        }
        System.out.println(nomes.size());

        for (String nome : nomes) {
            System.out.println(nome);
        }

        Cliente n190 = new Cliente();
        n190.nome = "Guilherme";
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(n190);

        System.out.println(n190.nome);
        System.out.println(clientes.get(0).nome);

        n190.nome = "Silveira";

        System.out.println(n190.nome);
        System.out.println(clientes.get(0).nome);

    }
}
