package com.ganesh.app.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganesh.app.entity.Person;
import com.ganesh.app.entity.PhoneNumbers;
import com.ganesh.app.repo.IPersonRepo;
import com.ganesh.app.repo.IPhonNumberRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AssociationMappingImple implements IAssociationMappingService {
	@Autowired
	private IPersonRepo iPersonRepo;
	@Autowired
	private IPhonNumberRepo iPhonNumberRepo;

	@Override
	public void saveDataUsingParent() {

		// create parent object
		Person person = new Person("Avi", "Mumbai");
		PhoneNumbers numbers1 = new PhoneNumbers(1205005174L, "DOCOMO", "Personal");
		PhoneNumbers numbers2 = new PhoneNumbers(8020928781L, "JIO", "Office");

		// add parent to child
		numbers1.setPerson(person);
		numbers2.setPerson(person);

		// save the parent object
		Set<PhoneNumbers> numbers = new HashSet<PhoneNumbers>();
		numbers.add(numbers1);
		numbers.add(numbers2);
		person.setContactDetail(numbers);

		iPersonRepo.save(person);
		System.err.println("Person and his associated phone numbers are saved(Parent to child)");
	}

	@Override

	public void saveDataUsingChild() {
		// create Parent object
		Person per = new Person("Ramesh", "Vizag");

		// create child objects
		PhoneNumbers ph1 = new PhoneNumbers(8888888888L, "Airtel", "Personal");
		PhoneNumbers ph2 = new PhoneNumbers(7777777777L, "VI", "Office");

		// add parent to child
		ph1.setPerson(per);
		ph2.setPerson(per);

		// add children to parent
		Set<PhoneNumbers> phonesSet = new HashSet<>();
		phonesSet.add(ph1);
		phonesSet.add(ph2);
		per.setContactDetail(phonesSet);

		// save the parent object
		iPhonNumberRepo.save(ph1);
		iPhonNumberRepo.save(ph2);
		System.out.println("Person and his associated phoneNumbers are saved (child to parent)");

	}

	@Override
	public void loadDataUsingParent() {
		Iterable<Person> iterable = iPersonRepo.findAll();
		iterable.forEach(per -> {
			System.out.println("Person: " + per);
			Set<PhoneNumbers> child = per.getContactDetail();
			System.out.println("Child Count: " + child.size());
			child.forEach(ph -> {
				System.out.println(ph.getMobileNo());
			});
		});

	}

}
