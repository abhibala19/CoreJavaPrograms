package Interface;

public class TestWalkyTalky {
public static void main(String[] args) {
	Transmitter t1=new FMTransmitter();
	Transmitter t2=new AMTransmitter();
	Receiver r1=new FMReceiver();
	Receiver r2=new AMReceiver();
	WalkyTalky w1=new WalkyTalky(t1, r2);
	WalkyTalky w2=new WalkyTalky(t2, r1);
	w1.transmit("hey,hi how are you ?");
	w2.transmit("hey,hi how are yo? ,how is going?");
	System.out.println(w1.receive());

	System.out.println(w2.receive());

}

}
