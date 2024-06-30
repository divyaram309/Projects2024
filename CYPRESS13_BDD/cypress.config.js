const { defineConfig } = require('cypress');
const browserify = require('@cypress/browserify-preprocessor');
const cucumber = require('cypress-cucumber-preprocessor').default;
const resolve = require('resolve');
const fs = require('fs');

module.exports = defineConfig({
  e2e: {
    setupNodeEvents(on, config) {
      const options = {
        ...browserify.defaultOptions,
        typescript: resolve.sync('typescript', { baseDir: config.projectRoot })
      };
      
      on('file:preprocessor', cucumber(options));

      // Ensure the reports directory exists
      if (!fs.existsSync('cypress/reports')) {
        fs.mkdirSync('cypress/reports', { recursive: true });
      }

      // Configure the mochawesome reporter
      require('cypress-mochawesome-reporter/plugin')(on);

      return config;
    },
    specPattern: 'cypress/e2e/**/*.feature',  // Ensure your feature files are in this location
    supportFile: 'cypress/support/e2e.js',
    
    // Add the reporter configuration
    reporter: 'cypress-multi-reporters',
    reporterOptions: {
      reporterEnabled: 'cypress-mochawesome-reporter',
      cypressMochawesomeReporterReporterOptions: {
        reportDir: 'cypress/reports',
        overwrite: false,
        html: true,
        json: true,
        charts: true,
        embeddedScreenshots: true
      }
    },
    screenshotsFolder: 'cypress/screenshots',
    videosFolder: 'cypress/videos',
    trashAssetsBeforeRuns: true
  },
});
