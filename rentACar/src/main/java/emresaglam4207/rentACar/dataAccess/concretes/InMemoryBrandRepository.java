package emresaglam4207.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import emresaglam4207.rentACar.dataAccess.abstracts.BrandRepository;
import emresaglam4207.rentACar.entities.concretes.Brand;

@Repository //bu sınıf bir dataAccess nesnesidir.
public class InMemoryBrandRepository implements BrandRepository {

	List<Brand> brands; // bu brand'i bilerek buraya yazdık ki daha globalde erişebilelim diye

	public InMemoryBrandRepository() {
		brands = new ArrayList<Brand>();
		brands.add(new Brand(1, "BMW"));
		brands.add(new Brand(2, "Mercedes"));
		brands.add(new Brand(3, "Audi"));
		brands.add(new Brand(4, "Fiat"));
		brands.add(new Brand(5, "Renault"));
	}

	@Override
	public List<Brand> getAll() {

		return brands;
	}

}
