package emresaglam4207.rentACar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import emresaglam4207.rentACar.business.abstracts.BrandService;
import emresaglam4207.rentACar.dataAccess.abstracts.BrandRepository;
import emresaglam4207.rentACar.entities.concretes.Brand;

@Service // Bu sınıf bir business nesnesidir.
public class BrandManager implements BrandService {

	private BrandRepository brandRepository;

	@Autowired
	public BrandManager(BrandRepository brandRepository) { // generate using consc ile yaptık. gevşek bağlı ilerde
															// Hibernate tipinde olabilir
		this.brandRepository = brandRepository;
	}

	@Override
	public List<Brand> getAll() {

		// iş kuralları
		return brandRepository.getAll();
	}

}
