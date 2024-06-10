# xenon

Playwright w. JAVA

## Pre-Requisites

1. Latest version of node: `node --version`
2. Latest version of npm: `npm --version`
3. Latest version of playwright: `playwright --version`

To make the necessary updates:

```
# node
brew update
brew doctor
brew upgrade node

# npm
npm install -g npm

# playwright
npm install -D @playwright/test@latest - for the framework
npx playwright install - for the browsers
```

## Setup

1. Create a directory, then navigate to it
2. Initialize npm: `npm init -y`
3. Install playwright: `npm init playwright@latest`
4. For API Testing - Fake data: `npm install --save-dev @faker-js/faker`
5. For API Testing - Fake date: `npm install --save-dev luxon`
6. For API Testing - Clean Folder Before Test Run: `npm install --save-dev rimraf`

## PW Commands

1. Run the end-to-end tests: `npx playwright test`
2. Start interactive UI mode: `npx playwright`
3. Run tests in a distinct browser: `npx playwright test --project=chromium`
4. Run a specific test: `npx playwright test <file>`
5. Run tests in debug mode: `npx playwright test --debug`
6. Run tests by tag (make sure you add them to the test description): `npx playwright test --grep "@tag"`
7. DEBUG failing tests - Run traceview tests: `npx playwright test --trace on`
8. Generate report to view trace: `npx playwright show-report`

## Create desired structure

```
..tests
  |_components
    |_test_name.spec.js
  |_api
    |_test_name.spec.js
  |_e2e
    |_page-objects
    |_page-locators
    |_specs
```

## PAGE-Object Template

1. Create a directory under the root of the test directory -- `page-objects`
2. Create files for the relevant names of the pages under test -- `nameOfPage.js`
3. In the file, use the following boilerplate and customize accordingly

```
TBD
```

4. In the test(test_name.spec.js), import the class and functions, as in the following example:

```
TBD
```
