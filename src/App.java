public class App {
    public static void main(String[] args) throws Exception {
        int[] vet = {1, 4, 5, 80, 7, 6};
        int aux = 0;
        for(int i = 0; i < vet.length; i++){
            for(int j = 0; j <  (vet.length - 1); j++){
                if(vet[j] >  vet[j + 1]){
                    aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
                for(int k = 0; k < vet.length ; k++){
                    System.out.println(vet[k]);
                }
                System.out.println("------------");
            }
        }
        for(int k = 0; k < (vet.length) ; k++){
            System.out.println(vet[k]);
        }

        System.out.println("-------------");
    }
}

