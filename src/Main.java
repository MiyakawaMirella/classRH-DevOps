import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ArrayList<RH> listaFuncionario = new ArrayList();
        RH funcionario1 = new RH("Mirella", "234567890", "11985663143", new Date(), new Date(), "noite");
        funcionario1.toString();

        RH funcionario2 = new RH("Lucas", "324565432", "40028922", new Date(), new Date(), "Manhã");
        funcionario2.toString();

        RH funcionario3 = new RH("João", "2345665433456", "999999900", new Date(), new Date(), "Tarde");
        funcionario3.toString();


        listaFuncionario.add(funcionario1);
        listaFuncionario.add(funcionario2);
        listaFuncionario.add(funcionario3);
    }
}