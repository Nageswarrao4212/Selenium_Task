## 🚀 How to Set Up and Run the Project

### Step 1: Install Prerequisites
- Install *Java JDK 8 or higher*  
  (Check by running java -version in CMD)

- Install *Google Chrome* (latest version)

- Download *ChromeDriver* → [ChromeDriver Downloads](https://chromedriver.chromium.org/downloads)  
  Make sure the version matches your Chrome browser.  
  Place the .exe file in a known folder like C:\drivers\chromedriver.exe

- Download *Selenium JAR files* → [Selenium Downloads](https://www.selenium.dev/downloads/)  
  Extract the ZIP and add all .jar files (including the ones inside /libs) to your project.

---

### Step 2: Set Up in Eclipse 

1. Open your IDE  
2. Create a new *Java Project* (example name: SeleniumSauceDemo)  
3. Copy your Script.java file into src/SauceDemo or your package  
4. Right-click the project → *Build Path → Configure Build Path → Add External JARs*  
5. Add all Selenium JARs (including /libs folder)  
6. Click *Apply and Close*

### Step 3: Run the Script

1. Open Script.java  
2. Make sure ChromeDriver path is correct (or added to system PATH)  
3. Right-click → *Run As → Java Application*

If everything is set up properly, Chrome will:
- Open SauceDemo website  
- Login with demo user  
- Add an item to the cart  
- Logout  
- Close browser  

---

## ⚙ Script Features
- Opens Chrome in incognito mode  
- Disables popups and notifications  
- Uses waits for stable element handling  
- Closes browser after finishing  

---

## 🎯 Expected Output

When the script runs successfully, you will see Chrome open and perform actions.  
In the console, it will show:

✅ Logged out successfully!
✅ Browser closed.
