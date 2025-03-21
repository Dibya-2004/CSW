 package Assignment1;
class Image{
	int imagewidth,imageHeight,colorCode;
	Image(int w,int h,int c){
		imagewidth=w;
		imageHeight=h;
		colorCode=c;
	}
	Image(){}
	public int getImagewidth() {
		return imagewidth;
	}
	public void setImagewidth(int imagewidth) {
		this.imagewidth = imagewidth;
	}
	public int getImageHeight() {
		return imageHeight;
	}
	public void setImageHeight(int imageHeight) {
		this.imageHeight = imageHeight;
	}
	public int getColorCode() {
		return colorCode;
	}
	public void setColorCode(int colorCode) {
		this.colorCode = colorCode;
	}
	@Override
	public String toString() {
		return "Image [imagewidth=" + imagewidth + ", imageHeight=" + imageHeight + ", colorCode=" + colorCode + "]";
	}
	
}
public class A4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Image i1=new Image();
		Image i2=new Image(10,5,10);
		System.out.println(i1);
		System.out.println(i2);
	}
}
