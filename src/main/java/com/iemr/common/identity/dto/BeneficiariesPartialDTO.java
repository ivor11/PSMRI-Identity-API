/*
* AMRIT – Accessible Medical Records via Integrated Technology 
* Integrated EHR (Electronic Health Records) Solution 
*
* Copyright (C) "Piramal Swasthya Management and Research Institute" 
*
* This file is part of AMRIT.
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see https://www.gnu.org/licenses/.
*/
package com.iemr.common.identity.dto;

import java.math.BigInteger;

import lombok.Data;

@Data
public class BeneficiariesPartialDTO implements Comparable<BeneficiariesPartialDTO>
{

	private BigInteger benId;
	private BigInteger benRegId;
	private BigInteger beneficiaryDetailsId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String fatherName;
	private String spouseName;
	private Integer beneficiaryAge;

	@Override
	public int compareTo(BeneficiariesPartialDTO ben)
	{
		return this.benRegId.compareTo(ben.benRegId);
	}
}
