package hand.zjf;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RandomMap {
	public static void main(String[] args){
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0;i<50;i++){
			Integer num = (int) Math.random()*100;
			list.add(num);
		}
		Map <Integer,List<Integer>> map = new HashMap<>();
		for(int i =0;i<50;i++){
			if(map.containsKey(list.get(i)/10)){
				map.get(list.get(i)/10).add(list.get(i));
			}else{
			List<Integer> list1 = new ArrayList<Integer>();
					list1.add(list.get(i));
					map.put(list.get(i)/10, list1);
			}
		}
	}
}
