package edu.kh.poly.model.vo;

public class Tesla extends Car { //전기차 // 자식1
	// Car를 상속받을 수 있도록! => extends Car(부모)
	
	private int betteryCapacity;	// 배터리 용량
	
	public Tesla() {  // ctrl + space + enter
		super();	// Car
	}

	
	// alt + shift + s + o + 드롭박스 안에 매개변수 들어있는거로 바꾸고 엔터
	public Tesla(String engine, String fuel, int wheel, int betteryCapacity) {
		super(engine, fuel, wheel);  // 상속받은 부모값도 합쳐서 만듦
		this.betteryCapacity = betteryCapacity;
	}


	public int getBetteryCapacity() {
		return betteryCapacity;
	}


	public void setBetteryCapacity(int betteryCapacity) {
		this.betteryCapacity = betteryCapacity;
	}
	
	// Car.toString() 오버라이딩
	@Override  
	public String toString() {
		return super.toString() + " / " + betteryCapacity;
	}		//(super 참조변수)
	



}
