package tut12;

public class FrameOperationsTest extends BaseClassFrame{

	public static void main(String[] args) throws InterruptedException {
		BaseClassFrame.initialization();
		FrameOperations obj = new FrameOperations(driver);
		obj.switchMain();
		obj.switchLeftBottom();
		obj.switchToRight();
		obj.switchToTopLeft();

	}

}
