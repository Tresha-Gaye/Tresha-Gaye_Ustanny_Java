use game_store_catalog;

insert into game(title, esrb_rating, description, price, studio, quantity)
	values ('World of Goo', 'PG', 'puzzle video game', 12.99, '2D Boy', 25),
    ('World of Yes', 'Teen', 'awesome video game', 13.99, '2D Boy', 25),
    ('World of No', 'Everyone', 'OK video game', 14.99, 'Marvel', 25),
    ('World of Maybe', 'Mature', 'boring video game', 14.99, 'Marvel', 25);

insert into console(model, manufacturer, memory_amount, processor, price, quantity)
	values ('Nintendo Switch', 'Nintendo', '4GB', 'ARM 4 Cortex-A57', 299.99, 7),
    ('PlayStation 5', 'Sony', '4GB', 'ARM 4 Cortex-A57', 549.99, 10),
    ('XBox', 'Microsoft', '4GB', 'ARM 4 Cortex-A57', 349.98, 15),
    ('Nintendo Switch', 'Nintendo', '4GB', 'ARM 4 Cortex-A57', 499.99, 20);

insert into tshirt (size, color, description, price, quantity)
	values ('Med', 'Yellow', 'Science', 14.95, 10),
    ('Small', 'Red', 'Angry Birds', 15.95, 10),
    ('Large', 'Gold', 'Full House', 16.95, 10),
    ('XL', 'Black', 'Anime', 17.95, 10);