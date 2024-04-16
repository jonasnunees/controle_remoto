//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        ControleRemoto controle = new ControleRemoto(50, true, false);

        controle.ligar();
        controle.abrirMenu();

    }

}