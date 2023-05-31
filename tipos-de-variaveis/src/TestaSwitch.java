public class TestaSwitch {
    public static void main (String[] args){
        Metd2();
    }

    private static void Metd1(){
        int opcao = 4;
        
        switch(opcao){
            case 1:
                System.out.println("OPÇÃO UM");
                break;
            case 2:
                System.out.println("OPÇÃO DOIS");
                break;
            case 3:
                System.out.println("OPÇÃO TRES");
                break;
            default:
                System.out.println("default.");
        }
    }

    private static void Metd2(){
        int opcao = 1;
        // só posso usar uma variavel como parametro se ela tiver como "final", devido ela ser imutavel
        final int variavel = 1;
        switch(opcao){
            case variavel:
                System.out.println("OPÇÃO UM");
                break;
            case 2:
                System.out.println("OPÇÃO DOIS");
                break;
            case 3:
                System.out.println("OPÇÃO TRES");
                break;
        }
    }

}
