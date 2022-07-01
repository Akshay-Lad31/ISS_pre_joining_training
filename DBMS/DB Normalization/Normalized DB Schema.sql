CREATE DATABASE IPL;
USE IPL;
CREATE TABLE umpires (
	UmpireID INT PRIMARY KEY,
	Umpire_name VARCHAR(100),
	Matches_umpired INT
);

CREATE TABLE venues (
	VenueID INT PRIMARY KEY,
	Venue_name VARCHAR(255),
	Venue_city VARCHAR(100),
);

CREATE TABLE teams (
	TeamID INT PRIMARY KEY,
	Team_name VARCHAR(100),
	Team_acronym VARCHAR(10),
	Team_city VARCHAR(100),
);

CREATE TABLE players (
	PlayerID INT PRIMARY KEY,
	Player_name VARCHAR(100),
	Team_id INT,
	FOREIGN KEY (Team_id) REFERENCES teams(TeamID)
);

CREATE TABLE matches (
	MatchID INT PRIMARY KEY,
	Match_date DATE,
	Venue_id INT,
	Umpire1_id INT,
	Umpire2_id INT,
	Team1_id INT,
	Team2_id INT,
	Toss_winner_id INT,
	Toss_decission VARCHAR(10),
	Winner_id INT,
	Win_by VARCHAR(10),
	Win_margin INT,
	FOREIGN KEY (Venue_id) REFERENCES venues(VenueID),
	FOREIGN KEY (Umpire1_id) REFERENCES umpires(UmpireID),
	FOREIGN KEY (Umpire2_id) REFERENCES umpires(UmpireID),
	FOREIGN KEY (Team1_id) REFERENCES teams(TeamID),
	FOREIGN KEY (Team2_id) REFERENCES teams(TeamID),
	FOREIGN KEY (Toss_winner_id) REFERENCES teams(TeamID),
	FOREIGN KEY (Winner_id) REFERENCES teams(TeamID)
);

CREATE TABLE dismissal_type(
	Dismissal_typeID INT PRIMARY KEY,
	Dis_type_name VARCHAR(20)
);

CREATE TABLE extra_runs(
	ExtrasID INT PRIMARY KEY,
	Extra_Type VARCHAR(10),
	Extra_runs INT
);

CREATE TABLE deliveries (
	DeliveryID INT PRIMARY KEY,
	Match_id INT,
	Inning_no INT,
	Over_no INT,
	Ball_no INT,
	Batsman_runs INT,
	Total_runs INT,
	Extra_id INT,
	Batsman_id INT,
	Nonstriker_id INT,
	Bowler_id INT,
	FOREIGN KEY (Match_id) REFERENCES matches(MatchID),
	FOREIGN KEY (Batsman_id) REFERENCES players(PlayerID),
	FOREIGN KEY (Nonstriker_id) REFERENCES players(PlayerID),
	FOREIGN KEY (Bowler_id) REFERENCES players(PlayerID)
);

CREATE TABLE player_dismissal(
	player_dismissalID INT PRIMARY KEY,
	Delivery_id INT,
	Dismissed_player_id INT,
	Fielder_id INT,
	Dismissal_type_id INT,
	FOREIGN KEY (Delivery_id) REFERENCES deliveries(DeliveryID),
	FOREIGN KEY (Dismissed_player_id) REFERENCES players(PlayerID),
	FOREIGN KEY (Fielder_id) REFERENCES players(PlayerID),
	FOREIGN KEY (Dismissal_type_id) REFERENCES dismissal_type(Dismissal_typeID)
);
