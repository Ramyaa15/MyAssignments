package week1.day1;

public class Mobilenew {
	public void makeCall()
	{
		String mobileModel ="Apple11";
		float mobileWeight =44.3f;
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
	}
	public void sendMsg() {
		boolean isFullCharged =true;
		int mobileCost =20000;
		System.out.println(isFullCharged);
		System.out.println(mobileCost);
	}

	public static void main(String[] args) {
	  Mobilenew Obj = new Mobilenew();
	  Obj.makeCall();
	  Obj.sendMsg();
	  System.out.println("This is my mobile");

	}
}
