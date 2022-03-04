package POMWithoutPageFactory;

public class TestPage extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		BaseClass.initialization();
		DynamicTable test = new DynamicTable();
		
		test.clickOnCalender();
		
		String selectMonthYear  = "Apr 2022";
		String selDate 		    = "17";
		String currentMonthYear = test.getCurrentMonthYear();
		System.out.println(currentMonthYear);
		while(true)
		{
			String currentMonthYear1 = test.getCurrentMonthYear();
			System.out.println(currentMonthYear1);
			if(currentMonthYear1.equals(selectMonthYear))
				break;
			else
				Thread.sleep(2000);
				test.clickNext();
		}
		test.selectDate(selDate);
		
		System.out.println(selDate+" "+selectMonthYear+" selected");
	}

}
