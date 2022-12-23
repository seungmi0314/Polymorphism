package edu.kh.poly.model.vo;

public class Spark extends Car { // 경차 // 자식2

	private double discountOffer;	// 할인혜택
	
	// 기본생성자
	public Spark() {}	// super() 생략 시 컴파일러가 자동 추가

	// 매개변수 생성자 (상속버전)
	public Spark(String engine, String fuel, int wheel, double discontOffer) {
		super(engine, fuel, wheel); // 부모꺼
		this.discountOffer = discountOffer;
	}

	public double getDiscountOffer() {
		return discountOffer;
	}

	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}
	
	public String toString() {
		return super.toString() + " / " + discountOffer;
	}
	
}
