package com.doctusoft.jsf.example.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;

import com.google.common.collect.Lists;

@SuppressWarnings("serial")
@Data @AllArgsConstructor
public class CountryVO implements Serializable {

	private UUID id;
	private String code;
	private String name;
	
	public static Collection<CountryVO> countries() {
		Collection<CountryVO> countries = Lists.newArrayList();
		countries.add(new CountryVO(UUID.randomUUID(), "HUN", "Hungary"));
		countries.add(new CountryVO(UUID.randomUUID(), "CH", "Switzerland"));
		countries.add(new CountryVO(UUID.randomUUID(), "HR", "Croatia"));
		countries.add(new CountryVO(UUID.randomUUID(), "BR", "Brasil"));
		countries.add(new CountryVO(UUID.randomUUID(), "GER", "Germany"));
		countries.add(new CountryVO(UUID.randomUUID(), "ITA", "Italy"));
		return countries;
		
	}
	
}
