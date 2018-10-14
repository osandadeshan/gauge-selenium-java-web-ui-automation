# Web-Cross-Browser-Automation-Demo

### Configurations for IE 11 on Windows

1. Open **Registry Editor** (Windows Key + R → Type regedit → Press Enter).
2. For 32-bit Windows installations, the key you must examine in the registry editor is 
   **HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Internet Explorer\Main\FeatureControl\FEATURE_BFCACHE**
3. For 64-bit Windows installations, the key is
   **HKEY_LOCAL_MACHINE\SOFTWARE\Wow6432Node\Microsoft\Internet Explorer\Main\FeatureControl\FEATURE_BFCACHE**
4. Please note that the **FEATURE_BFCACHE** subkey may or may not be present, and should be created if it is not present.
5. Inside this key, create a **DWORD** value named **iexplore.exe** with the value of **0**.
6. Go to **Internet Options** on Internet Explorer.
7. Go to **Security** tab.
8. Check **Enable Protected Mode** for all zones (Internet, Local intranet, Trusted sites and Restricted sites).
9. Click on **Apply** button.
10. Click on **OK** button.


|Browser    |Version                                |
|-----------|---------------------------------------|
|Chrome     |68.0.3440.106 (Official Build) (64-bit)|
|Firefox    |61.0.2 (64-bit)                        |
|IE         |11.228.17134.0			    |
|Edge       |42.17134.1.0		            |


Tested on **Windows 10 Core i7 Machine**.
