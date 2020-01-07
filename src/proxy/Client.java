package proxy;

public class Client {
	public static void main(String[] args) {
		// assuming that the user selects a folder that has 3 images	
		//create the 3 images 	
		Image proxyImage1 = new ProxyImage("sample/veryHighResPhoto1.jpeg");
		Image proxyImage2 = new ProxyImage("sample/veryHighResPhoto2.jpeg");
		Image proxyImage3 = new ProxyImage("sample/veryHighResPhoto3.jpeg");
		
		// assume that the user clicks on Image one item in a list
		// this would cause the program to call showImage() for that image only
		// note that in this case only image one was loaded into memory
		proxyImage1.showImage();
		
		// consider using the high resolution image object directly
		Image realImage1 = new RealImage("sample/veryHighResPhoto1.jpeg");
		Image realImage2 = new RealImage("sample/veryHighResPhoto2.jpeg");
		Image realImage3 = new RealImage("sample/veryHighResPhoto3.jpeg");
		
		
		// assume that the user selects image two item from images list
		realImage1.showImage();
		
		// note that in this case all images have been loaded into memory 
		// and not all have been actually displayed
		// this is a waste of memory resources
	}
}
