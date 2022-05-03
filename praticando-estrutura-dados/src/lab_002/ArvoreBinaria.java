package lab_002;

import lab_001.Elemento;

public class ArvoreBinaria {

    /**
     * Raiz da árvore é do tipo NO
     */
    private No root;

    public ArvoreBinaria() {
        this.root = null;
    }

    public No getRoot() {
        return root;
    }

    public void setRoot(No root) {
        this.root = root;
    }

    /**
     * Faz verificação para saber se o nó raiz já foi preenchido, caso
     * não tenha sido cria o mesmo.
     * Caso o nó raiz já existe, passa para o else e executa o adicionarNo passando
     * a raiz da árvore e a chave a ser adicionada;
     *
     * @param chave
     */
    public void adicionar(Integer chave){
        if (this.root == null)
            this.root = new No(chave);
        else
            adicionarNo(this.root, chave);
    }

    /**
     * No primeiro momento recebe o No raiz, posteriormente de forma
     * recursiva pode passar os demais nó;
     *
     * Faz a validação para comparar a chave do No com a chave passada, caso seja menor,
     * valida se já existe No na esquerda, caso existe faz outra chamada de forma recursiva até encontrar o local de adição; (idem para direita)
     * @param no
     * @param chave
     */
    private void adicionarNo(No no, Integer chave){
        if (chave.compareTo(no.getChave())==-1){
            if (no.getEsquerda() == null){ //Verifica se já existe No na esquerda, caso não exista cria o novo Nó
                no.setEsquerda(new No(chave)); //Cria o novo No onde ainda não existe na esquerda
            }else{
                this.adicionarNo(no.getEsquerda(), chave); //Caso existe Nó, faz a chamada recursiva até o valor ser nulo para adição
            }
        }else{
            if (no.getDireita() == null){ //Verifica se já existe No na direita, caso não exista cria o novo Nó
                no.setDireita(new No(chave)); //Cria o novo No onde ainda não existe na direita
            }else{
                this.adicionarNo(no.getDireita(), chave); //Caso existe Nó, faz a chamada recursiva até o valor ser nulo para adição
            }
        }
    }

    /**
     * Inicia na raiz da arvore e de forma recursiva vai descendo os níveis da esquerda
     * em seguida da direita printando os valores da árvore em ordem
     * @param no
     */
    public void emOrdem(No no){
        if (no != null){
            emOrdem(no.getEsquerda());
            System.out.println(no.getChave());
            emOrdem(no.getDireita());
        }
    }

}
