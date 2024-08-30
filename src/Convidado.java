import java.util.Objects;

public class Convidado {
    /**
     * Nome do concidado
     */
    private String nome;

    /**
     * Código do convite do convidado
     */
    private int codigoConvite;

    /**
     * Consrtutor
     * 
     * @param nome          Nome do convidado
     * @param codigoConvite Código do convite do convidado
     */
    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    /**
     * Getter de this.nome
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Getter de this.codigoConvite
     */
    public int getCodigoConvite() {
        return this.codigoConvite;
    }

    /**
     * Método usado por exemplo quando o objeto é transformado em uma string
     */
    @Override
    public String toString() {
        return "{Convidado: nome='" + this.getNome() + "', código do convite='" + String.valueOf(this.getCodigoConvite()) + "'}";
    }

    /**
     * Método para comparação de dois objetos desta classe
     */
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        Convidado other = (Convidado) object;
        return other.getCodigoConvite() == this.getCodigoConvite();
    }

    /**
     * The hashCode method helps the comparison of two objects of this class
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.getCodigoConvite());
    }

}
