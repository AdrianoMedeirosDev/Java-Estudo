package section10Comportamento.vetores.desafio_pensionato.entities;

public class Pensionato {
    private String name;
    private String email;
    private int quarto;

    public Pensionato(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String toString(int quarto, String name, String email) {
        return quarto + ": " + name + ", " + email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getQuarto() {
        return quarto;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }
}
