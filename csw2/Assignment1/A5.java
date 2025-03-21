package Assignment1;
import java.util.ArrayList;
import java.util.List;

class ImageLibrary{
	private List<Image> images;
	public ImageLibrary() {
		images = new ArrayList();
	}
	public void addImage(Image image) {
		images.add(image);
	}
	public Image searchImage(int w, int h, int c) {
		for(Image img : images) {
			if(img.getImagewidth()==w && img.getImageHeight()==h && img.getColorCode()==c) {
				return img;
			}
		}
		return null;
	}
	public Image getImage(int index) {
		if(index >=0 &&index < images.size()) {
			return images.get(index);
		}
		return null;
	}
	public void displayImages() {
		for(Image img : images) {
			System.out.println(img);
		}
	}
}
public class A5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Image img1=new Image();
		Image img2=new Image(1920 , 1080, 2);
		ImageLibrary l=new ImageLibrary();
		l.addImage(img1);
		l.addImage(img2);
		System.out.println("All Images in Library");
		l.displayImages();
		
		Image searchResult=l.searchImage(1920,1080,2);
		if(searchResult!=null) {
			System.out.println("\nImage Found : "+searchResult);
		}
		else {
			System.out.println("\nImage not Found");
		}
	}
}
