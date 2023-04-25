import java.util.ArrayList;
import java.util.Date;

public class Teste {

    public static void main (String[] args) {
        ArrayList<String> funcionariosA = new ArrayList<String>();
        funcionariosA.add("Ana Clara Zampier");
        funcionariosA.add("23456754");
        funcionariosA.add("34567890");
        funcionariosA.add("Noite");


        RH funcionarioNovo = new RH(funcionariosA.get(0), funcionariosA.get(1), funcionariosA.get(2), new Date(), new Date(), funcionariosA.get(3));

        funcionarioNovo.toString();
    }


}
