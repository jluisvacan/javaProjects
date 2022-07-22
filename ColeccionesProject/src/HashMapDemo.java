import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, String> colors = new HashMap<String, String>();
		
		colors.put("WHITE","#FFFFFF");
		colors.put("BLACK","#000000");
		colors.put("BLUE","#0000FF");
		colors.put("VIOLET","#8A2BE2");
		colors.put("GREEN","#32CD32");
		colors.put("PINK","#FF69B4");
		colors.put("ORANGE","#FFA500");
		colors.put("BROWN","#8B4513");
		colors.put("NAVY","#000080");
		colors.put("NAVY","#000088");
		
		String navy = colors.remove("NAVY"); // Remueve_NAVY
		System.out.println(navy);		// #000088
		System.out.println(colors.size()); // 8
		
		
		//System.out.println(colors.get("BLUE"));
		System.out.println(colors.get("NAVY"));			// null_Obtiene_el_VALUE_del_HAShMAP
		
		System.out.println(colors.containsKey("NAVY"));; // false_ya_que_se_borro_NAVY
		
//		for (String key : colors.keySet()) {
////			System.out.println(key);
//			System.out.println(key + "->" + colors.get(key));
//		} // forEach_para_ir_por_las_llaves
		
		for (String value : colors.values()) {
		System.out.println(value);
	} // forEach_ para_ir_solo_por_los_valores
		
//		colors.forEach((key, value)-> System.out.println(key + " = " + value));
					// llave_y_valor
	}// main
}//class_HashMapDemo
