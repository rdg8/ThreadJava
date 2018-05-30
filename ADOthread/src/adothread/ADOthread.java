/*
 * 5. Escreva um programa usando threads que multiplique um vetor por uma constante.
 */
package adothread;

public class ADOthread {
    //contante a ser multiplicada
    static int cont = 5;
    
    //array a ser usado para a multiplicacao
    static double lista[]= {1,5,4,7,8,48,9,53,17,445,48,45};
    
    public static void main(String[] args) {
        //chama o thread e a funcao e inicia a execucao
        new Thread(t1).start();
       
        //chama a funcao sem thread
        noThread();
    }

    //inicia Runnable para processar paralelamente
    private static Runnable t1 = new Runnable() {
        //usado para sobreescrever os metodos pai (Thread)
        @Override
        //metodo run  dentro dele defe ficar com comando que serao executados 
        public void run() {
            //try catch para tratar possiveis erro
            try{
                for(Double numero: lista){
                    //imprimi o resultado da multiplicacao
                    System.out.println("Thread resultado: "+cont*numero);
                }
            } catch (Exception e){
                System.out.println("Erro na execução");
            }
        }
    };
    
    //funcao sem Thread efetua o memso calculo sem usar thread
    public static void noThread(){
            try{
                for(Double numero: lista){
                    System.out.println("No-thread resultado: "+cont*numero);
                }
            } catch (Exception e){}
    }
 

    
}
