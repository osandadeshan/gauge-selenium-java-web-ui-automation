# Gauge Java Web UI Automation Demo

## Pre-requisites
1. Java
2. Maven

## How to install Gauge core
Follow the instructions mentioned in [Installing Gauge](https://docs.gauge.org/getting_started/installing-gauge?os=windows&language=java&ide=vscode) in the official [Gauge Documentation](https://docs.gauge.org/)

## How to install Gauge plugins
1. Open Command Prompt and execute following commands.
   
   `gauge install java`
   
   `gauge install html-report`
   
   `gauge install json-report`
   
   `gauge install xml-report`
   
   `gauge install spectacle`
   
   `gauge install flash`

2. You can check the installation using the following command.
   
   `gauge -v`

**Note:**
If the installation is success, it will output like this:

```markdown
    Gauge version: <version number>
    Plugins
    -------
    flash (<version number>)
    html-report (<version number>)
    java (<version number>)
    json-report (<version number>)
    spectacle (<version number>)
    xml-report (<version number>)
```

## Executing specifications

### General specs execution
- Run the below command to execute all specifications in `specs` directory

   ```
   mvn gauge:execute -DspecsDir=specs
   ```

- Run the below command to execute a single specification

   ```
   mvn gauge:execute -DspecsDir=specs/example.spec
   ```

- Run the below command to execute specifications in `specs` and `specDir` directories

   ```
   mvn gauge:execute -DspecsDir="specs,specDir"
   ```

- Run the below command to execute the failed scenarios

   ```
   mvn gauge:execute -Dflags="--failed"
   ```

- Run the below command to execute the repeat scenarios

   ```
   mvn gauge:execute -Dflags="--repeat"
   ```

**Note:**
`mvn test-compile` should be used for the tool to get latest changes of user code.

### Execute specs In parallel

```
mvn gauge:execute -DspecsDir=specs -DinParallel=true
```

### Execute specs by tags expression

```
mvn gauge:execute -DspecsDir=specs -Dtags="!in-progress"
```

### Execute spec by scenario name

```
mvn gauge:execute -DspecsDir=specs -Dscenario="Scenario Name"
```

### Specifying execution environment

```
mvn gauge:execute -DspecsDir=specs -Denv="dev"
```

### Execute specs as a part of maven test phase

Run gauge specs in project as a part of maven test phase by adding the below execution to yor pom.xml

```
<build>
     <plugins>
         <plugin>
             <groupId>com.thoughtworks.gauge.maven</groupId>
             <artifactId>gauge-maven-plugin</artifactId>
             <version>1.6.1</version>
             <executions>
                 <execution>
                     <phase>test</phase>
                     <configuration>
                         <specsDir>specs</specsDir>
                         <environmentVariables>
                            <CUSTOM_ENV_VARIABLE>value</CUSTOM_ENV_VARIABLE>
                         </environmentVariables>
                     </configuration>
                     <goals>
                         <goal>execute</goal>
                     </goals>
                 </execution>
             </executions>
         </plugin>
       </plugins>
 </build>
```

`mvn test` command will also run gauge specs if the above mentioned execution is added to the projects pom.xml

### Validate specs in project

- Run the below command to execute all specifications in `specs` directory

    ```
    mvn gauge:validate -DspecsDir=specs
    ```

- Run the below command to validate and ignore stub implementation suggestions

    ```
    mvn gauge:validate -Dflags="--hide-suggestion"
    ```

### Execute specs as a part of maven test-compile phase

Validate gauge specs in project as a part of maven test-compile phase by adding the below execution to yor pom.xml

```
<build>
     <plugins>
         <plugin>
             <groupId>com.thoughtworks.gauge.maven</groupId>
             <artifactId>gauge-maven-plugin</artifactId>
             <version>1.6.1</version>
             <executions>
                 <execution>
                     <phase>test-compile</phase>
                     <configuration>
                         <specsDir>specs</specsDir>
                         <flags>
                            <flag>--hide-suggestion</flag>
                         </flags>
                     </configuration>
                     <goals>
                         <goal>validate</goal>
                     </goals>
                 </execution>
             </executions>
         </plugin>
       </plugins>
 </build>
```

### Running both validate and execute goals as part of maven

Add the following execution to pom.xml to run both goals:

```
<plugin>
    <groupId>com.thoughtworks.gauge.maven</groupId>
    <artifactId>gauge-maven-plugin</artifactId>
    <version>1.6.1</version>
    <executions>
        <execution>
            <id>validate</id>
            <phase>test-compile</phase>
            <goals>
                <goal>validate</goal>
            </goals>
        </execution>
        <execution>
            <id>execute</id>
            <phase>test</phase>
            <goals><goal>execute</goal></goals>
            <configuration>
                <specsDir>specs</specsDir>
            </configuration>
        </execution>
    </executions>
</plugin>
```

### All Properties

The following plugin properties can be additionally set:

| Property name | Usage                               | Description                                                                                                               |
|---------------|-------------------------------------|---------------------------------------------------------------------------------------------------------------------------|
| specsDir      | -DspecsDir=specs                    | Gauge specs directory path. Required for executing specs. Takes a comma separated list of specification files/directories |
| tags          | -Dtags="tag1 & tag2"                | Filter specs by specified tags expression                                                                                 |
| inParallel    | -DinParallel=true                   | Execute specs in parallel                                                                                                 |
| nodes         | -Dnodes=3                           | Number of parallel execution streams. Use with `parallel`                                                                 |
| env           | -Denv=qa                            | gauge env to run against                                                                                                  |
| flags         | -Dflags="--verbose,--simpleConsole" | Add additional gauge flags to execution                                                                                   |

## Internet Explorer 11 configurations for a Windows machine

1. Open "**Registry Editor**" (Windows Key + R → Type regedit → Press Enter).
   
2. For 32-bit Windows installations, the key you must examine in the registry editor is
   
   `HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Internet Explorer\Main\FeatureControl\FEATURE_BFCACHE`
   
3. For 64-bit Windows installations, the key is
   
   `HKEY_LOCAL_MACHINE\SOFTWARE\Wow6432Node\Microsoft\Internet Explorer\Main\FeatureControl\FEATURE_BFCACHE`
   
4. Please note that the "**FEATURE_BFCACHE**" sub key may or may not be present, and should be created if it is not present.
   
5. Inside this key, create a "**DWORD**" value named "**iexplore.exe**" with the value of "**0**".
    
6. Go to "**Internet Options**" on Internet Explorer.
    
7. Go to "**Security**" tab.
    
8. Check "**Enable Protected Mode**" for all zones (Internet, Local intranet, Trusted sites and Restricted sites).
    
9. Click on "**Apply**" button.
    
10. Click on "**OK**" button.

**Note:**
Tested using a **Windows 10 Core i7 Machine**.
