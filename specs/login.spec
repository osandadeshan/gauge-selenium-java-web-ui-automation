# Login Specification

Project Name    : gauge-java-web-ui-automation-demo
Developer       : Osanda Deshan
Version         : 1.0.0
Date            : 30/12/23
Time            : 11:40 AM
Description     : This is an executable specification file which covers the login scenarios.

table: ./src/test/resources/test data/test users.csv

tags: login


## Login to the application using valid email and valid password

tags: positive

* Login using the username as <Username> and password as <Password>
* Logged-in username should be <Username>

## Login to the application using invalid email and invalid password

tags: negative

* On login page
* Login to the application using the username as "dev-test" and password as "admin123"
* Wrong password error alert should be visible
