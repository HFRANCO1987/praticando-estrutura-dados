package lab_001;

public class TesteArvore {

    public static void main(String[] args) {

        Arvore<Integer> arvore = new Arvore<Integer>();
        arvore.adicionar(10);
        arvore.adicionar(5);
        arvore.adicionar(1);
        arvore.adicionar(6);
        arvore.adicionar(19);
        arvore.adicionar(17);
        arvore.adicionar(21);

        arvore.emOrdem(arvore.getRaiz());



    }

}
