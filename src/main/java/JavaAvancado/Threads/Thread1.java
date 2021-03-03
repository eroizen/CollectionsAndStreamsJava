package JavaAvancado.Threads;

public class Thread1 {
    public static void main(String[] args) {
        GerarPDF iniciaGeraPDF = new GerarPDF();
        BarraDeCarregamento iniciaBarraDeCarregamento = new BarraDeCarregamento(iniciaGeraPDF);
        iniciaGeraPDF.start();
        iniciaBarraDeCarregamento.start();
    }
}
class GerarPDF extends Thread{
    @Override
    public void run(){
        try {
            System.out.println("Gerando PDF. Aguarde!");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("PDF Gerado!!!");
    }
}
class BarraDeCarregamento extends Thread{
    private Thread GerarPDF;
    public BarraDeCarregamento(Thread GerarPDF) {
        this.GerarPDF = GerarPDF;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
                if(!GerarPDF.isAlive()) {
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Loading...");
        }

    }
}
//class Barra1 extends Thread{
//    @Override
//    public void run(){
//        super.run();
//        System.out.println("Rodei "+this.getName());
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}