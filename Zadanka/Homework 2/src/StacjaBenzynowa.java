import java.util.*;

public class StacjaBenzynowa {
    public static void main(String[] args) {
        PompaPaliwa dystrybutor1 = new PompaPaliwa();
//        dystrybutor1.setCenaPaliwa(10);
//
//        System.out.println(dystrybutor1.getCenaPaliwa());
//
//        dystrybutor1.mojeHaslo.setNewPassword();
//        dystrybutor1.setCenaPaliwa(10);

        dystrybutor1.tankowanie();
        System.out.println(dystrybutor1.getRachunek());
        System.out.println(dystrybutor1.getIlePaliwa());

    }
}
