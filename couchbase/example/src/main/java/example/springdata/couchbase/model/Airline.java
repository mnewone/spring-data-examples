/*
 * Copyright 2017-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package example.springdata.couchbase.model;

import lombok.Data;

import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

/**
 * A domain object representing an Airline
 *
 * @author Chandana Kithalagama
 */
@Data
@Document
public class Airline {

	@Id
	private String id;

	@Field
	private String type;

	@Field
	private String name;

	@Field("iata")
	private String iataCode;

	@Field
	private String icao;

	@Field
	private String callsign;

	@Field
	private String country;
}
