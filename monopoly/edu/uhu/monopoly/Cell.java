package edu.uhu.monopoly;

public abstract class Cell implements IOwnable {
	private String name;
	protected Player proprietary;
	private boolean available = true;

	public String getName() {
		return name;
	}

	@Override
	public Player getProprietary() {
		return proprietary;
	}
	
	public int getPrice() {
		return 0;
	}

	public abstract boolean playAction(String msg);

	void setName(String name) {
		this.name = name;
	}

	@Override
	public void setProprietary(Player proprietary) {
		this.proprietary = proprietary;
	}
    
    public String toString() {
        return name;
    }

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
}
