# java-football-data

> ⚽️ Java library for football-data.org's API.

[![MIT Licence](https://badges.frapsoft.com/os/mit/mit.svg?v=103)](https://opensource.org/licenses/mit-license.php)

This small java library allows you to get all the football data from the football-data.org API. The following data types and championships are available :

### Data types
- Compétitions 
- Matchs 
- Teams
- Standing
- Players

### Championships
- Brazil : Série A
- England	: Championship
- England :	Premier League
- Europe : UEFA Champions League
- Europe : European Championship
- France : Ligue 1
- Germany	: Bundesliga
- Italy :	Serie A
- Netherlands	: Eredivisie
- Portugal : Primeira Liga
- Spain :	Primera Division
- World	: FIFA World Cup

For more information on the football-data.org API, [visit the website.](https://www.football-data.org) 

## How to use ?

The first thing to do to use the java library is to create an account on football-data.org to get a token. After that, integrate the library into your project.

Now you can instantiate the JfdataManager class with your token and the desired return type, like this :

```java
JfdataManager jfdataManager = new JfdataManager("MY_TOKEN", "minified");
```

The JfdataManager class then allows you to access a set of methods:

```java
JfdataManager jfdataManager = new JfdataManager("MY_TOKEN", "minified");
MatchListModel matchForTeam = jfdataManager.getMatchByTeam(527);
```

The result in POJO :

```java
MatchListModel [
	count=38, 
	matches=[
		MatchModel [
			id=238995, 
			competition=Competition [
				id=2015, 
				name=Ligue 1, 
				season=CompetitionSeason [
					id=177, 
					startDate=2018-08-10, 
					endDate=2019-05-25, 
					currentMatchday=4
					], 
				utcDate=2018-08-11T18:00:00Z, 
				status=FINISHED, 
				venue=null, 
				matchday=1, 
				stage=REGULAR_SEASON, 
				group=Regular Season, 
				lastUpdated=2018-08-14T16:01:34Z, 
				homeTeam=TeamModel [
					id=527, 
					area=null, 
					name=AS Saint-Étienne, 
					], 
				awayTeam=TeamModel [
					id=538, 
					name=En Avant Guingamp], 
				score=MatchScoreModel [
					winner=HOME_TEAM, 
					duration=REGULAR, 
						fullTime=MatchTimeModel [
							homeTeam=2, 
							awayTeam=1], 
						referees=[
							MatchRefereesModel [
								id=43917, 
								name=Amaury Delerue, 
								nationality=null]
							]
						]....
```

While waiting for the complete documentation, the sources contain the tests for the method sets in [test folder.](https://github.com/Airmime/java-football-data/tree/master/src/test/java/test) 
