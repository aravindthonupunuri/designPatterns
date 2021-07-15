
public class TemplatePatternDemo {

//	InstantiationException, IllegalAccessException, ClassNotFoundException
	public static void main(String[] args) throws Exception {
		
		 Class c=Class.forName("Chess");

		//args[0]

	      Game game = new Chess();
	      game=(Game) c.newInstance();
	      game.play();
	      System.out.println();
	      game = new Soccer();
	      game.play();		
	   }

}
