SHOW DATABASES ;
USE din_joins;
SHOW TABLES ;
SELECT * FROM customer;
SELECT * FROM `order`;
SELECT * FROM item;

INSERT INTO `order`(order_id, item_code, quantity)
VALUES ('OR05', '0014', 5),
       ('OR06', '0015', 11),
       ('OR07', '0013', 4),
       ('OR08', '0011', 5);

SELECT order_id, COUNT(*)
FROM `order`
GROUP BY order_id;

SELECT MIN(price) FROM item;
CREATE TABLE `customers`
(
    `customerNumber`         int(11)     NOT NULL,
    `customerName`           varchar(50) NOT NULL,
    `contactLastName`        varchar(50) NOT NULL,
    `contactFirstName`       varchar(50) NOT NULL,
    `phone`                  varchar(50) NOT NULL,
    `addressLine1`           varchar(50) NOT NULL,
    `addressLine2`           varchar(50)    DEFAULT NULL,
    `city`                   varchar(50) NOT NULL,
    `state`                  varchar(50)    DEFAULT NULL,
    `postalCode`             varchar(15)    DEFAULT NULL,
    `country`                varchar(50) NOT NULL,
    `salesRepEmployeeNumber` int(11)        DEFAULT NULL,
    `creditLimit`            decimal(10, 2) DEFAULT NULL,
    PRIMARY KEY (`customerNumber`));


insert into `customers`(`customerNumber`, `customerName`, `contactLastName`, `contactFirstName`, `phone`,
                        `addressLine1`, `addressLine2`, `city`, `state`, `postalCode`, `country`,
                        `salesRepEmployeeNumber`, `creditLimit`)
values (103, 'Atelier graphique', 'Schmitt', 'Carine ', '40.32.2555', '54, rue Royale', NULL, 'Nantes', NULL, '44000',
        'France', 1370, '21000.00'),

       (112, 'Signal Gift Stores', 'King', 'Jean', '7025551838', '8489 Strong St.', NULL, 'Las Vegas', 'NV', '83030',
        'USA', 1166, '71800.00'),

       (114, 'Australian Collectors, Co.', 'Ferguson', 'Peter', '03 9520 4555', '636 St Kilda Road', 'Level 3',
        'Melbourne', 'Victoria', '3004', 'Australia', 1611, '117300.00'),

       (119, 'La Rochelle Gifts', 'Labrune', 'Janine ', '40.67.8555', '67, rue des Cinquante Otages', NULL, 'Nantes',
        NULL, '44000', 'France', 1370, '118200.00'),

       (121, 'Baane Mini Imports', 'Bergulfsen', 'Jonas ', '07-98 9555', 'Erling Skakkes gate 78', NULL, 'Stavern',
        NULL, '4110', 'Norway', 1504, '81700.00'),

       (124, 'Mini Gifts Distributors Ltd.', 'Nelson', 'Susan', '4155551450', '5677 Strong St.', NULL, 'San Rafael',
        'CA', '97562', 'USA', 1165, '210500.00'),

       (125, 'Havel & Zbyszek Co', 'Piestrzeniewicz', 'Zbyszek ', '(26) 642-7555', 'ul. Filtrowa 68', NULL, 'Warszawa',
        NULL, '01-012', 'Poland', NULL, '0.00'),

       (128, 'Blauer See Auto, Co.', 'Keitel', 'Roland', '+49 69 66 90 2555', 'Lyonerstr. 34', NULL, 'Frankfurt', NULL,
        '60528', 'Germany', 1504, '59700.00'),

       (129, 'Mini Wheels Co.', 'Murphy', 'Julie', '6505555787', '5557 North Pendale Street', NULL, 'San Francisco',
        'CA', '94217', 'USA', 1165, '64600.00'),

       (131, 'Land of Toys Inc.', 'Lee', 'Kwai', '2125557818', '897 Long Airport Avenue', NULL, 'NYC', 'NY', '10022',
        'USA', 1323, '114900.00'),

       (141, 'Euro+ Shopping Channel', 'Freyre', 'Diego ', '(91) 555 94 44', 'C/ Moralzarzal, 86', NULL, 'Madrid', NULL,
        '28034', 'Spain', 1370, '227600.00'),

       (144, 'Volvo Model Replicas, Co', 'Berglund', 'Christina ', '0921-12 3555', 'Berguvsvägen  8', NULL, 'Luleå',
        NULL, 'S-958 22', 'Sweden', 1504, '53100.00'),

       (145, 'Danish Wholesale Imports', 'Petersen', 'Jytte ', '31 12 3555', 'Vinbæltet 34', NULL, 'Kobenhavn', NULL,
        '1734', 'Denmark', 1401, '83400.00'),

       (146, 'Saveley & Henriot, Co.', 'Saveley', 'Mary ', '78.32.5555', '2, rue du Commerce', NULL, 'Lyon', NULL,
        '69004', 'France', 1337, '123900.00'),

       (148, 'Dragon Souveniers, Ltd.', 'Natividad', 'Eric', '+65 221 7555', 'Bronz Sok.', 'Bronz Apt. 3/6 Tesvikiye',
        'Singapore', NULL, '079903', 'Singapore', 1621, '103800.00'),

       (151, 'Muscle Machine Inc', 'Young', 'Jeff', '2125557413', '4092 Furth Circle', 'Suite 400', 'NYC', 'NY',
        '10022', 'USA', 1286, '138500.00'),

       (157, 'Diecast Classics Inc.', 'Leong', 'Kelvin', '2155551555', '7586 Pompton St.', NULL, 'Allentown', 'PA',
        '70267', 'USA', 1216, '100600.00'),

       (161, 'Technics Stores Inc.', 'Hashimoto', 'Juri', '6505556809', '9408 Furth Circle', NULL, 'Burlingame', 'CA',
        '94217', 'USA', 1165, '84600.00'),

       (166, 'Handji Gifts& Co', 'Victorino', 'Wendy', '+65 224 1555', '106 Linden Road Sandown', '2nd Floor',
        'Singapore', NULL, '069045', 'Singapore', 1612, '97900.00'),

       (167, 'Herkku Gifts', 'Oeztan', 'Veysel', '+47 2267 3215', 'Brehmen St. 121', 'PR 334 Sentrum', 'Bergen', NULL,
        'N 5804', 'Norway  ', 1504, '96800.00'),

       (168, 'American Souvenirs Inc', 'Franco', 'Keith', '2035557845', '149 Spinnaker Dr.', 'Suite 101', 'New Haven',
        'CT', '97823', 'USA', 1286, '0.00'),

       (169, 'Porto Imports Co.', 'de Castro', 'Isabel ', '(1) 356-5555', 'Estrada da saúde n. 58', NULL, 'Lisboa',
        NULL, '1756', 'Portugal', NULL, '0.00'),

       (171, 'Daedalus Designs Imports', 'Rancé', 'Martine ', '20.16.1555', '184, chaussée de Tournai', NULL, 'Lille',
        NULL, '59000', 'France', 1370, '82900.00'),

       (172, 'La Corne D\'abondance, Co.', 'Bertrand', 'Marie', '(1) 42.34.2555', '265, boulevard Charonne', NULL,
        'Paris', NULL, '75012', 'France', 1337, '84300.00'),

       (173, 'Cambridge Collectables Co.', 'Tseng', 'Jerry', '6175555555', '4658 Baden Av.', NULL, 'Cambridge', 'MA',
        '51247', 'USA', 1188, '43400.00'),

       (175, 'Gift Depot Inc.', 'King', 'Julie', '2035552570', '25593 South Bay Ln.', NULL, 'Bridgewater', 'CT',
        '97562', 'USA', 1323, '84300.00'),

       (177, 'Osaka Souveniers Co.', 'Kentary', 'Mory', '+81 06 6342 5555', '1-6-20 Dojima', NULL, 'Kita-ku', 'Osaka',
        ' 530-0003', 'Japan', 1621, '81200.00'),

       (181, 'Vitachrome Inc.', 'Frick', 'Michael', '2125551500', '2678 Kingston Rd.', 'Suite 101', 'NYC', 'NY',
        '10022', 'USA', 1286, '76400.00'),

       (186, 'Toys of Finland, Co.', 'Karttunen', 'Matti', '90-224 8555', 'Keskuskatu 45', NULL, 'Helsinki', NULL,
        '21240', 'Finland', 1501, '96500.00'),

       (187, 'AV Stores, Co.', 'Ashworth', 'Rachel', '(171) 555-1555', 'Fauntleroy Circus', NULL, 'Manchester', NULL,
        'EC2 5NT', 'UK', 1501, '136800.00'),

       (189, 'Clover Collections, Co.', 'Cassidy', 'Dean', '+353 1862 1555', '25 Maiden Lane', 'Floor No. 4', 'Dublin',
        NULL, '2', 'Ireland', 1504, '69400.00'),

       (198, 'Auto-Moto Classics Inc.', 'Taylor', 'Leslie', '6175558428', '16780 Pompton St.', NULL, 'Brickhaven', 'MA',
        '58339', 'USA', 1216, '23000.00'),

       (201, 'UK Collectables, Ltd.', 'Devon', 'Elizabeth', '(171) 555-2282', '12, Berkeley Gardens Blvd', NULL,
        'Liverpool', NULL, 'WX1 6LT', 'UK', 1501, '92700.00'),

       (202, 'Canadian Gift Exchange Network', 'Tamuri', 'Yoshi ', '(604) 555-3392', '1900 Oak St.', NULL, 'Vancouver',
        'BC', 'V3F 2K1', 'Canada', 1323, '90300.00'),

       (204, 'Online Mini Collectables', 'Barajas', 'Miguel', '6175557555', '7635 Spinnaker Dr.', NULL, 'Brickhaven',
        'MA', '58339', 'USA', 1188, '68700.00'),

       (205, 'Toys4GrownUps.com', 'Young', 'Julie', '6265557265', '78934 Hillside Dr.', NULL, 'Pasadena', 'CA', '90003',
        'USA', 1166, '90700.00'),

       (206, 'Asian Shopping Network, Co', 'Walker', 'Brydey', '+612 9411 1555', 'Suntec Tower Three', '8 Temasek',
        'Singapore', NULL, '038988', 'Singapore', NULL, '0.00'),

       (209, 'Mini Caravy', 'Citeaux', 'Frédérique ', '88.60.1555', '24, place Kléber', NULL, 'Strasbourg', NULL,
        '67000', 'France', 1370, '53800.00'),

       (211, 'King Kong Collectables, Co.', 'Gao', 'Mike', '+852 2251 1555', 'Bank of China Tower', '1 Garden Road',
        'Central Hong Kong', NULL, NULL, 'Hong Kong', 1621, '58600.00'),

       (216, 'Enaco Distributors', 'Saavedra', 'Eduardo ', '(93) 203 4555', 'Rambla de Cataluña, 23', NULL, 'Barcelona',
        NULL, '08022', 'Spain', 1702, '60300.00'),

       (219, 'Boards & Toys Co.', 'Young', 'Mary', '3105552373', '4097 Douglas Av.', NULL, 'Glendale', 'CA', '92561',
        'USA', 1166, '11000.00'),

       (223, 'Natürlich Autos', 'Kloss', 'Horst ', '0372-555188', 'Taucherstraße 10', NULL, 'Cunewalde', NULL, '01307',
        'Germany', NULL, '0.00'),

       (227, 'Heintze Collectables', 'Ibsen', 'Palle', '86 21 3555', 'Smagsloget 45', NULL, 'Århus', NULL, '8200',
        'Denmark', 1401, '120800.00'),

       (233, 'Québec Home Shopping Network', 'Fresnière', 'Jean ', '(514) 555-8054', '43 rue St. Laurent', NULL,
        'Montréal', 'Québec', 'H1J 1C3', 'Canada', 1286, '48700.00'),

       (237, 'ANG Resellers', 'Camino', 'Alejandra ', '(91) 745 6555', 'Gran Vía, 1', NULL, 'Madrid', NULL, '28001',
        'Spain', NULL, '0.00'),

       (239, 'Collectable Mini Designs Co.', 'Thompson', 'Valarie', '7605558146', '361 Furth Circle', NULL, 'San Diego',
        'CA', '91217', 'USA', 1166, '105000.00'),

       (240, 'giftsbymail.co.uk', 'Bennett', 'Helen ', '(198) 555-8888', 'Garden House', 'Crowther Way 23', 'Cowes',
        'Isle of Wight', 'PO31 7PJ', 'UK', 1501, '93900.00'),

       (242, 'Alpha Cognac', 'Roulet', 'Annette ', '61.77.6555', '1 rue Alsace-Lorraine', NULL, 'Toulouse', NULL,
        '31000', 'France', 1370, '61100.00'),

       (247, 'Messner Shopping Network', 'Messner', 'Renate ', '069-0555984', 'Magazinweg 7', NULL, 'Frankfurt', NULL,
        '60528', 'Germany', NULL, '0.00'),

       (249, 'Amica Models & Co.', 'Accorti', 'Paolo ', '011-4988555', 'Via Monte Bianco 34', NULL, 'Torino', NULL,
        '10100', 'Italy', 1401, '113000.00'),

       (250, 'Lyon Souveniers', 'Da Silva', 'Daniel', '+33 1 46 62 7555', '27 rue du Colonel Pierre Avia', NULL,
        'Paris', NULL, '75508', 'France', 1337, '68100.00'),

       (256, 'Auto Associés & Cie.', 'Tonini', 'Daniel ', '30.59.8555', '67, avenue de l\'Europe', NULL, 'Versailles',
        NULL, '78000', 'France', 1370, '77900.00'),

       (259, 'Toms Spezialitäten, Ltd', 'Pfalzheim', 'Henriette ', '0221-5554327', 'Mehrheimerstr. 369', NULL, 'Köln',
        NULL, '50739', 'Germany', 1504, '120400.00'),

       (260, 'Royal Canadian Collectables, Ltd.', 'Lincoln', 'Elizabeth ', '(604) 555-4555', '23 Tsawassen Blvd.', NULL,
        'Tsawassen', 'BC', 'T2F 8M4', 'Canada', 1323, '89600.00'),

       (273, 'Franken Gifts, Co', 'Franken', 'Peter ', '089-0877555', 'Berliner Platz 43', NULL, 'München', NULL,
        '80805', 'Germany', NULL, '0.00'),

       (276, 'Anna\'s Decorations, Ltd', 'O\'Hara', 'Anna', '02 9936 8555', '201 Miller Street', 'Level 15',
        'North Sydney', 'NSW', '2060', 'Australia', 1611, '107800.00'),

       (278, 'Rovelli Gifts', 'Rovelli', 'Giovanni ', '035-640555', 'Via Ludovico il Moro 22', NULL, 'Bergamo', NULL,
        '24100', 'Italy', 1401, '119600.00'),

       (282, 'Souveniers And Things Co.', 'Huxley', 'Adrian', '+61 2 9495 8555', 'Monitor Money Building',
        '815 Pacific Hwy', 'Chatswood', 'NSW', '2067', 'Australia', 1611, '93300.00'),

       (286, 'Marta\'s Replicas Co.', 'Hernandez', 'Marta', '6175558555', '39323 Spinnaker Dr.', NULL, 'Cambridge',
        'MA', '51247', 'USA', 1216, '123700.00'),

       (293, 'BG&E Collectables', 'Harrison', 'Ed', '+41 26 425 50 01', 'Rte des Arsenaux 41 ', NULL, 'Fribourg', NULL,
        '1700', 'Switzerland', NULL, '0.00');

SELECT * FROM customers;

# UCASE
SELECT customerName, UCASE(contactLastName) FROM customers;

SELECT LENGTH(customerName) FROM customers;



