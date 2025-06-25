public class Main {
    public static void main(String[] args) {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        ArvoreBinaria<Aluno> arvorealuno = new ArvoreBinaria<>();

        arvorealuno.adicionar(new Aluno("Kaue", 623));
        arvorealuno.adicionar(new Aluno("Nikolas", 308 ));
        arvorealuno.adicionar(new Aluno("Gabriel", 171));
        arvorealuno.adicionar(new Aluno("Mateus", 164));
        arvorealuno.adicionar(new Aluno("Bruno", 01));

        arvore.adicionar(40);
        arvore.adicionar(30);
        arvore.adicionar(60);
        arvore.adicionar(20);
        arvore.adicionar(35);
        arvore.adicionar(50);
        arvore.adicionar(70);
        arvore.mostrarPorNivel();

        System.out.println("\n" + "Árvore está desbalanceada? " + arvore.estaDesbalanceada() + "\n");

        System.out.println("Alunos em ordem (por matrícula):");
        arvorealuno.percorrerEmOrdem();
    }
}