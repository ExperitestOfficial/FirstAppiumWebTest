# Web Testing basics using Appium

This project demonstrates Web Automation using Java and Appium in IntelliJ IDE.
Project is associated with the Blog  # Web Testing using Appium - <>

This example will cover:

Basic Test case creation using Java/TestNG framework using Appium Library/Appium Server.

### Steps to run demo test

1. Clone this git repository

	```
	git clone
	```

2. Start Appium Server using Appium Desktop installed in your PC.
   The project expects the Appium Server to run on localhost:4723. If you run the server to different host and port. Please change the code.


3. Modify following variables in the code if necessary
   Open AppiumWebTest.java and modify static variables if necessary,

      Appium Server listening host and port.

      ```
      public static final String APPIUM_SRV_URL = "http://localhost:4723/wd/hub";
      ```

      Device name (After executing adb devices. See "Initializing the driver" in the blog)

      ```
      public static final String DEVICE_NAME = "a3ae1c63";
      ```


5. To know how execute the test,
      * Open the cloned project in IntelliJ (Menu > Open )
      * Please follow the section "Execute the Run Configuration" in the blog.

