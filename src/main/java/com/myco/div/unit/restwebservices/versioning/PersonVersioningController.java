package com.myco.div.unit.restwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {
	
	//URI Versioning	
	@GetMapping("v1/person")
	public PersonV1 personV1() {
		return new PersonV1("Sam");
	}

	@GetMapping("v2/person")
	public PersonV2 personV2() {
		return new PersonV2(new Name("Sam", "Reddy"));
	}

	// Parameter Versioning
	@GetMapping(value = "person/params", params = "version=1")
	public PersonV1 paramV1() {
		return new PersonV1("Sam");
	}

	@GetMapping(value = "person/params", params = "version=2")
	public PersonV2 paramV2() {
		return new PersonV2(new Name("Sam", "Reddy"));
	}

	// Header Versioning

	@GetMapping(value = "person", headers = "X-API-VERSION=1")
	public PersonV1 headerV1() {
		return new PersonV1("Sam api header");
	}

	@GetMapping(value = "person", headers = "X-API-VERSION=2")
	public PersonV2 headerV2() {
		return new PersonV2(new Name("Sam api header", "Reddy"));
	}

	// Accept Header Versioning or MIME Type Versioning
	@GetMapping(value = "/person", produces = "application/vnd.company.app-v1+json")
	public PersonV1 producesV1() {
		return new PersonV1("Sam");
	}

	@GetMapping(value = "/person", produces = "application/vnd.company.app-v2+json")
	public PersonV2 producesV2() {
		return new PersonV2(new Name("Sam", "Reddy"));
	}
	
}
