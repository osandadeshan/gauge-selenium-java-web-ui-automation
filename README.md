# Web Cross Browser Automation Demo - Setup Guide
<br />

## Pre Requisites
1. Java
2. Maven
<br />

## How to Install Gauge Core

**On Windows**
1. Install Chocolatey by executing the following command. \
` @"%SystemRoot%\System32\WindowsPowerShell\v1.0\powershell.exe" -NoProfile -InputFormat None -ExecutionPolicy Bypass -Command "iex ((New-Object System.Net.WebClient).DownloadString(‘https://chocolatey.org/install.ps1'))" && SET "PATH=%PATH%;%ALLUSERSPROFILE%\chocolatey\bin"`

2. Install Gauge by executing the following command. \
`choco install gauge`

**On MacOS**
1. Update Homebrew. \
`brew update`

2. Install Gauge using Homebrew. \
`brew install gauge`

**On Linux**
1. First, add Gauge’s GPG key with this command. \
`sudo apt-key adv --keyserver hkp://pool.sks-keyservers.net --recv-keys 023EDB0B`

2. Then add Gauge to the repository list using this command. \
`echo deb https://dl.bintray.com/gauge/gauge-deb nightly main | sudo tee -a /etc/apt/sources.list`

3. Finally, install Gauge using these commands. \
`sudo apt-get update` \
`sudo apt-get install gauge`
<br />

## How to Install Gauge Plugins
1. Open Command Prompt and execute following commands. \
`gauge install java` \
`gauge install html-report` \
`gauge install json-report` \
`gauge install xml-report` \
`gauge install spectacle` \
`gauge install flash`

2. You can check the installation using the following command. \
`gauge -v`

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
<br />

## Configurations for IE 11 on Windows

1. Open **Registry Editor** (Windows Key + R → Type regedit → Press Enter).
2. For 32-bit Windows installations, the key you must examine in the registry editor is \
   **HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Internet Explorer\Main\FeatureControl\FEATURE_BFCACHE**
3. For 64-bit Windows installations, the key is \
   **HKEY_LOCAL_MACHINE\SOFTWARE\Wow6432Node\Microsoft\Internet Explorer\Main\FeatureControl\FEATURE_BFCACHE**
4. Please note that the **FEATURE_BFCACHE** subkey may or may not be present, and should be created if it is not present.
5. Inside this key, create a **DWORD** value named **iexplore.exe** with the value of **0**.
6. Go to **Internet Options** on Internet Explorer.
7. Go to **Security** tab.
8. Check **Enable Protected Mode** for all zones (Internet, Local intranet, Trusted sites and Restricted sites).
9. Click on **Apply** button.
10. Click on **OK** button.
<br />

|Browser    |Version                                |
|-----------|---------------------------------------|
|Chrome     |68.0.3440.106 (Official Build) (64-bit)|
|Firefox    |61.0.2 (64-bit)                        |
|IE         |11.228.17134.0			    |
|Edge       |42.17134.1.0		            |

<br />

Tested on **Windows 10 Core i7 Machine**.
