public class Franchise {
	private Store stores[];
	
	public Franchise(int num) {
			stores = new Store[num];
	}

	public Store getStores(int i) {
		return stores[i];
	}

	public void setStores(Store stores, int i) {
		this.stores[i] = stores;
	}
	public int numberofstores()
	{
		return stores.length;
	}
	public void computeData() {
		//for loop to calculate the values of each store
		for (int i=0; i<stores.length; i++) {
			stores[i].analyzeresults();
		}
	}
}
