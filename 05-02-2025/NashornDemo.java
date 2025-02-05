import javax.script.*;

public class NashornDemo{
	public static void main(String[] args){
		try{

			/* 

			ScriptEngineManager mgr = new ScriptEngineManager();
			
			//ScriptEngineManager engine = mge.getEngineByName("JavaScript");
			//engine.eval("print('Hello Everybody')");
	
			ScriptEngineManager engine = mge.getEngineByName("nashorn");
			engine.eval(new FileReader("demo.js"));

			Invokable inv = (Invokable) enigne;
			
			inv.invokeFunction("abc");

			inv.invokeFunction("add", 10, 20);

			String greeting = inv.invokeFunction("greet", "Kaif");

			*/

			//There is no specific js engine with java17. Hence below code works with java15
			ScriptEngineManager mgr = new ScriptEngineManager();
			List<ScriptEnigneFactory>  list = mgr.getEngineFactories();
			list.forEach((sef) -> System.out.println(set.getEngineName()));
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}