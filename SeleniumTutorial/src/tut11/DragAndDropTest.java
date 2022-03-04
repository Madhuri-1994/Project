package tut11;

import java.io.IOException;

public class DragAndDropTest extends BaseClassDrag{

	public static void main(String[] args) throws InterruptedException, IOException {
		BaseClassDrag.initialization();
		DragAndDrop obj = new DragAndDrop(driver);
		obj.matchTheCapitals();		
		obj.takeScreenShot();

	}

}
