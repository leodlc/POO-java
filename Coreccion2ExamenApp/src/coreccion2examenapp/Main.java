package coreccion2examenapp;

public class Main {

    public static void main(String[] args) {
        Veterinario veterinario1 = new Veterinario("Pedro");
        Cliente cliente1 = new Cliente(100, 101010, 2264325, "Marco", "Belisario Quevedo");
        Cliente cliente2 = new Cliente(100, 101010, 2264325, "Javi", "Belisario Quevedo");
        Cliente cliente3 = new Cliente(100, 101010, 2264325, "Paul", "Belisario Quevedo");

        Mascota mascota1 = new Mascota(100, "Osita", "Otros", "Amarrillo", "20 de Mayo del 2020", 20.5F);
        Mascota mascota2 = new Mascota(87, "Toby", "Otros", "Amarrillo", "20 de Mayo del 2020", 20.5F);
        Mascota mascota3 = new Mascota(87, "Lucas", "Collie", "Amarrillo", "20 de Mayo del 2020", 20.5F);
        Historial historial1 = new Historial();
        Historial historial2 = new Historial();
        Historial historial3 = new Historial();

        Enfermedad enfermedad1 = new Enfermedad("Parvovirus", "28 de Noviembre 2021");
        Enfermedad enfermedad2 = new Enfermedad("Rabia", "28 de Noviembre 2021");

        Vacuna vacuna1 = new Vacuna("Moquillo", "10 de Enero del 2020");
        Vacuna vacuna2 = new Vacuna("Rabia", "10 de Enero del 2020");

        veterinario1.agregarPaciente(mascota1);
        veterinario1.agregarPaciente(mascota2);
        veterinario1.agregarPaciente(mascota3);
        //Relaciones
        mascota1.setDueño(cliente1);
        cliente1.adicionarMascota(mascota1);
        cliente1.adicionarMascota(mascota2);

        //Agregar Historial
        mascota1.agregarHistorial(historial1);

        historial1.agregarEnfermedad(enfermedad1);
        historial1.agregarEnfermedad(enfermedad2);
        historial1.agregarVacuna(vacuna1);
        historial1.agregarVacuna(vacuna2);


        mascota1.guardarHistorial();
//        cliente1.mostrarMascotas();

        //Raza dominante
       System.out.println(veterinario1.mostrarRazaDominante());
    }
}
