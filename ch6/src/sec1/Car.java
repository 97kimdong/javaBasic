package sec1;

import java.util.Scanner;

public class Car {
	Scanner sc = new Scanner(System.in);
	private String name;
	private String style;
	private String company;
	private String fuel;
	private int tire;
	private int speed;
	private int num;
	private int usetime;
	private int fee = 3000;
	private int fuelfee = 3000;
	private int fueltime;
	
	Car(){
		this("제네시스");
	}
	Car(String name){
		this(name,"승용차");
	}
	Car(String name, String style){
		this(name, style, "현대");
	}	
	Car(String name, String style, String company){
		this(name, style, company, "휘발유");
	}	
	Car(String name, String style, String company, String fuel){
		this(name, style, company, fuel, 4);
	}	
	Car(String name, String style, String company, String fuel, int tire){
		this(name, style, company, fuel, tire,0);
	}	
	Car(String name, String style, String company, String fuel, int tire, int speed){
		this(name, style, company, fuel, tire, speed,7777);
	}	
	Car(String name, String style, String company, String fuel, int tire, int speed, int num){
		this(name, style, company, fuel, tire, speed, num, 1);
	}
	Car(String name, String style, String company, String fuel, int tire, int speed, int num, int usetime){
			this.name = name;
			this.style = style;
			this.company = company;
			this.fuel = fuel;
			this.tire = tire;
			this.speed = speed;
			this.num = num;
			this.usetime = usetime;
			
	}
	
	public void computeMoney() {
		System.out.println("주차 시간을 입력하시오 : ");
		usetime = sc.nextInt();
		System.out.println("요금 : "+(usetime*fee));
		
	}
	public int computeMoney(int usetime) {
		return usetime*this.fee;
	}
	public int computeMoney(int usetime, int fee) {
		return usetime*fee;
	}
	public void computeFue() {
		System.out.println("주유 시간을 입력하시오 : ");
		fueltime = sc.nextInt();
		System.out.println("요금 : "+(fueltime*fuelfee));
	}
	public int computeFue(int fueltime) {
		return fueltime*this.fuelfee;
	}
	public int computeFue(int fueltime, int fuelfee) {
		return fueltime*fuelfee;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getTire() {
		return tire;
	}
	public void setTire(int tire) {
		this.tire = tire;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getUsetime() {
		return usetime;
	}
	public void setUsetime(int usetime) {
		this.usetime = usetime;
	}
}
