package E03.Tarea1;

// Clase derivada Gerente
class Gerente extends Empleado {

    // Constructor para inicializar el nombre y salario
    public Gerente(String nombre, double salario) {
        super(nombre, salario);
    }

    // Sobrescribir el método calcularBono() para un bono del 15%
    @Override
    public double calcularBono() {
        return salario * 0.15;
    }
}
