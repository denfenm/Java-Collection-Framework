import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.awt.Color;
import java.awt.Color.*;



public class MapDemo {
	
	public static void main(String[] args)
	{
		Map<String,Color> favColor = new HashMap<String,Color>();
		favColor.put("Juliet",Color.BLUE);
		favColor.put("Romeo",Color.GREEN);
		favColor.put("Adam",Color.RED);
		favColor.put("Eve",Color.BLUE);
		favColor.put("Juliet",Color.RED);
		
		Set<String> keySet =favColor.keySet();
		for(String key :keySet)
		{
			Color value =favColor.get(key);
			System.out.println(key +":" + value);
		}
	}

}