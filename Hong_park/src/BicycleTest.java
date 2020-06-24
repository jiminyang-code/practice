
public class BicycleTest {

	public static void main(String[] args) {
		//객체생성및 초기화
		bicycle b1 = new bicycle("부릉2",21.74,899000);
		bicycle b2 = new bicycle("씽씽2",12.57,495000);
		
		//객체정보출력
        System.out.printf("bicycle {%s, %.2fkg, %d원}\n", b1.name,b1.weight,b1.price);
	    System.out.printf("bicycle {%s, %.2fkg, %d원}\n",b2.name,b2.weight,b2.price);
	}

}

class bicycle {
	//필드
	String name;
	double weight;
	int price;
	
	//생성자 -- 파라미터를 통한 초기화
	bicycle(String n,double w,int p) {
		name = n;
		weight = w;
		price = p;	
	}
}