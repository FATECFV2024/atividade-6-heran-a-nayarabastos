public class App {
    public static void main(String[] args) throws Exception {
        Mensalista m1 = new Mensalista("José", "Rua abc", "Junior");
        Horista h1 = new Horista("Maria", "Rua 23 de Maio", 10);

        m1.calcularSalario();
        m1.imprimir();

        h1.calcularSalario();
        h1.imprimir();
    }
}
