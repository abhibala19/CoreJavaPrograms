package Interface;

public interface Transmitter {
void transmit(String data);
}
interface Receiver
{
	String receive();
}
class FMTransmitter implements Transmitter
{
	public void transmit(String data)
	{
		System.out.println(" i am FM tx transmitting "+data);
	}
}
class AMTransmitter implements Transmitter
{
	public void transmit(String data)
	{
		System.out.println(" i am AM tx transmitting "+data);
	}
}
class FMReceiver implements Receiver
{
	public String receive()
	{
		System.out.println(" i am FMReceiver ");
		return "message received through Fm";
	}
}
class AMReceiver implements Receiver
{
	public String receive()
	{
		System.out.println(" i am AMReceiver ");
		return "message received through Am";
	}
}


class WalkyTalky
{
	Transmitter tx;
	Receiver rx;
	public WalkyTalky(Transmitter t,Receiver r)
	{
		tx=t;
		rx=r;
	}
	public void transmit(String data)
	{
		tx.transmit(data);
	}
	public String receive()
	{
		return rx.receive();
	}
}
