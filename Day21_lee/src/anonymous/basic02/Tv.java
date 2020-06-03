package anonymous.basic02;

public class Tv {
	
	private int volume;
	private RemoteControl remote;
	
	//게터 세터
	public RemoteControl getRemote() {
		return remote;
	}
	public void setRemote(RemoteControl remote) {
		this.remote = remote;
	}
	
	public Tv() {
		//remote타입을 Tv에 알맞게 익명객체 방법으로 초기화 해주세요.
		
		remote = new RemoteControl() {
			public void volumeUp() {
				volume ++;
				System.out.println("현재 볼륨은 " + volume);
				
			}
			
			@Override
			public void volumeDown() {
				volume --;
				System.out.println("현재 볼륨은 " + volume);
			}
			
			@Override
			public void turnoff() {
				System.out.println("TV를 끕니다.");
				
			}
			
			@Override
			public void turnOn() {
				System.out.println("TV를 켭니다.");
				
			}
		};
	}
}
