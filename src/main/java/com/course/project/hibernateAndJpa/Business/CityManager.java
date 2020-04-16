package com.course.project.hibernateAndJpa.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.course.project.hibernateAndJpa.DAO.ICityDal;
import com.course.project.hibernateAndJpa.Entities.City;

@Service //Bir beaninin business katmanında çalışacak bir bean olduğunu belirtiyoruz
public class CityManager implements ICityService {

	private ICityDal cityDal;
	@Autowired
	public CityManager(ICityDal cityDal) {
		this.cityDal = cityDal;
	}

	@Override
	@Transactional
	public List<City> getAll() {
		//business kuralları yazılır daodan farklı olarak
		return this.cityDal.getAll();
	}

	@Override
	@Transactional
	public void add(City city) {
		this.cityDal.add(city);
		
	}

	@Override
	@Transactional
	public void update(City city) {
		this.cityDal.update(city);
		
	}

	@Override
	@Transactional
	public void delete(City city) {
		this.cityDal.delete(city);
		
	}

	@Override
	public City getById(int id) {
		return this.cityDal.getById(id);
	}

}
