/// <reference types="cypress" />
import { Given, When, Then, And } from "cypress-cucumber-preprocessor/steps";
import login from "../../Pages/LoginPage/LoginPage.cy";

Given("I navigate to the Website", () => {
  login.enterURL();
  cy.takeScreenshot('navigate-to-website');
});

When("I entered valid credential", (datatable) => {
  datatable.hashes().forEach((element) => {
    login.enterUserNamePassword(element.email, element.validpassword);
    cy.takeScreenshot('entered-credentials');
    login.clickSubmitButton();
    cy.takeScreenshot('clicked-submit');
  });
});

And("User click on sign in button", () => {
  login.clickSubmitButton();
  cy.takeScreenshot('clicked-sign-in');
});

Then("Validate the title after login", () => {
  login.verifyPageTitle();
  cy.takeScreenshot('validated-title');
});
