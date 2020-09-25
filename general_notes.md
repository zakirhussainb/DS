           Bit Manipulation
1. Multiplication by 2 => Eg. N * 2 => N << 1
2. Division by 2 => Eg. N / 2 => N >> 1 or N >>> 1
3. Modulo by 2 => Eg. N % 2 => N & 1

           CodeForces Problems Difficulty Ratings

I have just reviewed the present histogram of the difficulty ratings using the filtering feature. The present 4721 problems in the problem set can be clustered into the following 12 groups with respect to their associated difficulty ratings.

| Group | Difficulty Range |
|-------|------------------|
| A     | 500-1000         |
| B     | 1100-1200        |
| C     | 1300-1400        |
| D     | 1500-1600        |
| E     | 1700-1800        |
| F     | 1900-2000        |
| G     | 2100-2200        |
| H     | 2300-2400        |
| I     | 2500-2600        |
| J     | 2700-2800        |
| K     | 2900-3000        |
| L     | 3100-3500        |

It should make sense that problems of future contests belong to the aforementioned groups as follows.

| Contest     | Difficulty Range |
|-------------|------------------|
| Div 3       | 500-2000         |
| Div 2       | 1500-2600        |
| Div 1       | 2100-3500        |
| Educational | 1300-2800        |

           CodeForces Problems Difficulty Ratings
https://codeforces.com/blog/entry/68288
           
           Coding Practice and Interview Plan
           
| Experience (at year start) | Age (at year start) | Year (start) |                                  Work to be Done (Entire Year)                                 |    Interviewing (at year start)   |
|:--------------------------:|:-------------------:|:------------:|:----------------------------------------------------------------------------------------------:|:---------------------------------:|
| 4.5                        | 26 over             | 2020         | Concepts Clarity + LC -> Graphs,Trees,Greedy,D&C(BS),DP,BT,Sort,HashMap,Bit-M,Arrays,LL,Stack  |                                   |
| 5.5                        | 27 over             | 2021         | LeetCode Everything -> Normal + Premium                                                        | Freshworks(Feb)/Walmart(Apr)      |
| 6.5                        | 28 over             | 2022         | FAAM Preparation -> From LC Premium(Interview Prep)                                            | Except FAAMG all others (Top 100) |
| 7.5                        | 29 over             | 2023         | Google Focused -> [LC-Google & KickStart Past Papers]                                          | Only FAAM                         |
| 8.5                        | 30 over             | 2024         | No DSA -> Start interviewing at Google -> From the starting of the year. Continue Practicing   | Only G                            |
           
           Web Application / Product Ideas
           
**System Design**
 - New Idea
    - To build a *Movie Information* application (similar to **IMDb**)
    - User can search a movie and provide his/her rating to that movie.
    - Functional Requirements:-
        - There must be User Profile page displaying the information about the user.
        - User must be able to search for a movie and rate the movie.
    - {Technical Components/Services}
        - This will be developed as a full stack microservice based application.
        - **Microservice 1 - Movie Information Service**
            - This will be written in python using pyscrapy and the purpose of this service is to crawl all 
            the movies available till date and store them with the relevant movie metadata in a 
            MongoDB(Database is subjective to change).
            - This is more of an internal service, that will not be connected to the outside world i.e. to external users.
            - This service will trigger regular CRON jobs to keep the database updated will all the movie information.
            - A newly added movie will initially have a rating of 0.
            - This **will not talk** to any other services, but other services like **ms-2** and **ms-3** will communicate
            with it for information.
        - **Microservice 2 - Movie Search Service**
            - This will appear on the landing page of the application.
            - With the help of this service, a user will be able to search for a movie using the title.
            - When the user selects a movie, this service talks to **ms-1**, to display all the information
            related to that movie.
        - **Microservice 3 - Movie Rating Service**
            - The only action a user can perform on a selected movie, is to rate that movie.
            - Movie Rating will be on a scale of 10.
            - Only users who are authorised by the application have the privileges to rate the movie.
            - If a user has not Signed In yet, the service must ask the user to sign in before providing any
            rating.
            - After a movie has been rated by a user, a **movie ranking algorithm** will determine the combined
            rating of the movie based on all the users who have rated that movie.
            - This service will talk to **ms-4** and **ms-1**, to get the **movieID** and the **userID** and update
            the rating information the user has provided for that movie.
        - **Microservice 4 - User Activity Service**
            - This service is responsible for all the user related activity.
            - Like storing the **User Profile** information, this can be SSO using Google or Facebook.
            - For now, this service will offer only one feature, **Your Ratings**
            - This **ms-4** will communicate with **ms-3** to provide the rating information a user has given
             to a particular movie.
            - **TL,DR:-** Basically this will list all the movies, which the user has rated, with the users ratings.
    - References/Links/Motivation:-
        - [Search Service](https://www.sitepoint.com/building-recipe-search-site-angular-elasticsearch/)
        - [Movie Rating Service](https://www.youtube.com/watch?v=Dmvhe2cw-_k)