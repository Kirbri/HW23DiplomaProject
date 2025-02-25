package avito.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ItemPage {
    private final SelenideElement titleInfoText = $("[data-marker='item-view/title-info']"),
            favoriteSellerSubscriptionButton = $("[data-marker='item-view/seller-info'] button");

    @Step("Проверить соответствие названий '{value}' объявлений")
    public ItemPage checkTitleAnnouncement(String value) {
        titleInfoText.shouldHave(text(value));
        return this;
    }

    @Step("Подписаться на продавца")
    public ItemPage subscribeFavoriteSeller() {
        favoriteSellerSubscriptionButton.click();
        return this;
    }
}
