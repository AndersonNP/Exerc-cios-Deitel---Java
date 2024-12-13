package capitulo9;

public class Employee {
    private String nome;
    private String sobrenome;
    private Long numberPrev;

    Employee(String nome, String sobrenome, Long numberPrev){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numberPrev = numberPrev;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", numberPrev=" + numberPrev +
                '}';
    }

    public Long getNumberPrev() {
        return numberPrev;
    }

    public void setNumberPrev(Long numberPrev) {
        this.numberPrev = numberPrev;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
