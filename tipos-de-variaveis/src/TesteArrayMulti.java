public class TesteArrayMulti {
    public static void main(String[] args){
        
        // multi dimensao
        int[][] tabela;
        //tres dimensoes
        int[][] cubo[];
        // quatro dimensoes
        int[][] hipercubo[][];

        tabela = new int[10][5]; //array de 10 por 5 >> 10 linhas e 5 colunas
        // arrays multi dimensionais sao arrays de arrays.
        cubo = new int[10][][];
        int[][] teste = new int[][]{ {1,2,3},{4,5,6},{7,8,9} };

        int[][] estranho = new int[2][];
        estranho[0] = new int[20];
        estranho[1] = new int[10];

        for(int i=0; i<estranho.length; i++) {
            System.out.println(estranho[i].length);
        }
    }
}
