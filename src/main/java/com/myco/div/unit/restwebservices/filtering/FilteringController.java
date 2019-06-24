package com.myco.div.unit.restwebservices.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

//Filtering Concepts
@RestController
public class FilteringController {
	
	@GetMapping("/filtering")
	//field1,field2
	public MappingJacksonValue retrieveSampleBean() {
		
		SampleBean sampleBean = new SampleBean("value1","value2","value3");
		
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("value1","value2");
		
		FilterProvider filters = new SimpleFilterProvider().addFilter("samplebeanfilter", filter);
		MappingJacksonValue mapping = new MappingJacksonValue(sampleBean);
		mapping.setFilters(filters);
		return mapping;
	}
	
	//field2,field3
	@GetMapping("/filteringlist")
	public MappingJacksonValue retrieveSampleBeans() {
		
		
		List<SampleBean> list=  Arrays.asList(new SampleBean("value11","value12","value13"),new SampleBean("value21","value22","value23"));
		
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("value2","value3");
		
		FilterProvider filters = new SimpleFilterProvider().addFilter("samplebeanfilter", filter);
		MappingJacksonValue mapping = new MappingJacksonValue(list);
		mapping.setFilters(filters);
		
		return mapping;
		
	}
}
