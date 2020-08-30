
package com.safetynet.alerts.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.safetynet.alerts.dto.PersonDto;


/**
 * @author nicolas
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "address",
    "station"
})
public class Firestation {

    @JsonProperty("address")
    private String address;
    @JsonProperty("station")
    private String station;
    private List<PersonDto> person = new ArrayList<>(); 

    /**
     * No args constructor for use in serialization
     * 
     */
    public Firestation() {
    }

    /**
     * 
     * @param address
     * @param station
     */
    public Firestation(String address, String station, List<PersonDto> person) {
        super();
        this.address = address;
        this.station = station;
        this.person = person;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("station")
    public String getStation() {
        return station;
    }

    @JsonProperty("station")
    public void setStation(String station) {
        this.station = station;
    }

    /**
	 * @return the person
	 */
	public List<PersonDto> getPerson() {
		return person;
	}

	/**
	 * @param person the person to set
	 */
	public void setPerson(List<PersonDto> person) {
		this.person = person;
	}

	@Override
    public String toString() {
        return new ToStringBuilder(this).append("address", address).append("station", station).toString();
    }

}
