// <reference types="cypress" />
import {Before, Given, When, Then, And} from 'cypress-cucumber-preprocessor/steps';
import LoginPageObjects from '../PageObjects/LoginPageObjects';
const Login = new LoginPageObjects();
// Synchronous
Before(function () {
    cy.viewport(1440, 900);
    Cypress.on('uncaught:exception', (err, runnable) => {
        // returning false here prevents Cypress from failing the test
        return false;
    });
    cy.clearLocalStorage();

    Then('User verify the ToastMessage', () => {
        Login.button.toastMessage();
        cy.wait(6000);
        Login.button.skip().click();
        cy.title().should('include', 'Marketplace');
    });
});
