package tuan03.services;

import java.util.List;

import tuan03.entities.Manufacturer;
import tuan03.repositories.GeneralRepository;

public class ManufacturerService {
	private GeneralRepository<Manufacturer, Long> gRepository;

	public ManufacturerService() {
		gRepository = new GeneralRepository<>("Manufacturer");
	}

	public Manufacturer save(Manufacturer Manufacturer) {
		return gRepository.save(Manufacturer);
	}

	public List<Manufacturer> findAll() {
		return gRepository.findAll();
	}

//    public Manufacturer findById(long Manufacturerid) {
//        return gRepository.findById(Manufacturerid);
//    }

	public Manufacturer findById(Manufacturer manufacturer, long Manufacturerid) {
		return gRepository.findByEntity(manufacturer, Manufacturerid);
	}

	public Manufacturer updateManufacturer(Manufacturer Manufacturer) {
		return gRepository.update(Manufacturer);
	}

	public Manufacturer deleteManufacturer(Manufacturer Manufacturer, long id) {
		return gRepository.delete(Manufacturer, id);
	}
}
