package anonymous.basic02;

public class Computer {
	
	//멤버변수
	private int sound;
	private RemoteControl remote;
	
	//생성자
	public Computer() {

		remote = new RemoteControl() {
			
			public void volumeUp() {
				sound++;
				System.out.println("컴퓨터의 볼륨 : " + sound);
			}
			
			public void volumeDown() {
				sound--;
				System.out.println("컴퓨터의 볼륨 : " + sound);
			}
			
			public void turnoff() {
				System.out.println("컴퓨터를 켭니다.");
			}
			
			public void turnOn() {
				System.out.println("컴퓨터를 끕니다.");				
			}
		};
		
		
	}

	public int getSound() {
		return sound;
	}

	public void setSound(int sound) {
		this.sound = sound;
	}

	public RemoteControl getRemote() {
		return remote;
	}

	public void setRemote(RemoteControl remote) {
		this.remote = remote;
	}

		
}
