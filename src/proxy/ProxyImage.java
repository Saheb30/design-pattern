package proxy;

public class ProxyImage implements Image {
	private String path;
	private Image realImage;

	public ProxyImage(String path) {
		this.path = path;
	}

	@Override
	public void showImage() {
		realImage = new RealImage(path);
		realImage.showImage();
	}

}
