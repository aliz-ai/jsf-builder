package com.doctusoft.jsf.example.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.UUID;

import com.google.common.collect.Lists;

import lombok.AllArgsConstructor;
import lombok.Data;

@SuppressWarnings("serial")
@Data @AllArgsConstructor
public class OrszagVO implements Serializable {

	private UUID id;
	private String azonosito;
	private String nev;
	
	public static Collection<OrszagVO> orszagok() {
		Collection<OrszagVO> orszagok = Lists.newArrayList();
		orszagok.add(new OrszagVO(UUID.randomUUID(), "HUN", "Magyarország"));
		orszagok.add(new OrszagVO(UUID.randomUUID(), "CH", "Svájc"));
		orszagok.add(new OrszagVO(UUID.randomUUID(), "HR", "Horvátország"));
		orszagok.add(new OrszagVO(UUID.randomUUID(), "BR", "Brazília"));
		orszagok.add(new OrszagVO(UUID.randomUUID(), "GER", "Németország"));
		orszagok.add(new OrszagVO(UUID.randomUUID(), "ITA", "Olaszország"));
		return orszagok;
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((azonosito == null) ? 0 : azonosito.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrszagVO other = (OrszagVO) obj;
		if (azonosito == null) {
			if (other.azonosito != null)
				return false;
		} else if (!azonosito.equals(other.azonosito))
			return false;
		return true;
	}
	
	
}
