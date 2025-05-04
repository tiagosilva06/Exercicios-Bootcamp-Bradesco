public class Iphone implements MusicPlayer, TelephoneDevice, InternetBrowser {
	
	@Override
	public void displayPage(String url) {
		System.out.println("Exibindo a página: " + url);
		
	}

	@Override
	public void addNewTab() {
		System.out.println("Adicionando uma nova aba.");
		
	}

	@Override
	public void updatePage() {
		System.out.println("Atualizando pagina..");
		
	}

	@Override
	public void call(String number) {
		System.out.println("Ligando para o numero: " + number);
		
	}

	@Override
	public void aswerCall() {
		System.out.println("Atendendo ligação.");
		
	}

	@Override
	public void startVoiceMail() {
		System.out.println("Iniciando correio de voz.");
		
	}

	@Override
	public void startMusic() {
		System.out.println("Tocando música.");
		
	}

	@Override
	public void pauseMusic() {
		System.out.println("Música pausada.");
		
	}

	@Override
	public void chooseMusic(String music) {
		System.out.println("Selecionando a música: " + music);
		
	}

}
