import java.net.PasswordAuthentication;
import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList();

        nomes.add("java");
        nomes.add("ruby");
        nomes.add("java");

        System.out.println(nomes.contains("java")); // retorna true ou false
        System.out.println(nomes.contains("c#"));

        boolean removido = nomes.remove("java");
        System.out.println(removido);
        System.out.println(nomes.contains("java"));
        System.out.println(nomes.size());

        //Transformando um ArrayList em um Array e array de String
        Object[] objetos = nomes.toArray();
        String[] nomesArray = nomes.toArray(new String[nomes.size()]);
        String[] nomesArray2 = nomes.toArray(new String[0]);

        ArrayList<String> paises =  new ArrayList<>();
        paises.add("Brasil");
        paises.add("Coreia");

        ArrayList<String> tudo = new ArrayList<>();
        tudo.addAll(nomes);
        tudo.addAll(paises);
        System.out.println(tudo.size());
        System.out.println(nomes.get(0));
        
        nomes.add(0, "php");
        System.out.println(nomes.get(0));
        System.out.println(nomes.get(1));

        nomes.remove(0);
        System.out.println(nomes.get(0));

        nomes.set(0,"scala");
        System.out.println(nomes.get(0));
        System.out.println(nomes.get(1));

        System.out.println(nomes.indexOf("java"));
        System.out.println(nomes.lastIndexOf("java"));
        System.out.println(nomes.indexOf("c#"));

    }
}
