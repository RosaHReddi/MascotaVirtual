package acciones;



import enumeradores.AlmacenAlimentos;
import modelos.Mascota;

public class Alimentarse {

    private AlmacenAlimentos comida;

    public void ingerirAlimento(AlmacenAlimentos comida , Mascota mascota) {

        if (mascota.isLive()) {

            System.out.println("status mascota1: " + mascota.isLive());

            mascota.setNivelEnergia(mascota.getNivelEnergia() + comida.getEnergiaAportada());
            contabilizarComida(mascota);
            System.out.println("comidas ingeridas : " + mascota.getComidasIngeridas());
            System.out.println("nivel de energía de la msacota:" + mascota.getNivelEnergia());
            System.out.println("status mascota2: " + mascota.isLive());
            System.out.println("debe evacuar la mascota " + mascota.getPopo().tieneQueEvacuar(mascota));
            if (mascota.getPopo().tieneQueEvacuar(mascota)){
                System.out.println("pasé por acá restando - 15");
                mascota.setNivelEnergia(mascota.getNivelEnergia() - 15);

                System.out.println("status mascota3: " + mascota.isLive());

                Morir.checkStatusGeneral(mascota);
                if (mascota.isLive()) {
                    System.out.println("Esta mascota necesita ir al baño1");
                }

            } else{
                Morir.checkStatusGeneral(mascota);

                System.out.println("Esta mascota necesita ir al baño2");
            }
        } else {
            Morir.checkStatusGeneral(mascota);
            System.out.println("Lo siento, esta mascota no se encuentra operativa desde " + mascota.getFechaMuerte().toLocalDate());
        }

    }

    private void contabilizarComida(Mascota mascota) {
        mascota.setComidasIngeridas(mascota.getComidasIngeridas() + 1);
    }

}
