# Login Specification

<pre>
Date Created         : 02/09/2018
Version   		     : 1.0.0
Owner      		     : Osanda Deshan
Description  	     : This is an executable specification file which covers the login scenarios.
Run in dev env       : mvn test-compile gauge:execute -DspecsDir="specs" -Denv="dev"
Run With Tags        : mvn test-compile gauge:execute -DspecsDir="specs" -Denv="dev" -Dtags="positive"
Run In Parallel      : mvn test-compile gauge:execute -DspecsDir="specs" -Denv="dev" -DinParallel=true
Re-run Failures      : mvn test-compile gauge:execute -Dflags="--failed"
Format Specs         : gauge format docs
Convert Specs To HTML: gauge docs spectacle specs
</pre>


table: ./src/test/resources/test data/test users.csv
tags: login


## Login to the application using valid email and valid password
tags: positive

* Login using the email as <Email> and password as <Password>
* Signout


## Login to the application using invalid email and invalid password
tags: negative

* On login page
* Login to the application using the email as "osa@mailinator.com" and password as "admin123"
* Page title is "Login - My Store"
