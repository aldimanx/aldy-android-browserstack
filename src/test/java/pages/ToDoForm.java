package pages;

import org.openqa.selenium.support.PageFactory;

import com.github.javafaker.Faker;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ToDoForm {

	Faker faker = new Faker();
	String name = faker.name().fullName();
	
	@AndroidFindBy(id = "com.example.android.architecture.blueprints.todomvp.mock:id/add_task_title")
	AndroidElement frmTitle;
	
	@AndroidFindBy (id = "com.example.android.architecture.blueprints.todomvp.mock:id/add_task_description")
	AndroidElement frmDescription;
	
	@AndroidFindBy (id = "com.example.android.architecture.blueprints.todomvp.mock:id/fab_edit_task_done")
	AndroidElement btnSubmit;
	
	@AndroidFindBy (id = "com.example.android.architecture.blueprints.todomvp.mock:id/menu_delete")
	AndroidElement btnDelete;
	
	@AndroidFindBy (id = "com.example.android.architecture.blueprints.todomvp.mock:id/fab_edit_task")
	AndroidElement btnEdit;
	
public ToDoForm (AndroidDriver<AndroidElement> driver) {
PageFactory.initElements(new AppiumFieldDecorator(driver),this);
}

public AndroidElement TypefrmTitle() {
	return frmTitle;
}
//public AndroidElement frmTitle() {
//	
//	return title;
//}

public AndroidElement TypefrmDesc() {
	return frmDescription;
}
public AndroidElement clickBtnSubmit() {
	btnSubmit.click();
	return btnSubmit;
}
public AndroidElement clickBtnDelete() {
	btnDelete.click();
	return btnDelete;
}
public AndroidElement clickBtnEdit() {
	btnEdit.click();
	return btnEdit;
}
}