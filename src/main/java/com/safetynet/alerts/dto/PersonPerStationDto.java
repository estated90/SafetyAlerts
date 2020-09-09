package com.safetynet.alerts.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nicolas
 *
 */
public class PersonPerStationDto {
	private List<PersonDto> person = new ArrayList<>();
	private int numberOfAdult;
	private int numberOfChildren;
    
	/**
     * No args constructor for use in serialization
     * 
     */
    public PersonPerStationDto() {
    }
	
	/**
	 * @param station
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param city
	 * @param zip
	 * @param phone
	 * @param numberOfAdult
	 * @param numberOfChildren
	 */
	public PersonPerStationDto(List<PersonDto> personDto, int numberOfAdult, int numberOfChildren) {
		super();
		this.person = personDto;
		this.numberOfAdult = numberOfAdult;
		this.numberOfChildren = numberOfChildren;
	}

	public List<PersonDto> getPerson() {
		return person;
	}

	public void setPerson(List<PersonDto> personDto) {
		this.person = personDto;
	}
	/**
	 * @return the numberOfAdult
	 */
	public int getNumberOfAdult() {
		return numberOfAdult;
	}

	/**
	 * @param numberOfAdult the numberOfAdult to set
	 */
	public void setNumberOfAdult(int numberOfAdult) {
		this.numberOfAdult = numberOfAdult;
	}

	/**
	 * @return the numberOfChildren
	 */
	public int getNumberOfChildren() {
		return numberOfChildren;
	}

	/**
	 * @param numberOfChildren the numberOfChildren to set
	 */
	public void setNumberOfChildren(int numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}

	
}
