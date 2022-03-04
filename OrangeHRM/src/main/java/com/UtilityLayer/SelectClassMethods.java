package com.UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseLayer.BaseClass;

public class SelectClassMethods extends BaseClass{
private Select sel;

	public void selectItemByVisibleText(WebElement w , String value)
	{
		sel = new Select(w);
		sel.selectByVisibleText(value);
	}
	
	public void selectItemByValue(WebElement w, String value)
	{
		sel = new Select(w);
		sel.deselectByValue(value);
	}
	
	public void selectItemByIndex(WebElement w, int index)
	{
		sel = new Select(w);
		sel.selectByIndex(index);
	}
	
	public String getDropDownSelectedValue()
	{
		return sel.getFirstSelectedOption().getText();
	}
	
	public String[] getAllDropDownValues()
	{
		List<WebElement> w = sel.getOptions();
		int n = w.size();
		String str[] = new String[n];
		for(int i = 0; i < n; i++)
		{
			str[i] = w.get(i).getText();
		}
		return str;
	}
	
}
