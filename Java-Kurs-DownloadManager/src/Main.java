
public class Main {

	public static void main(String[] args) {
		
		// DownloadManager downloadManager = new DownloadManager("Test");
		
		String downloadLink = "https://www.freesoundslibrary.com/wp-content/uploads/2021/07/bicycle-bell-ding-sound-effect.mp3";
		
		new Thread(new DownloadManager(downloadLink)).start();
		
		
	}

}
