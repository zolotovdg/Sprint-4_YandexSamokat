import PageObject.MainPage;
import PageObject.OrderPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;

import javax.swing.*;

public class OrderTest extends BaseTest {
    OrderPage page;

    @Test
    public void checkingOrderMethodDown() {
        page = new OrderPage(driver);
        page.getCookieButton().click();
        page.scrollDown();
        page.getOrderDown().click();

        page.getName().sendKeys("Бронислав");
        page.getSurname().sendKeys("Виногородский");
        page.getAdress().sendKeys("г. Москва, ул. Пушкина, д.12");
        page.getStation().sendKeys("Войковская");
        page.getStation().sendKeys(Keys.ARROW_DOWN);
        page.getStation().sendKeys(Keys.ENTER);

        page.getTelephone().sendKeys("+79251115566");

        page.getNext().click();

        page.getWhenToDeliver().sendKeys("16.03.2023");
        page.getWhenToDeliver().sendKeys(Keys.ENTER);
        page.getRentTerm().click();
        page.getSelectRentTerm().click();
        page.getBlackPerl().click();
        page.getComment().sendKeys("Это комментарий для курьера");

        page.getFinalOrder().click();

        page.getMakeOrderYes().click();

        Assert.assertTrue(page.getSuccessOrder().isDisplayed());
    }

    @Test
    public void checkingOrderMethodUp() {
        page = new OrderPage(driver);
        page.getCookieButton().click();
        page.getOrderUp().click();

        page.getName().sendKeys("Иммануил");
        page.getSurname().sendKeys("Кант");
        page.getAdress().sendKeys("г. Одинцово, ул. Сколковская, д.1");
        page.getStation().sendKeys("Кунцевская");
        page.getStation().sendKeys(Keys.ARROW_DOWN);
        page.getStation().sendKeys(Keys.ENTER);
        page.getTelephone().sendKeys("+79240005566");

        page.getNext().click();

        page.getWhenToDeliver().sendKeys("10.07.2023");
        page.getWhenToDeliver().sendKeys(Keys.ENTER);
        page.getRentTerm().click();
        page.getSelectRentTermSix().click();
        page.getGreyDespair().click();
        page.getComment().sendKeys("Это комментарий для курьера номер два");

        page.getFinalOrder().click();

        page.getMakeOrderYes().click();

        Assert.assertTrue(page.getSuccessOrder().isDisplayed());
    }
}



