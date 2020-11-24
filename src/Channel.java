import java.util.*;

public class Channel implements Subject{
	
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private String channelName;
	private String status;
	
	public Channel(String channelName, String status) {
		super();
		this.channelName = channelName;
		this.status = status;
	}

	
	 
	
	
	

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	
	public String getChannelName() {
		return channelName;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void notifyObservers() {
		for(Observer o: observers) {
			o.update(status);
		}
	}

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

}
