public class TestEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Ana", 20, 9.5);
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Nota Promedio: " + estudiante.getNotaPromedio());
    }
}
