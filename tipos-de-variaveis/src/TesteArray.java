public class TesteArray {
    
    public static void main (String[] args){
        
        int[] idades = new int[]{0,2,4,6,8};

       idades[4] = 10;

        System.out.print(idades[4]);

        for ( int i = 0; i < idades.length; i++ ){
            System.out.print(idades[i]);
        }

        for( int idade : idades ){
            System.out.print( idade );
        }

    }

}
