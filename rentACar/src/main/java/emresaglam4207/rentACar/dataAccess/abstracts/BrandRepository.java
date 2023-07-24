package emresaglam4207.rentACar.dataAccess.abstracts;

import java.util.List;

import emresaglam4207.rentACar.entities.concretes.Brand;

public interface BrandRepository {

	List<Brand> getAll();

}
