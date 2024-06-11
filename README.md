# xenon

Playwright w. JAVA

## Pre-Requisites

1. Latest version of node: `node --version`
2. Latest version of npm: `npm --version`
3. Latest version of playwright: `playwright --version`
4. Latest version of java: `java --version`
5. Latest version of maven: `mvn --version`

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

#java for Mac
visit: https://osxdaily.com/2024/06/03/how-install-java-mac-m3-m2-m1-apple-silicon/

#java on Windows
visit: https://www.supportyourtech.com/articles/how-to-install-java-on-windows-11-a-step-by-step-guide-for-beginners/

Confirm you also have the right runtime environment

# maven on Mac
https://macpaw.com/how-to/install-maven-on-mac

# maven on Windows
https://maven.apache.org/install.html
```

## Setup

1. Create a directory, then navigate to it
2. Initialize npm: `npm init -y`
3. Install playwright: `npm init playwright@latest`

## PW Commands

1. Run tests in a distinct browser: `mvn compile exec:java -D exec.mainClass="com.appName.className"` (in the directory where the POM file is located)
2. Run a specific test: `<file>`
3. Generate report to view trace: `TBD`

## Create desired structure

```
..tests
  |_e2e
    |_src/main/java/com/appName
      |_className.java
      |_page-locators
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
