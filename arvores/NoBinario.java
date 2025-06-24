public class NoBinario<E> implements Posicao<E> {
    private E elemento;
    private NoBinario<E> pai;
    private NoBinario<E> esquerdo;
    private NoBinario<E> direito;

    public NoBinario(E elemento, NoBinario<E> pai) {
        this.elemento = elemento;
        this.pai = pai;
    }

    @Override
    public E getElemento() {
        return elemento;
    }

    public NoBinario<E> getPai() {
        return pai;
    }

    public void setPai(NoBinario<E> pai) {
        this.pai = pai;
    }

    public NoBinario<E> getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(NoBinario<E> esquerdo) {
        this.esquerdo = esquerdo;
    }

    public NoBinario<E> getDireito() {
        return direito;
    }

    public void setDireito(NoBinario<E> direito) {
        this.direito = direito;
    }
}