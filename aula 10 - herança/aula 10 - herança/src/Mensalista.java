public class Mensalista extends Empregado {
    private String cargo;

    public Mensalista(String nome, String endereco, String cargo) {
        super(nome, endereco);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void calcularSalario() {
        switch (cargo) {
            case "Junior":
                salario = 2500;
                break;
            case "Pleno":
                salario = 3500;
                break;
            case "Senior":
                salario = 6000;
                break;
            default:
                System.out.println("Cargo inválido!");
                salario = 0;
                break;
        }
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println(String.format("CARGO: %-20s", cargo));
        System.out.println(String.format("TIPO: %-20s", "Mensalista"));
    }
}
