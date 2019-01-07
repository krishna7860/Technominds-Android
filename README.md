# Technominds-Android
GitHub Username​​ : ​ krishna7860
    
**COFFEE TIME**

**Description**

        Coffee Time, one of the most popular and interesting apps in World, brings you the latest
        trending stories, interesting videos, status as well as Hindi news, breaking news, Alert News in
        India from 680+ cities and content from different categories like politics, cricket, Tech, Business
        and more. Stay updated with trending news, videos & LIVE cricket score on India’s best news
        app.

**Technical Description**

        App Solely uses Java Programming Language. Resources such as strings,images etc would be
        placed appropriately inside their respective folder

**Intended User**

        This app is for anyone who wants to stay up to date with the latest news. This is for one who
        wants to read all categories news article within a single app, wherever they go whenever they
        want.

**Features**

        ● Trending News, Anytime, Anywhere! Read local news

        ● 🏆 News just for you, Smallest & Fastest News APP!

        ● All breaking news and top stories from India and around the World.

        ● 📱 Smooth on 2G/3G/4G/Wifi networks with Adaptive bitrate technology.

        ● Allows the user to search news article by the keyword

        ● Search articles and news up to 3 months old

        ● Redesigned for Tablet

        ● - 📄 Offline Reading, Store the categories you like offline and enjoy your content on the
          go.


**User Interface Mocks**

        These can be created by hand (take a photo of your drawings and insert them in this flow), or
        using a program like Google Drawings, ​ www.ninjamock.com​ , Paper by 53, Photoshop or
        Balsamiq.


**Screen 1**

 ![alt text](https://user-images.githubusercontent.com/31980947/50750905-3ddade80-126d-11e9-90d6-38bb8eef71b6.png)
     
        
        
        News App
        Home Screen Loads News From Differents Areas and top news and displayed them according
        to publish date sort order The News are Fetch From NewsApi

**Screen 2**

  ![alt text](https://user-images.githubusercontent.com/31980947/50750909-3f0c0b80-126d-11e9-8e26-bae836e3491b.png)
        
        
        T
        his Screen Actually Display the Details Screen of the News Which is and Intent for the main
        activity to a particular new here user can read full new in which they clicked on main Activity
        3Capstone_Stage1

**Screen 3**

 ![alt text](https://user-images.githubusercontent.com/31980947/50750915-429f9280-126d-11e9-9d54-84dcd919449d.png)
        
        
        Here News Are Categories for better Readability According to Some Category likes Business
        Entertainment Health And Etc And Display Them in A View Pager And Scrollable Tab Layout So
        U Can Easily Switch to intended news
    
**Screen 4**

![alt text](https://user-images.githubusercontent.com/31980947/50750920-4501ec80-126d-11e9-9ace-4440ff383498.png)
        
        
        This Is The Flash Screen For the App with the App Logo
        4Capstone_Stage1

**Screen 5**

![alt text](https://user-images.githubusercontent.com/31980947/50750921-47644680-126d-11e9-8847-10dfccb449a2.png)
        
        
        This Screens Display Settings For the App Where User Can Change Time Format, Search
        Language, Select Prefered Country and many more
    
**Screen 6**

![alt text](https://user-images.githubusercontent.com/31980947/50750922-49c6a080-126d-11e9-8819-220f67572ff1.png)
       
       
       This Is The Widget Layout For The App here Also The Latest News are shown and on clicking it
        ,it opens the app


**Screen 7**

 ![alt text](https://user-images.githubusercontent.com/31980947/50750924-4c28fa80-126d-11e9-8f3e-2ec49a26afaf.png)
          
          
          Notification Screens 


**Key Considerations**

    How will your app handle data persistence?

        ● App uses room database and view model implementation for data persistence

        ● News Are Stored in the Room Database for offline reading


**Describe any edge or corner cases in the UX.**

        ● User Navigate To Different Options like top News and Categories through

        ● Navigation Drawer

        ● You can Navigate to Details Activity By Clicking on the List Item

        ● The user can also click the home screen widget to open top headlines activity.

        ● Due to limited API usage rules the content of news is truncated thus to see full news user need to click read more.

        ● The App Enable RTL Support For Every Layout

        ● The App Increase Accessibility by using contentDescription for images loading
    
**Describe any libraries you’ll be using and share your reasoning for including them.**

        1. Picasso for loading images and caching them.[v2.5.2]

        2. Retrofit for implementing networking tasks[v2.4.0]

        3. Using Room database for data persistence[v1.1.1]

        4. Google Ads Service[v17.1.0]

        5. Google Analytic Service[v16.0.4]


**Describe how you will implement Google Play Services or other external services.**

        ● The app uses google analytics for error reporting

        ● Uses google ads for showing ads(Test ad) ,I will integrate ads at relevant places where it
          doesn’t interrupt user
    
**Next Steps: Required Tasks**

        This is the section where you can take the main features of your app (declared above) and
        break them down into tangible technical tasks that you can complete one at a time until you
        have a finished app.


**Task 1: Project Setup**

        ● First i will setup required dependencies and prepare and ER Diagram for my database

        ● Then i will Design a DFD to manage the flow of the App and its Activities
            ○ This also required diagram data flow from network to app and from app to
              database

        ● Then i Prepare a folder Structure to maintain the app separating data from UI and
          networks from others

        ● Create POJO’s according to the JSON data fetched, and map JSON to Java object.


**Task 2: Implement UI for Each Activity and Fragment**


        ● Build UI for MainActivity which might show a splash screen, attribute NewsAPI and setup  
          app

        ● Build ViewPager for CatagoryActivity

        ● Build News categories activity with the ViewPager and tab layout implementation

        ● Build the header layout for navigation drawer, and create option items for navigation
           drawer

**Task 3: Manage and Optimise Database operations**


        ● Make the relevant connection with the database and optimize its connection to save the
          news for later, even when offline.

        ● Store it last update date to show outdated data and limit the storage of news to 5 or 10
          articles.

**Task 4: ​ Adding Widget**

        ● After making Core structure i’ll design and add a widget

        ● Then i will make intent service to update wideget appropriately


**Task 5: ​ Simple Settings Page**

        ● Create a simple settings page and add an entry point to the navigation drawer

        ● Configure shared preference files

        ● Retrieve user selected option in the activities and fragments to make it work according to
          user preference

**Task 6: ​ Implementing Google Services**
        Subtasks:

        ● Implement Google Analytics and report the errors

        ● Show ads in activities

`
