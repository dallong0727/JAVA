package anonymous.basic02;

public class MainClass {

	public static void main(String[] args) {
		
		Computer c = new Computer();
		c.setRemote(new RemoteControl() {
			@Override
			public void volumeUp() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void volumeDown() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turnoff() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}
		});
		c.getRemote().turnOn();
		c.getRemote().volumeUp();
		c.getRemote().volumeDown();
		c.getRemote().turnoff();
	}
}
