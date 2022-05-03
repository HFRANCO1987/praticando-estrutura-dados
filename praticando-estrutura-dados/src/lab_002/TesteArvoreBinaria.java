package lab_002;

public class TesteArvoreBinaria {

    public static void main(String[] args) {

        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
        arvoreBinaria.adicionar(10);
        arvoreBinaria.adicionar(5);
        arvoreBinaria.adicionar(1);
        arvoreBinaria.adicionar(6);
        arvoreBinaria.adicionar(19);
        arvoreBinaria.adicionar(17);
        arvoreBinaria.adicionar(21);

        arvoreBinaria.emOrdem(arvoreBinaria.getRoot());

    }

}
