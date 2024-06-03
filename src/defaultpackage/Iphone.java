package defaultpackage;

public abstract class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	
	public void tocar() {
        System.out.println("Tocando música...");
    }
	
    public void pausar() {
        System.out.println("Pausando música.");
    }
    
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }
    
    public void atender() {
        System.out.println("Atendendo ligação");
    }
    
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz.");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba no navegador.");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página.");
    }
}
