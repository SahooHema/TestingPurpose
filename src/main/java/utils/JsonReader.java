package utils;

import java.io.File;

import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

public class JsonReader {	
	
	public static String getTestData(String input) throws IOException, ParseException, org.json.simple.parser.ParseException {
        String testdata;
        return testdata = (String) getJsonData().get(input);//input is the key      
    }
	
	public static JSONObject getJsonData() throws IOException, ParseException, org.json.simple.parser.ParseException{
	       
        //pass the path of the testdata.json file
        File filename = new File("src//test//resources//testdata//testdata.json");
        //convert json file into string
        String json = FileUtils.readFileToString(filename, "UTF-8");
        //parse the string into object
        Object obj = new JSONParser().parse(json);
        //give jsonobject so that I can return it to the function everytime it get called
        JSONObject jsonObject = (JSONObject) obj;
        return jsonObject;
    }
	
	public static JSONArray getJSONArray(String key) throws IOException, ParseException, org.json.simple.parser.ParseException {
		JSONObject jsonobject = getJsonData();
		JSONArray jsonarray = (JSONArray)jsonobject.get(key);
		return jsonarray;
	}
    
	public static Object getJSONArrayData(String key,int index) throws IOException, ParseException, org.json.simple.parser.ParseException {
		JSONArray jsonarray = getJSONArray(key);
		return jsonarray.get(index);		
	}
	
	public static void getJSONArrayDataWithIterator(String key) throws IOException, ParseException, org.json.simple.parser.ParseException {
		JSONArray jsonarray = getJSONArray(key);
		    Iterator<String> it= jsonarray.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}	
	}
	
	
	
	
	
	
	
	
  




}