package lab_001;

public class Arvore<TIPO extends Comparable> {

    private Elemento<TIPO> raiz;

    public Arvore() {
        this.raiz = null;
    }

    public Elemento<TIPO> getRaiz() {
        return raiz;
    }

    public void setRaiz(Elemento<TIPO> raiz) {
        this.raiz = raiz;
    }

    public void adicionar(TIPO novoValor){
        Elemento<TIPO> novoElemento = new Elemento<TIPO>(novoValor);
        if (this.raiz == null){
            this.raiz = new Elemento<>(novoValor);
        }else {
            Elemento<TIPO> atual = this.raiz;
            while(true){
                if (novoElemento.getValor().compareTo(atual.getValor())==-1){
                    if (atual.getEsquerda() != null){
                        atual = atual.getEsquerda();
                    }else{
                        atual.setEsquerda(novoElemento);
                        break;
                    }
                }else{
                    if (atual.getDireita() != null){
                        atual = atual.getDireita();
                    }else{
                        atual.setDireita(novoElemento);
                        break;
                    }
                }
            }
        }
    }

    public void emOrdem(Elemento<TIPO> atual){
        if (atual != null){
            emOrdem(atual.getEsquerda());
            System.out.println(atual.getValor());
            emOrdem(atual.getDireita());
        }
    }

    @Override
    public String toString() {
        return "Arvore{" +
                "raiz=" + raiz +
                '}';
    }
}
