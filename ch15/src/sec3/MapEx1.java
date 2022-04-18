package sec3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("김김김", 100);
		map.put("동동동", 90);
		map.put("협협협", 85);
		map.put("김동협", 95);
		map.put("낌똥협", 85);
		System.out.println("저장된 데이터 건수 : "+map.size());
		System.out.println("협협협의 점수 : "+map.get("협협협"));
		System.out.println("낌똥협의 점수 : "+map.get("낌똥협"));
		System.out.println("저장된 내용 출력 : "+map);
		map.remove("동동동");
		System.out.println("삭제 후 저장된 내용 출력 : "+map);
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterater = keySet.iterator();
		while(keyIterater.hasNext()) {
			String key = keyIterater.next();
			Integer value = map.get(key);
			System.out.println("key : "+key+" , value : "+value);
		}	
	}
}
