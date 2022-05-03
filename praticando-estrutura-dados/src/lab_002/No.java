package lab_002;

/**
 * @author Henrique Santiago
 * Classe que representa os nó da árvore, sendo chave, esquera/direita do tipo NO
 */
public class No {

    private Integer chave;
    private No esquerda;
    private No direita;

    /**
     * Sempre que um No é criado direita e esquerda já são iniciados como nulos
     * @param chave
     */
    public No(Integer chave) {
        this.chave = chave;
        this.esquerda = null;
        this.direita = null;
    }

    public Integer getChave() {
        return chave;
    }

    public void setChave(Integer chave) {
        this.chave = chave;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }

    @Override
    public String toString() {
        return "No{" +
                "chave=" + chave +
                ", esquerda=" + esquerda +
                ", direita=" + direita +
                '}';
    }
}
