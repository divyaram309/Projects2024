// ***********************************************************
// This example support/e2e.js is processed and
// loaded automatically before your test files.
//
// This is a great place to put global configuration and
// behavior that modifies Cypress.
//
// You can change the location of this file or turn off
// automatically serving support files with the
// 'supportFile' configuration option.
//
// You can read more here:
// https://on.cypress.io/configuration
// ***********************************************************

// Import commands.js using ES2015 syntax:
import './commands'

// Alternatively you can use CommonJS syntax:
// require('./commands')
// cypress/support/e2e.js
import './commands';

Cypress.on('fail', (error, runnable) => {
    const testName = `${runnable.parent.title} -- ${runnable.title}`;
    cy.screenshot(`failures/${testName}`, { capture: 'runner' });
    throw error; // rethrow the error to have the test still fail
});
import 'cypress-mochawesome-reporter/register';

