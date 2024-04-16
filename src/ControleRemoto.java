public class ControleRemoto implements Controlador {

    // atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // método construtor
    public ControleRemoto(int volume, boolean ligado, boolean tocando){
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }

    // métodos getters
    public int getVolume(){
        return volume;
    }

    public boolean getLigado(){
        return ligado;
    }

    public boolean getTocando(){
        return tocando;
    }

    // métodos setters
    public void setVolume(int volume){
        this.volume = volume;
    }

    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    public void setTocando(boolean tocando){
        this.tocando = tocando;
    }

    // métodos abstratos
    @Override
    public void ligar(){
        if(!this.getLigado()){
            this.setLigado(true);
        }
    }

    @Override
    public void desligar(){
        if(this.getLigado()){
            this.setLigado(false);
        }
    }

    @Override
    public void abrirMenu(){
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        if(this.getLigado()){
            System.out.print("Volume " + this.getVolume());
            for(int i = 0; i <= this.getVolume(); i += 10){
                System.out.print(" | ");
            }
        }
    }

    @Override
    public void fecharMenu(){
        System.out.println("Fechando o Menu...");
    }

    @Override
    public void aumentarVolume(){
        if(this.getLigado() && this.getVolume() > 0 && this.getVolume() < 100){
            this.setVolume(this.getVolume() + 1);
        }
    }

    @Override
    public void diminuirVolume(){
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(this.getVolume() - 1);
        }
    }

    @Override
    public void ativarMudo(){
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desativarMudo(){
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play(){
        if(this.getLigado() && !this.getTocando()){
            this.setTocando(true);
        }
    }

    @Override
    public void pause(){
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }

}
