// <reference types="cypress" />

import { expect } from "chai";
import cypress from "cypress";

class LoginPageObjects {
    details = {
        visit: () => cy.visit('/'),
        userName: () => cy.get(':nth-child(1) > #exampleFormControlInput1'),
        password: () => cy.get(':nth-child(2) > #exampleFormControlInput1'),
    };
    button = {
        buttonLogin: () => cy.get('.mb-3 > #exampleFormControlInput1'),
        toastMessage: () =>
            cy
                .get('.toast-container')
                .invoke('text')
                .then((text) => {
                    const toastText = text;
                    expect(toastText).to.equal(' Logged in successfully ');
                }),
        invalidtoastMessage: () =>
            cy
                .get('.toast-container')
                .invoke('text')
                .then((text) => {
                    const toastText = text;
                    expect(toastText).to.equal(' Tenant with userName : TestDemo2 does not exist. ');
                }),
        skip: () => cy.get('.buttons > .btn-primary'),
    };
    logout = {
        icon: () => cy.get('.mat-button-wrapper > .fa-solid'),
        profile: () => cy.get('#mat-menu-panel-0 > div > button:nth-child(1)'),
        logoutButton: () => cy.get('.mat-menu-content > :nth-child(3)'),
        // icon: () => cy.get('.toogleIcon'),
        // logoutButton: () =>
        //     cy.get(
        //         'div.landingPage div.col div.mainHeader app-main-header:nth-child(1) div.mainMenu div.roleDisplay:nth-child(2) ul.profileList > li:nth-child(2)',
        //     ),
    };
    //     mystorefront = {
    //         mystorefrontbutton: () => cy.get(':nth-child(2) > .nav-link > .fa'),
    //         addbutton: () => cy.get('.btn > .fa'),
    //         productname: () => cy.get('#validationProductName'),
    //         selectproductkey:() => cy.get('[style="display: inline-flex;"] > .mb-2 > .form-control'),
    //         selectadvertising: () => cy.get('[data-value="ADVERTISING"]'),
    //         selectproductimage: ()=>cy.get('.productImages > .button')
    //     }
    // }
}
export default LoginPageObjects;
