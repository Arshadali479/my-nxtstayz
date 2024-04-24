create table hotel(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name TEXT,
    location TEXT,
    rating INTEGER
);

create table room(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    roomNumber TEXT,
    type TEXT,
    price DOUBLE,
    hotelId INTEGER,
    FOREIGN KEY (hotelId) REFERENCES hotel(id) 
);