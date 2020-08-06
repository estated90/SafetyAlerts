package com.safetynet.alerts.readJson;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.safetynet.alerts.model.Persons;

public class JsonReader implements IJsonReader {

	private static final Logger logger = LogManager.getLogger("JsonReader");

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void readerList(String filePath, String objectToParse) {
		// parsing file "JSONExample.json"
		Object jsonFile = null;
		try {
			jsonFile = new JSONParser().parse(new FileReader(filePath));
		} catch (IOException e) {
			logger.error("Unable to read the inputed Json File", e);
		} catch (ParseException ex) {
			logger.error("Unable to parse the inputed Json File", ex);
		}
		// type casting jsonFile to JSONObject
		JSONObject jsonObject = (JSONObject) jsonFile;
		JSONArray jsonArray = (JSONArray) jsonObject.get(objectToParse);
		Iterator<Map.Entry> itr2 = jsonArray.iterator();
		while (itr2.hasNext()) {
			Iterator<Map.Entry> itr1 = ((Map) itr2.next()).entrySet().iterator();
			while (itr1.hasNext()) {
				Map.Entry pair = itr1.next();
				System.out.println(pair.getKey() + " : " + pair.getValue());
			}
		}
	}
}
