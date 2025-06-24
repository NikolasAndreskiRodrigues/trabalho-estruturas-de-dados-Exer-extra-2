public class Main {
    public static void main(String[] args) {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();

        arvore.adicionar(40);
        arvore.adicionar(30);
        arvore.adicionar(60);
        arvore.adicionar(20);
        arvore.adicionar(35);
        arvore.adicionar(50);
        arvore.adicionar(70);
        arvore.mostrarPorNivel();

        System.out.println("\n" + "Árvore está desbalanceada? " + arvore.estaDesbalanceada() + "\n");
    }

}