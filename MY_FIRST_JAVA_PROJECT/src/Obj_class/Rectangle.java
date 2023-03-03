package Obj_class;

public class Rectangle {
    private int length,width;
	void setLength(int l){
		length=l;
	}
	void setWidth(int w){
		width=w;
	}
	int  getLength(){
		return length;
	}
	int getWidth(){
		return width;
	}
    	int findArea(){
    		return length*width;
    }
}

