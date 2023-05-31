public class Operadores {

    public static void main(String[] args) {

        // Executando o primeiro metodo
        // Operadores01();

        // Executando o segundo metodo
        // Operadores02();
    }

    public static void Operadores01() {
        String fullName = "Linguagem" + "Java";
        System.out.print(fullName);
    }

    public static void Operadores02() {
        String concatenacao = "?";
        System.out.println(concatenacao);

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);
    }
}
