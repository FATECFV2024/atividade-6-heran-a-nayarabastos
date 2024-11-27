public class Empregado {
    protected String nome;
    protected String endereco;
    protected double salario;

    public Empregado(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public double calcularINSS() {
        if (salario <= 1320) {
            return salario * 0.075;
        } else if (salario <= 2571.29) {
            return (1320 * 0.075) + ((salario - 1320) * 0.09);
        } else if (salario <= 3856.94) {
            return (1320 * 0.075) + (1251.29 * 0.09) + ((salario - 2571.29) * 0.12);
        } else {
            return (1320 * 0.075) + (1251.29 * 0.09) + (1285.65 * 0.12) + ((salario - 3856.94) * 0.14);
        }
    }

    public double calcularIR() {
        if (salario <= 1903.98) {
            return 0;
        } else if (salario <= 2826.65) {
            return salario * 0.075 - 142.80;
        } else if (salario <= 3751.05) {
            return salario * 0.15 - 354.80;
        } else if (salario <= 4664.68) {
            return salario * 0.225 - 636.13;
        } else {
            return salario * 0.275 - 869.36;
        }
    }

    public void imprimir() {
        System.out.println(String.format("EMPREGADO: %-20s", nome));
        System.out.println(String.format("ENDEREÇO: %-25s", endereco));
        System.out.println(String.format("SALÁRIO BRUTO: R$ %,10.2f", salario));
        System.out.println(String.format("INSS: R$ %,10.2f", calcularINSS()));
        System.out.println(String.format("IRPF: R$ %,10.2f", calcularIR()));
        System.out.println(String.format("SALÁRIO LÍQUIDO: R$ %,10.2f", (salario - calcularINSS() - calcularIR())));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }
}
