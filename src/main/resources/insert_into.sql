INSERT INTO  tg.public.documents
VALUES ('1','Паспорт'),
       ('2','Заявление'),
       ('3','Справка');

INSERT INTO tg.public.type_pet
VALUES ('1','Кошки'),
       ('2','Собаки');

INSERT INTO tg.public.shelter
VALUES ('1','Здесь будет информация о приюте..', 'Милые пушистики', 'bot_Botya_bot');

INSERT INTO tg.public.type_pet_documents_list
VALUES ('1', '1'),
       ('1','2'),
       ('1','3'),
       ('2','1');

INSERT INTO tg.public.pet
VALUES ('1','2', null, 'Шарик', 'FREE', '2'),
       ('2','1', null, 'Бобик', 'FREE', '2'),
       ('3','2', null, 'Мурзик', 'FREE', '1');