import {Before, Given, When, Then, And} from 'cypress-cucumber-preprocessor/steps';
import {HomePage} from '../PageObjects/HomePage';

import LoginPage from '../PageObjects/LoginPageObjects';
const Home = new HomePage();

//Synchronous
Before(function () {
    cy.viewport(1440, 900);
    Cypress.on('uncaught:exception', (err, runnable) => {
        // returning false here prevents Cypress from failing the test
        return false;
    });
    cy.clearLocalStorage();
});
Then('User click on skip button', () => {
    cy.wait(7000);
    Home.button.skip().click();
});

And('User select distance from canvas', () => {
    cy.wait(3000);

    // Home.toolBar.zoomIn().click();
    Home.toolBar.drawtool().click();
    Home.toolBar.canvas().dblclick();
    // Home.toolBar.canvas().trigger('mouseover');
    // Home.toolBar.canvas().click();
});

Then('User click on Planning tool', () => {
    cy.get('.mapSpectrumPlanningBtn > button').click();
    cy.get('.form-label > .btn').click();
    cy.get(':nth-child(3) > :nth-child(1) > .checkbox > .ng-untouched').click({force: true});
    cy.get(':nth-child(4) > :nth-child(1) > .checkbox > .ng-untouched').click({force: true});
    cy.get('.footerButtons > .btn-primary').dblclick();
});

Then('User search Pleace as {string}', (Place: string) => {
    cy.get('#searchgoogleInput').type(Place);
});
