package io.github.girirajvyas.ai.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class YamlUtils {

	public static Map<String, Object> readYml() {
		String filePath = "src/main/resources/application.yml";

		// Read data from YAML file
		try {
			FileInputStream fis = new FileInputStream(filePath);
			Yaml yaml = new Yaml();

			// Parse the YAML file into a Map
			Map<String, Object> data = yaml.load(fis);
			
			fis.close();
			
			return data;
		} catch (FileNotFoundException e) {
			log.error(e.getMessage());
		} catch (IOException e) {
			log.error(e.getMessage());
		}
		return null;
	}

	public static String readKeyFromYaml(String key) {
		Map<String,Object> yml = readYml();
		// Access the data from the YAML file
		// Example: Assuming the YAML file has a key named "name"
		String value = (String) yml.get(key);
		log.info("Key: " + key);
		log.info("Key Value: "+ value);
		return value;
	}
	
	 public static String getNestedProperty(String propertyPath) {
		 Map<String,Object> yml = readYml();
	        String[] keys = propertyPath.split("\\.");
	        Object value = yml;

	        for (String key : keys) {
	            if (value instanceof Map) {
	                value = ((Map<?, ?>) value).get(key);
	            } else {
	                return null;
	            }
	        }

	        if (value != null) {
	            return value.toString();
	        }

	        return null;
	    }
}
