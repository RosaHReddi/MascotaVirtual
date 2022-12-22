package modelos;

public class DukeMascota  extends  Mascota {

    //Contador de instancias de esta clase:
    private static int count;

    public DukeMascota(String nombre, String propietario) {
        super(nombre, propietario);
        this.id = ++count;
    }

    public static int getCount() {
        return count;
    }

    public String toString () {
        return "La Mascota de nombre : " + nombre + '\n'
                + "nació el día " + fechaNacimiento.getDayOfWeek() + ", "
                + fechaNacimiento.getDayOfMonth() + " de "
                + fechaNacimiento.getMonth() + " del año "
                + fechaNacimiento.getYear() + '\n'
                + "a la hora : "  + fechaNacimiento.getHour() + ":"
                + fechaNacimiento.getMinute() + '\n'
                + "actualmente se encuentra " + ((isLive) ? "vivo\n" : "muerto\n")
                + "su nivel de Energía se encuentra en : " + nivelEnergia + "%\n"
                + "el nivel de Hambre en : " + nivelHambre + '\n'
                + "el nivel de Cansancio en : " + nivelCansancio + '\n'
                + "el nivel de Felicidad en : " + nivelFelicidad + '\n'
                + "el nivel de Aburrimiento en : " + nivelAburrimiento + '\n'
                + "y su actual propietario es : " + propietario + '\n';


    }

}
