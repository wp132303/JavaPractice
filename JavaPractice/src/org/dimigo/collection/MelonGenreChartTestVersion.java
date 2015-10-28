/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *  |_ MelonGenreChartTestVersion
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 10. 3.
 * </pre>
 * 
 * @author	: primeheader
 * @version	: 1.0
 */

public class MelonGenreChartTestVersion {
	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap<>();
		List<Music> ballad = new ArrayList<>();
		List<Music> dance = new ArrayList<>();
		
		ballad.add(new Music("내 첫사랑", "베리굿"));
		ballad.add(new Music("또 다시 사랑", "임창정"));
		ballad.add(new Music("부산에 가면", "박진영, 박지민, 버나드 박"));
		ballad.add(new Music("잠수교", "박진영, 정승환"));
		
		dance.add(new Music("커피", "유재환 , 김예림"));
		dance.add(new Music("다 잘 될거야", "쿨"));
		
		map.put("발라드", ballad);
		map.put("댄스", dance);
		
		
		System.out.println("---<< 멜론 장르별 차트 >>---");
		printMap(map);


		ballad.set(2, new Music ("그대 내 품에", "김광석"));
		System.out.println("---<< 발라드 3위 곡 변경 >>---");
		printMap(map);

		ballad.remove(0);
		System.out.println("---<< 발라드 1위 곡 삭제 >>---");
		printMap(map);
		
		map.clear();
		System.out.println("---<< 전체 리스트 삭제 >>---");
		printMap(map);
	}
	
	public static void printMap(Map<String, List<Music>> map) {
//		for (Entry<String, List<Music>> m : map.entrySet()) {
//			int i = 1;
//			System.out.println("[" + m.getKey() + "]");
//			ArrayList<Music> value = (ArrayList<Music>) m.getValue();
//		for (Music a : value) {
//				System.out.println(i + ". " + a);
//				i++;
//		}
//		}
//		
		for (String key : map.keySet()) {
			int i = 1;
			System.out.println("[" + key + "]");
			List<Music> value = map.get(key);
			for (Music out : value) {
				System.out.println(i + ". " + out);
				i++;
			}
			System.out.println();
		}
  		
//		for (String key : map.keySet()) {
//		int i=1;
//		System.out.println("[" + key + "]");
//		ArrayList<Music> value = (ArrayList<Music>) map.get(key);
//		for (Music a : value) {
//			System.out.println(i + ". " + a);
//			i++;
//		}
//	}

		
		
		
		
	}
	
	
	
	
	
	
	
	

	
	public static void printMap2(Map<String, List<Music>> map) {
		for (String s : map.keySet()) {
			int i = 1;
			System.out.println("[" + s + "]");
			ArrayList<Music> list = (ArrayList<Music>)map.get(s);
			for (Music m : list) {
				System.out.println(i + ". " + m);
				i++;
			}
		}
	}
	
	public static void printMap3(Map<String, List<Music>> map) {
		for (Map.Entry<String, List<Music>> entry : map.entrySet()) {
			int i = 1;
			System.out.println("[" + entry.getKey() + "]");
			ArrayList<Music> m = (ArrayList<Music>)entry.getValue();
		for (Music value : m) {
			System.out.println(i + ". " + m);
		}
			
		}
	}
	
	
	
	
}
