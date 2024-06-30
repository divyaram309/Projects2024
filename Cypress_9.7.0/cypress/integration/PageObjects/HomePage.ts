import LoginPage from './LoginPageObjects';
export class HomePage extends LoginPage {
    toolBar = {
        zoomIn: () => cy.get('.maptalks-zoom-zoomin'),
        // drawtool: () => cy.get(':nth-child(4) > img'),
        drawtool: () => cy.get('.fa-pen'),
        // drawtool: () => cy.get('.fa-circle'),
        canvas: () => cy.get('canvas'),
        interactivemap: () => cy.get(':nth-child(2) > .nav-link > span'),
    };

    // And("User select mark the location", () => {
    //     cy.wait(5000)
    //     cy.get('.maptalks-zoom-zoomin').click()
    //     cy.get(':nth-child(4) > img').click()
    //     cy.get('canvas').dblclick();
    //     cy.get('.toogleIcon').click()
    //     cy.get('.toogleIcon').trigger('mouseover')
    //     cy.get('div.landingPage div.col div.mainHeader app-main-header:nth-child(1) div.mainMenu div.roleDisplay:nth-child(2) ul.profileList > li:nth-child(2)').click({ force: true });
    // });
}
