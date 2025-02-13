public class MinhaRunnableThread implements Runnable {
    @Override
    public void run(){
        System.out.println("Minha Runnable Thread executando: " + 1);
        try{
            Thread.sleep(1000); // espera 1 segundo
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
