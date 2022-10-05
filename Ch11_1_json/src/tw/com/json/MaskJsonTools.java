package tw.com.json;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import tw.com.beans.Mask;
import java.util.function.Consumer;
public class MaskJsonTools {
	public static void maskJsonToObj(String json,
			Consumer<List<Mask>> maskListCallBack) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objMap = new ObjectMapper();
	
			Map map = objMap.readValue(json, Map.class);
			//System.out.println(map);
			List<Map<String,Object>> list =
					(List<Map<String,Object>>)map.get("features");
			List<Mask> maskList = new ArrayList();
			
			for (Map<String,Object> dataMap : list ) {
				 Map<String,Object>  pMap = 
						 (Map<String,Object>)dataMap.get("properties");
				Mask mask = new Mask(pMap);
				maskList.add(mask);
			}
			maskListCallBack.accept(maskList);
			System.out.println(maskList);
	
		
	}
}
