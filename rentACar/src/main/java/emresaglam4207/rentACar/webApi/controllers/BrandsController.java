package emresaglam4207.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import emresaglam4207.rentACar.business.abstracts.BrandService;
import emresaglam4207.rentACar.entities.concretes.Brand;

@RestController // annotation: bilgilendirme ifadesi
@RequestMapping("/api/brands") // bu isimle çağırabil www.emresaglam4207.com/api/brands/getAll
public class BrandsController {
	private BrandService brandService;

	public BrandsController(BrandService brandService) {
		this.brandService = brandService;
	}

	@GetMapping("/getall")
	public List<Brand> getAll() {
		return brandService.getAll();
	}

}
