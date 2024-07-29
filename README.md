Project title:
 Mobile testing using the appium in an emulator in the android application named "F-droid application".
Name:
  S.Prashanth
Description of the Project:
  Appium is an open source tool for testing mobile applications across different platforms like android, ios and windows. It uses the webdriver protocol to interact with the Ui elements of the mobile app.
  It uses an appium server which communicates with the mobile apps and the scripts written in the IDE.
![image](https://github.com/user-attachments/assets/2750562a-ff57-44bb-b25a-08a220f83f9b)

Instructions on how to setup and run the project:
  1.download the apk file 
  2.Open the emulator device
  3.copy paste the downloaded file in the platform tools in c drive (C:\Users\ADMIN\AppData\Local\Android\Sdk\platform-tools)
  4.open the command prompt in the platform tools(C:\Users\ADMIN\AppData\Local\Android\Sdk\platform-tools)
  5.use the command "adb install "downloadedfilenaem.apk"
  6.Open the command prompt in the emulator in c drive(C:\Users\ADMIN\AppData\Local\Android\Sdk\emulator)
  7.open the appium app in windows
  8.Set the desiredcapabilities-deviceName,platformName,appPackage,appActivity.
  9.Click on start session 
  10.Open the Spring tool Suite IDE
  11.Create a new maven project
  12.Add the dependencies in the pom.xml file
  
Dependencies:
  <project xmlns="https://maven.apache.org/POM/4.0.0" xmlns:xsi="https://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>Unit4_sdet_evaluation_1</groupId>
  <artifactId>Unit4_sdet_evaluation_1</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <dependenies>
	<!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.4.0</version>
    <scope>test</scope>
</dependency>
<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>3.141.59</version>
</dependency>
<!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
<dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>5.8.0</version>
</dependency>
<!-- https://mvnrepository.com/artifact/io.appium/java-client -->
<dependency>
    <groupId>io.appium</groupId>
    <artifactId>java-client</artifactId>
	    <version>7.3.0</version>
</dependency>
  </dependenies>
  <dependencies>
  	<dependency>
  		<groupId>demo_project_selenium</groupId>
  		<artifactId>demo_project_selenium</artifactId>
  		<version>0.0.1-SNAPSHOT</version>
  	</dependency>
  </dependencies>
</project>
