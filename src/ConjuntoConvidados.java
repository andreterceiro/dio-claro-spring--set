import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    public Set<Convidado> convidadosSet;

    /**
     * Constructor, that puts an empty HashSet in the property this.convidadosSet
     */
    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    /**
     * Allow adding a Convidado to this.conjuntoConvidados
     * 
     * @param nome          Name of the Convidado
     * @param codigoConvite Code of the invite
     */
    public void adicionarConvidado(String nome, int codigoConvite) {
        this.convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    /**
     * Allow remove a Convidado based on his codigoConvite
     * 
     * @param codigoConvite Invite code related to the Convidado to be removed
     */
    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;

        for (Convidado convidado: this.convidadosSet) {
            if (convidado.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = convidado;
                break;
            }
        }
        this.convidadosSet.remove(convidadoParaRemover);
    }

    /**
     * Returns the size ot this.convidadosSet
     * 
     * @return Returns the size ot this.convidadosSet
     */
    public int contarConvidados() {
        return this.convidadosSet.size();
    }

    /**
     * Prints in the standard output this.convidadosSet 
     */
    public void exibirConvidados() {
        System.out.println(this.convidadosSet);
    }
}