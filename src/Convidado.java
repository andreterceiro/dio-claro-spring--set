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

}
