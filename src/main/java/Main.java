import enumeradores.AlmacenAlimentos;
import enumeradores.EntretenimientosEnum;
import modelos.Mascota;
import modelos.DukeMascota;
import modelos.BirritaMascota;
import persistencia.persistenceCollections.MascotaPersistenceUseList;
import utils.actas.RegistroCivilMascotas;

import java.time.LocalDateTime;
import java.time.LocalTime;

class Main {

    public static void main(String[] args) {

        //   DukeMascota duke = new DukeMascota( "Duke-Merlina" , "Semper");
        //   System.out.println(duke);

        //   BirritaMascota birrita = new BirritaMascota( "Gatita-Birrita" , "Yami");

        //   System.out.println(birrita);

        MascotaPersistenceUseList persistence = new MascotaPersistenceUseList();

        DukeMascota duke = new DukeMascota("Duke-Merlina", "Semper");

        DukeMascota duke2 = new DukeMascota("Duke-Cordobes", "Semper");

        DukeMascota duke3 = new DukeMascota("Duke-Porteño", "Semper");

        DukeMascota duke4 = new DukeMascota("Duke-Litoral", "Semper");

        //BirritaMascota birrita = new BirritaMascota( "Birrita" , "Yami");


        persistence.guardar(duke);

        persistence.guardar(duke2);

        persistence.guardar(duke3);

        persistence.guardar(duke4);


        //    persistence.guardar(birrita);


        duke.comer(AlmacenAlimentos.PORORO);
        duke.comer(AlmacenAlimentos.PORORO);
        duke.comer(AlmacenAlimentos.PORORO);
        duke.comer(AlmacenAlimentos.PORORO);
        duke.comer(AlmacenAlimentos.PORORO);
        duke.comer(AlmacenAlimentos.PORORO);
        duke.comer(AlmacenAlimentos.PORORO);
        duke.comer(AlmacenAlimentos.PORORO);
        duke.comer(AlmacenAlimentos.PORORO);
        duke.comer(AlmacenAlimentos.PORORO);
        //    duke.setLive(false);
        //    duke.setFechaMuerte(LocalDateTime.now());
        RegistroCivilMascotas.confeccionarActa(duke);
        RegistroCivilMascotas.guardarActa(duke);

        //  System.out.println("el número de mascotas es: " + DukeMascota.getCount());

        //  for (Mascota mascota : persistence.getAllMascotas()) {


        //System.out.println(mascota);

        //System.out.println(mascota.getNombre());


        //    }
        //System.out.println("antes de comer " + duke.getNivelEnergia());
        //duke.comer(AlmacenAlimentos.ASADO);
        //System.out.println("después de comer " + duke.getNivelEnergia());

        //duke.jugar(EntretenimientosEnum.POKER);
        //duke.jugar(EntretenimientosEnum.PASEAR);
        //duke.jugar(EntretenimientosEnum.PERINOLA);
        //duke.jugar(EntretenimientosEnum.BAILAR);
        //duke.jugar(EntretenimientosEnum.BAILAR);


        //System.out.println("antes de dormir " + duke.getNivelEnergia());
        // duke.dormir(LocalTime.of(0 , 25));
        // System.out.println("después de dormir " + duke.getNivelEnergia());

        //System.out.println(duke.irAlBaño());

    }
}
