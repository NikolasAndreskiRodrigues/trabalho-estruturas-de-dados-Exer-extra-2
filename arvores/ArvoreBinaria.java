public class ArvoreBinaria<E extends Comparable<E>> {
    private NoBinario<E> raiz;
    private int quantidade = 0;

    public NoBinario<E> obterRaiz() {
        return raiz;
    }

    public int tamanho() {
        return quantidade;
    }

    public void adicionar(E valor) {
        raiz = adicionarRec(raiz, valor, null);
    }

    private NoBinario<E> adicionarRec(NoBinario<E> atual, E valor, NoBinario<E> pai) {
        if (atual == null) {
            quantidade++;
            return new NoBinario<>(valor, pai);
        }

        if (valor.compareTo(atual.getElemento()) < 0) {
            atual.setEsquerdo(adicionarRec(atual.getEsquerdo(), valor, atual));
        } else {
            atual.setDireito(adicionarRec(atual.getDireito(), valor, atual));
        }

        return atual;
    }

    public boolean contem(E valor) {
        return contemRec(raiz, valor);
    }

    private boolean contemRec(NoBinario<E> no, E valor) {
        if (no == null) return false;
        int cmp = valor.compareTo(no.getElemento());
        if (cmp == 0) return true;
        if (cmp < 0) return contemRec(no.getEsquerdo(), valor);
        return contemRec(no.getDireito(), valor);
    }

    public void mostrarPorNivel() {
        if (raiz == null) {
            System.out.println("Árvore está vazia.");
            return;
        }

        int altura = altura(raiz);
        for (int nivel = 0; nivel < altura; nivel++) {
            System.out.print("Nível " + nivel + ": ");
            imprimirNivel(raiz, nivel);
            System.out.println();
        }
    }

    private int altura(NoBinario<E> no) {
        if (no == null) return 0;
        int altEsq = altura(no.getEsquerdo());
        int altDir = altura(no.getDireito());
        return 1 + Math.max(altEsq, altDir);
    }

    private void imprimirNivel(NoBinario<E> no, int nivel) {
        if (no == null) return;
        if (nivel == 0) {
            System.out.print(no.getElemento() + " ");
        } else {
            imprimirNivel(no.getEsquerdo(), nivel - 1);
            imprimirNivel(no.getDireito(), nivel - 1);
        }
    }

    public boolean estaDesbalanceada() {
        return alturaDesbalanceada(raiz) == -1;
    }

    private int alturaDesbalanceada(NoBinario<E> no) {
        if (no == null) return 0;
        int altEsq = alturaDesbalanceada(no.getEsquerdo());
        int altDir = alturaDesbalanceada(no.getDireito());
        if (altEsq == -1 || altDir == -1) return -1;
        if (Math.abs(altEsq - altDir) > 1) return -1;
        return 1 + Math.max(altEsq, altDir);
    }

    public void percorrerEmOrdem() {
    percorrerEmOrdem(raiz);
    }
    
    private void percorrerEmOrdem(NoBinario<E> no) {
    if (no != null) {
        percorrerEmOrdem(no.getEsquerdo());
        System.out.println(no.getElemento());
        percorrerEmOrdem(no.getDireito());
        }
    }
}
