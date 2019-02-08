package com.social.site;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.social.site.domain.object.Person;

public class SocialSiteMainApp {

	public static void main(String[] args) {
		List<Person> members = fetchSocialSiteMembers();

		System.out.println("People who are greater older than 20 \n");
		printPersonOlderAge(members, 20);
		System.out.println("----------------***********------------");
		System.out.println("People who are in between 15 and 20 \n");
		printPersonInAgeRange(members, 15, 20);
		System.out.println("----------------***********------------");
		System.out.println("People who are in between 15 and 20(Inclusive) using Predicate\n");
		printPersonWithLambdaPredicate(members, (p)-> p.getAge()>=15 && p.getAge()<=20);
		
		System.out.println("----------------***********------------");
		System.out.println("People who are in between 20 and 30(Inclusive) using Predicate and Consumer\n");
		printPersonWithPredicateAndConsumer(members, (p)-> p.getAge()>=20 && p.getAge()<=30, System.out::println);

		System.out.println("----------------***********------------");
		System.out.println("People who are in between 20 and 30(Inclusive) using Stream \n");
		printPersonWithStream(members, (p)-> p.getAge()>=20 && p.getAge()<=30, System.out::println);

	
	}

	private static void printPersonOlderAge(List<Person> personList, Integer age) {
		for (Person p : personList) {
			if (p.getAge() > age)
				p.printPerson();
		}

	}

	private static void printPersonInAgeRange(List<Person> personList, Integer minAge, Integer maxAge) {
		for (Person p : personList) {
			if (p.getAge() > minAge && p.getAge() < maxAge)
				p.printPerson();
		}

	}
	
	private static void printPersonWithLambdaPredicate(List<Person> personList, Predicate<Person> predicate) {
		for (Person p : personList) {
			if (predicate.test(p))
				p.printPerson();
		}

	}
	
	private static void printPersonWithPredicateAndConsumer(List<Person> personList, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person p : personList) {
			if (predicate.test(p))
				consumer.accept(p);
		}

	}
	
	private static void printPersonWithStream(List<Person> personList, Predicate<Person> predicate, Consumer<Person> consumer) {
		personList.stream().filter(predicate).forEach(consumer);

	}

	private static List<Person> fetchSocialSiteMembers() {
		List<Person> memberList = new ArrayList<>();
		memberList.add(new Person("Pam", 29, "FEMALE", new Date(), "Pam@yahoo.com"));
		memberList.add(new Person("Julia", 25, "FEMALE", new Date(), "Julia@yahoo.com"));
		memberList.add(new Person("Sam", 16, "MALE", new Date(), "Sam@yahoo.com"));
		memberList.add(new Person("John", 20, "MALE", new Date(), "John@yahoo.com"));
		memberList.add(new Person("Paul", 3, "MALE", new Date(), "Paul@yahoo.com"));
		return memberList;
	}
}
