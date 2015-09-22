package factory;

import repository.Repository;

public class RepositoryFactory {
	
	private static Repository repository = null;
	
	public static Repository getInstance() {
		
		if (repository == null) {
			repository = new Repository();				
		}
		
		return repository;
	}
}