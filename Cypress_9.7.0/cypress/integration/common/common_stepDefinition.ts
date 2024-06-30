import {Before, Given, When, Then, And} from 'cypress-cucumber-preprocessor/steps';
import LoginPage from '../PageObjects/LoginPageObjects';
import {HomePage} from '../PageObjects/HomePage';
import {homedir} from 'os';
const homepage = new HomePage();
Before(function () {
    cy.viewport(1440, 900);
    Cypress.on('uncaught:exception', (err, runnable) => {
        // returning false here prevents Cypress from failing the test
        return false;
    });
    cy.clearLocalStorage();
});

Given('User visits the MarketPlace Portal', () => {
    homepage.details.visit();
});

When('User enters User name as {string}', (name: string) => {
    homepage.details.userName().type(name);
});

Then('User enters Password as {string}', (password: string) => {
    homepage.details.password().type(password);
});

And('User clicks on Login', () => {
    cy.wait(8000);
    homepage.button.buttonLogin().click();
});

Then('User asserts invalid ToastMessage', () => {
    homepage.button.invalidtoastMessage();
});

Then('User asserts Toast Message', () => {
    // cy.wait(8000);
    homepage.button.toastMessage();
});

And('User click on Profile Icon and click on logout Option', () => {
    cy.wait(9000);
    homepage.logout.icon().click();
    // homepage.logout.icon().trigger('mouseover');
    homepage.logout.logoutButton().click({force: true});
});

Then('User verify the ToastMessage', () => {
    homepage.button.toastMessage();
    cy.wait(7000);
    homepage.button.skip().click();
    cy.title().should('include', 'Marketplace');
});

And('User clicks on the Interactive map dashboard', () => {
    cy.wait(8000);
    homepage.toolBar.interactivemap().click();
});
// Then('User click on My Storefront page', () => {
//     homepage.mystorefront.mystorefrontbutton().click({force: true});
//  });
//  Then('User click on the add button', () => {
//     cy.wait(5000)
//      homepage.mystorefront.addbutton().click();
//   });
//   When('User enter the data in the product name as {string}', (name: string) => {
//      homepage. mystorefront.productname().type(name);
//  });
//  Then('User click on the Select product keyword as {string}', (product: string) => {
//      cy.wait(2000);
//      // homepage.mystorefront.selectproductkey().click();
//      cy.get('[style="display: inline-flex;"] > .mb-2 > .form-control').select(product)
//   });
//   And('User upload the product image', () => {
//      cy.wait(2000);
//      cy.get('#fileElem1').attachFile("Gaian Logo.png")
//      cy.get('#validationdescription').click();

//  });

//  Then('User verify the ToastMessage', () => {
//     homepage.button.toastMessage();
//     cy.wait(5000);
//     homepage.button.skip().click();
//     cy.title().should('include', 'Marketplace');
// });

// Then ("User enter Description as {string}",(description:string)=>{
//     cy.get('#validationdescription').type(description)
// })
And('User click on Profile Icon and click on profile option', () => {
    cy.wait(5000);
    homepage.logout.icon().click();
    homepage.logout.profile().click({force: true});
});
